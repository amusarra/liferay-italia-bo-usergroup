/**
 * 
 */
package it.dontesta.labs.liferay.lfbo16.appconfiguration.scheduler.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author amusarra
 *
 */
@ExtendedObjectClassDefinition(category = "LRBO16 Configuration")
@Meta.OCD(
		id = "it.dontesta.labs.liferay.lfbo16.appconfiguration.scheduler.configuration.SendNotificationWebListenerConfiguration",
		localization = "content/Language",
		name = "system.web.notification.configuration.name"
	)
public interface SendNotificationWebListenerConfiguration {
	@Meta.AD(
			deflt = "0 0/2 * 1/1 * ? *", 
			description = "Setting Cron Expression for CheckEmailEntryMessageListener (in cron unix pattern)",
			required = false
		)
		public String checkEmailEntryMessageListenerCronExpression();

	@Meta.AD(
			deflt = "0 0/2 * 1/1 * ? *", 
			description = "Setting Cron Expression for CheckSmsEntryMessageListener (in cron unix pattern)",
			required = false
		)
		public String checkSmsEntryMessageListenerCronExpression();
}
