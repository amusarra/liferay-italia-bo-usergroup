/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.dontesta.labs.liferay.lrbo16.servicebuilder.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import it.dontesta.labs.liferay.lrbo16.servicebuilder.service.HorseServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link HorseServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap}.
 * If the method in the service utility returns a
 * {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse}, that is translated to a
 * {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorseServiceHttp
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap
 * @see HorseServiceUtil
 * @generated
 */
@ProviderType
public class HorseServiceSoap {
	public static it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap[] getHorses()
		throws RemoteException {
		try {
			java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> returnValue =
				HorseServiceUtil.getHorses();

			return it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap[] getHorsesByName(
		java.lang.String name) throws RemoteException {
		try {
			java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> returnValue =
				HorseServiceUtil.getHorsesByName(name);

			return it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Add a new Horse
	*
	* @param name
	* @param kind
	* @param mantle
	* @param gender
	* @param age
	* @return
	*/
	public static it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap addHorse(
		java.lang.String name, java.lang.String kind, java.lang.String mantle,
		java.lang.String gender, int age) throws RemoteException {
		try {
			it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse returnValue =
				HorseServiceUtil.addHorse(name, kind, mantle, gender, age);

			return it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap[] getCurrentHorseByeAge(
		int age) throws RemoteException {
		try {
			java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> returnValue =
				HorseServiceUtil.getCurrentHorseByeAge(age);

			return it.dontesta.labs.liferay.lrbo16.servicebuilder.model.HorseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(HorseServiceSoap.class);
}