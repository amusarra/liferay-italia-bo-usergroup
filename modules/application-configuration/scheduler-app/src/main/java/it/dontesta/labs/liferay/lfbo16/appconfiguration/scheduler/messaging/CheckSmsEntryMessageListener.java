package it.dontesta.labs.liferay.lfbo16.appconfiguration.scheduler.messaging;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;

import aQute.bnd.annotation.metatype.Configurable;
import it.dontesta.labs.liferay.lfbo16.appconfiguration.scheduler.configuration.SendNotificationWebListenerConfiguration;
import it.dontesta.labs.liferay.lrbo16.service.horse.HorseService;

@Component(
		configurationPid = "it.dontesta.labs.liferay.lfbo16.appconfiguration.scheduler.configuration.SendNotificationWebListenerConfiguration",
		immediate = true, 
		service = CheckSmsEntryMessageListener.class)
public class CheckSmsEntryMessageListener
	extends BaseSchedulerEntryMessageListener {

	@Activate
    @Modified
	protected void activate(Map<String, Object> properties) {
		_configuration = Configurable.createConfigurable(
				SendNotificationWebListenerConfiguration.class, properties);

		if (_log.isInfoEnabled()) {
			_log.info("checkSmsEntryMessageListenerCronExpression Setting => " + getCheckSmsEntryMessageListenerCronExpression());
		}

		schedulerEntryImpl.setTrigger(
			TriggerFactoryUtil.createTrigger(
				getEventListenerClass(), getEventListenerGroupName(),
				getCheckSmsEntryMessageListenerCronExpression()));

		_schedulerEngineHelper.register(
			this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	private String getEventListenerGroupName() {
		return _eventListenerGroupName;
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		if (_log.isInfoEnabled()) {
			_log.info("Inside doReceive()...");
			_log.info("Horse start to " + _horseService.gallop());
			_log.info("Horse stopped " + _horseService.stop());
		}
	}

	@Reference(unbind = "-")
	protected void setHorseService(
			HorseService horseService) {

		_horseService = horseService;
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(
		ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(
		SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private String getCheckSmsEntryMessageListenerCronExpression() {
		return _configuration.checkSmsEntryMessageListenerCronExpression();
	}

	private volatile SendNotificationWebListenerConfiguration _configuration;
	private static String _eventListenerGroupName = "ADR Notification";
	private static final Log _log = LogFactoryUtil.getLog(CheckSmsEntryMessageListener.class);
	private HorseService _horseService;
	private SchedulerEngineHelper _schedulerEngineHelper;

}