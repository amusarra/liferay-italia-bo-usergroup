package it.dontesta.labs.liferay.lrbo16.portal.events;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PropsKeys;

/**
 * @author Antonio Musarra
 */
@Component(
		immediate = true, property = {"key=" + PropsKeys.LOGOUT_EVENTS_PRE}, 
		service = LifecycleAction.class)
public class LogoutPreAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent)
			throws ActionException {
		
		if (_log.isInfoEnabled()) {
			_log.info("logout.event.pre=" + lifecycleEvent);
		}
		
		try {
			User user = _portal.getUser(lifecycleEvent.getRequest());
			
			if (_log.isInfoEnabled()) {
				_log.info("UserId:" + user.getUserId());
			}

		} catch (Exception e) {
			throw new ActionException(e);
		}
	}
	
	@Reference(unbind = "-")
	protected void setPortal(Portal portal) {
		_portal = portal;
	}
	
	private Portal _portal;
	private static final Log _log = LogFactoryUtil.getLog(LogoutPreAction.class);

}