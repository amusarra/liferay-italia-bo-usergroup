package it.dontesta.labs.liferay.lrbo16.webservice.crm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
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
			CustomerType customerType = new CustomerType();
			crmService.create(customerType);
			
			return customer;
		} else {
			throw new CRMServiceException("The CRMService is null!");
		}
	}

	@Override
	public Customer getCustomer(String customerId) throws CRMServiceException {
		if (Validator.isNotNull(crmService)) {
			CustomerType customerType;
			customerType = crmService.get(customerId);
			
			Customer customer = new Customer();
			return customer;
		} else {
			throw new CRMServiceException("The CRMService is null!");
		}
	}

	@Override
	public List<Customer> getCustomers() throws CRMServiceException {
		if (Validator.isNotNull(crmService)) {
			List<CustomerType> customerType;
			customerType = crmService.getAll();
			
			List<Customer> customerList = new ArrayList<>();
			return customerList;
		} else {
			throw new CRMServiceException("The CRMService is null!");
		}
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