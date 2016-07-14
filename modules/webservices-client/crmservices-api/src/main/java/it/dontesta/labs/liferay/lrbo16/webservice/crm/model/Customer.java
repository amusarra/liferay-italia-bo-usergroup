/**
 * 
 */
package it.dontesta.labs.liferay.lrbo16.webservice.crm.model;

import java.util.UUID;

/**
 * @author amusarra
 *
 */
public class Customer {

	/**
	 * @return the person
	 */
	public PersonType getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(PersonType person) {
		this.person = person;
	}
	/**
	 * @return the companyAddressType
	 */
	public CompanyAddressType getCompanyAddressType() {
		return companyAddressType;
	}
	/**
	 * @param companyAddressType the companyAddressType to set
	 */
	public void setCompanyAddressType(CompanyAddressType companyAddressType) {
		this.companyAddressType = companyAddressType;
	}
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}
	private PersonType person;
	private CompanyAddressType companyAddressType;
	private UUID id;
}
