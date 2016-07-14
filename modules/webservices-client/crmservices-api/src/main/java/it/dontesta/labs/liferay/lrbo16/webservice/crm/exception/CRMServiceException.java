/**
 * 
 */
package it.dontesta.labs.liferay.lrbo16.webservice.crm.exception;

/**
 * @author amusarra
 *
 */
public class CRMServiceException extends Exception {

	private static final long serialVersionUID = -1900013084408070733L;

	public CRMServiceException() {
		super();
	}

	public CRMServiceException(String message) {
		super(message);
	}

	public CRMServiceException(Throwable cause) {
        super(cause);
    }
}
