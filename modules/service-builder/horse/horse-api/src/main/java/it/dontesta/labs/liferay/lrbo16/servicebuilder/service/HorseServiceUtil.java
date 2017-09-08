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

package it.dontesta.labs.liferay.lrbo16.servicebuilder.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Horse. This utility wraps
 * {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.service.impl.HorseServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see HorseService
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.service.base.HorseServiceBaseImpl
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.service.impl.HorseServiceImpl
 * @generated
 */
@ProviderType
public class HorseServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.service.impl.HorseServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse addHorse(
		java.lang.String name, java.lang.String kind, java.lang.String mantle,
		java.lang.String gender, int age) {
		return getService().addHorse(name, kind, mantle, gender, age);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getCurrentHorseByeAge(
		int age) {
		return getService().getCurrentHorseByeAge(age);
	}

	public static java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorses() {
		return getService().getHorses();
	}

	public static java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorsesByName(
		java.lang.String name) {
		return getService().getHorsesByName(name);
	}

	public static HorseService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HorseService, HorseService> _serviceTracker = ServiceTrackerFactory.open(HorseService.class);
}