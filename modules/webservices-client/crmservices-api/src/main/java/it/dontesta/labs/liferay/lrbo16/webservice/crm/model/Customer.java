/**
 * 
 */
package it.dontesta.labs.liferay.lrbo16.webservice.crm.model;

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
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [person=").append(person).append(", companyAddressType=").append(companyAddressType)
				.append(", id=").append(id).append("]");
		return builder.toString();
	}

	private PersonType person;
	private CompanyAddressType companyAddressType;
	private String id;
}
