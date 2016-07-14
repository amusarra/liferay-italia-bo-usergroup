/**
 * 
 */
package it.dontesta.labs.liferay.lrbo16.webservice.crm.model;

/**
 * @author amusarra
 *
 */
public class CompanyAddressType extends AddressType{
	private String companyName;

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanyAddressType [companyName=").append(companyName).append("]");
		return builder.toString();
	}
	
	
}
