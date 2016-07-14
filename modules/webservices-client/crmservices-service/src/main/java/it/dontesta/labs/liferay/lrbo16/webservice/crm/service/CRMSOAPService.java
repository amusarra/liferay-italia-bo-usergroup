package it.dontesta.labs.liferay.lrbo16.webservice.crm.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.predic8.common._1.AddressType;
import com.predic8.common._1.PersonType;
import com.predic8.crm._1.CompanyAddressType;
import com.predic8.crm._1.CustomerType;
import com.predic8.wsdl.crm.crmservice._1.CRMServicePT;

import aQute.bnd.annotation.ProviderType;
import aQute.bnd.annotation.metatype.Configurable;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.api.CRMService;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.exception.CRMServiceException;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.model.Customer;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.service.configuration.CRMSOAPServiceConfiguration;

/**
 * 
 * @author amusarra
 *
 */
@Component(
		configurationPid="it.dontesta.labs.liferay.lrbo16.webservice.crm.service.configuration.CRMSOAPServiceConfiguration",
		immediate = true,
		property = {},
		service = CRMService.class
		)
@ProviderType
public class CRMSOAPService implements CRMService {

	@Override
	public Customer createCustomer(Customer customer) throws CRMServiceException {
		if (Validator.isNotNull(crmService)) {
			try {
				CustomerType customerType = new CustomerType();
				customerType.setId(customer.getId());
				
				PersonType personType = new PersonType();
				personType.setFirstName(customer.getPerson().getFirstName());
				personType.setLastName(customer.getPerson().getLastName());
				personType.setAge(BigInteger.valueOf(customer.getPerson().getAge()));
				
				AddressType addressType = new AddressType();
				addressType.setCity(customer.getPerson().getAddress().getCity());
				addressType.setCountry(customer.getPerson().getAddress().getCountry());
				addressType.setStreet(customer.getPerson().getAddress().getStreet());
				addressType.setZipCode(customer.getPerson().getAddress().getZipCode());
				
				personType.setAddress(addressType);
				customerType.setPerson(personType);
				
				CompanyAddressType companyAddressType = new CompanyAddressType();
				companyAddressType.setCompanyName(customer.getCompanyAddressType().getCompanyName());
				customerType.setAddress(companyAddressType);
				
				crmService.create(customerType);
				
				return customer;
			} catch (WebServiceException e) {
				if (_log.isErrorEnabled()) {
					_log.error(e);
				}
				throw new CRMServiceException(e);
			}
		} else {
			throw new CRMServiceException("The CRMService is null!");
		}
	}

	@Override
	public Customer getCustomer(String customerId) throws CRMServiceException {
		if (Validator.isNotNull(crmService)) {
			CustomerType customerType;
			
			try {
				customerType = crmService.get(customerId);

				Customer customer = new Customer();
				customer.setId(customerType.getId());
				
				it.dontesta.labs.liferay.lrbo16.webservice.crm.model.PersonType person = 
						new it.dontesta.labs.liferay.lrbo16.webservice.crm.model.PersonType();
				person.setFirstName(customerType.getPerson().getFirstName());
				person.setLastName(customerType.getPerson().getLastName());
				person.setAge(customerType.getPerson().getAge().intValue());
				person.setId(customerType.getId());

				it.dontesta.labs.liferay.lrbo16.webservice.crm.model.AddressType addressType = 
						new it.dontesta.labs.liferay.lrbo16.webservice.crm.model.AddressType();
				addressType.setCity(customerType.getPerson().getAddress().getCity());
				addressType.setCountry(customerType.getPerson().getAddress().getCountry());
				addressType.setStreet(customerType.getPerson().getAddress().getStreet());
				addressType.setZipCode(customerType.getPerson().getAddress().getZipCode());
				person.setAddress(addressType);
				customer.setPerson(person);
				
				it.dontesta.labs.liferay.lrbo16.webservice.crm.model.CompanyAddressType companyAddressType = 
						new it.dontesta.labs.liferay.lrbo16.webservice.crm.model.CompanyAddressType();
				companyAddressType.setCompanyName(customerType.getAddress().getCompanyName());
				customer.setCompanyAddressType(companyAddressType);
				
				return customer;
			} catch (WebServiceException e) {
				if (_log.isErrorEnabled()) {
					_log.error(e);
				}
				throw new CRMServiceException(e);
			}
			
		} else {
			throw new CRMServiceException("The CRMService is null!");
		}
	}

	@Override
	public List<Customer> getCustomers() throws CRMServiceException {
		throw new CRMServiceException("The be implement!");
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCRMServiceSOAPEndPoint() {
		return _configuration.crmServiceSOAPEndPoint();
	}
	
	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		_configuration = Configurable.createConfigurable(
				CRMSOAPServiceConfiguration.class, properties);
		
		if (_log.isInfoEnabled()) {
			_log.info("Configured SOAP EndPoint : { "
					+ getCRMServiceSOAPEndPoint()
					+ " }");
		}
		
		setCRMService();
		
	}
	
	/**
	 * 
	 * @return
	 */
	private void setCRMService() {

		try {
			JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
			proxyFactory.setServiceClass(CRMServicePT.class);
			proxyFactory.setServiceName(new QName("http://predic8.com/wsdl/crm/CRMService/1/"));
			proxyFactory.setAddress(getCRMServiceSOAPEndPoint());
			
			CRMServicePT crmServicePT = (CRMServicePT)proxyFactory.create();
			crmService = crmServicePT;
			
		} catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error(e);
			}
		}
		
	}

	private CRMServicePT crmService;
	private volatile CRMSOAPServiceConfiguration _configuration;
	private static Log _log = LogFactoryUtil.getLog(CRMSOAPService.class);
}