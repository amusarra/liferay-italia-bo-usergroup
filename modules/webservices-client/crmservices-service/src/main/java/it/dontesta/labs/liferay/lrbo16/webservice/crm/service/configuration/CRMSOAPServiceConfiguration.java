/**
 * 
 */
package it.dontesta.labs.liferay.lrbo16.webservice.crm.service.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author amusarra
 *
 */
@ExtendedObjectClassDefinition(category = "LRBO16 Configuration")
@Meta.OCD(
		id = "it.dontesta.labs.liferay.lrbo16.webservice.crm.service.configuration.CRMSOAPServiceConfiguration",
		localization = "content/Language",
		name = "crm.services.configuration.name"
	)
public interface CRMSOAPServiceConfiguration {
	@Meta.AD(
			deflt = "http://www.predic8.com:8080/crm/CustomerService", 
			description = "Setting SOAP Web Service EndPoint",
			required = false
		)
		public String crmServiceSOAPEndPoint();
}
