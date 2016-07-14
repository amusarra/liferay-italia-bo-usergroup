package it.dontesta.labs.liferay.lrbo16.webservice.crm.command;


import java.util.UUID;

import javax.xml.ws.WebServiceException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import it.dontesta.labs.liferay.lrbo16.webservice.crm.api.CRMService;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.exception.CRMServiceException;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.model.CompanyAddressType;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.model.Customer;
import it.dontesta.labs.liferay.lrbo16.webservice.crm.model.PersonType;

@Component(
	immediate = true,
	property = {
		"osgi.command.function=createDefaultCustomer",
		"osgi.command.function=getCustomer",
		"osgi.command.function=getCustomers",
		"osgi.command.scope=lfboug"
	},
	service = Object.class
)
public class CRMCustomerServiceCommand {

	/**
	 * 
	 */
	public void createDefaultCustomer() {
		Customer customer = new Customer();
		customer.setId(UUID.randomUUID().toString());
		CompanyAddressType companyAddressType = new CompanyAddressType();
		companyAddressType.setCity("Bronte");
		companyAddressType.setCountry("IT");
		companyAddressType.setStreet("Via Guseppe Verdi 90");
		companyAddressType.setZipCode("95034");
		companyAddressType.setCompanyName("Antonio Musarra's Blog");
		customer.setCompanyAddressType(companyAddressType);
		
		PersonType person = new PersonType();
		person.setAddress(companyAddressType);
		person.setAge(35);
		person.setFirstName("Antonio");
		person.setLastName("Musarra");
		person.setId(UUID.randomUUID().toString());
		customer.setPerson(person);
		
		try {
			Customer newCustomer = 
					crmService.createCustomer(customer);
			
			System.out.println("Customer with id: "
					+ newCustomer.getId()
					+ " created");
			
		} catch (CRMServiceException | WebServiceException e) {
			if (_log.isErrorEnabled()) {
				_log.error(e);
			}
			System.out.println(e);
		}
	}
	
	/**
	 * 
	 * @param customerId
	 */
	public void getCustomer(String customerId) {
		try {
			Customer customer = 
					crmService.getCustomer(customerId);
			
			System.out.println(customer);
		} catch (CRMServiceException | WebServiceException e) {
			if (_log.isErrorEnabled()) {
				_log.error(e);
			}
			System.out.println(e);
		}
	}
	
	/**
	 * 
	 */
	public void getCustomers() {
		try {
			crmService.getCustomers();
		} catch (CRMServiceException | WebServiceException e) {
			if (_log.isErrorEnabled()) {
				_log.error(e);
			}
			System.out.println(e);
		}
	}
	
	@Reference(policy = ReferencePolicy.DYNAMIC, cardinality = ReferenceCardinality.OPTIONAL)
	protected void setCRMService(CRMService crmService) {
		this.crmService = crmService;
	}

	protected void unsetCRMService(CRMService crmService) {
		this.crmService = null;
	}

	private CRMService crmService;
	private static Log _log = LogFactoryUtil.getLog(CRMCustomerServiceCommand.class);

}