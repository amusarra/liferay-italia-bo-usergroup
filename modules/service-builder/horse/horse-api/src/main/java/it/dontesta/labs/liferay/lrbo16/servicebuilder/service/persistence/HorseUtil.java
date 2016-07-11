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

package it.dontesta.labs.liferay.lrbo16.servicebuilder.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the horse service. This utility wraps {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.service.persistence.impl.HorsePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorsePersistence
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.service.persistence.impl.HorsePersistenceImpl
 * @generated
 */
@ProviderType
public class HorseUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Horse horse) {
		getPersistence().clearCache(horse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Horse> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Horse> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Horse> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Horse> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Horse update(Horse horse) {
		return getPersistence().update(horse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Horse update(Horse horse, ServiceContext serviceContext) {
		return getPersistence().update(horse, serviceContext);
	}

	/**
	* Returns all the horses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching horses
	*/
	public static List<Horse> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the horses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public static List<Horse> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the horses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Horse> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the horses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByUuid_First(java.lang.String uuid,
		OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the horses before and after the current horse in the ordered set where uuid = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public static Horse[] findByUuid_PrevAndNext(long horseId,
		java.lang.String uuid, OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence()
				   .findByUuid_PrevAndNext(horseId, uuid, orderByComparator);
	}

	/**
	* Removes all the horses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of horses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching horses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHorseException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByUUID_G(java.lang.String uuid, long groupId)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the horse where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the horse that was removed
	*/
	public static Horse removeByUUID_G(java.lang.String uuid, long groupId)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of horses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching horses
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the horses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching horses
	*/
	public static List<Horse> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the horses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public static List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the horses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the horses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Horse> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Horse> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Horse> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the horses before and after the current horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public static Horse[] findByUuid_C_PrevAndNext(long horseId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(horseId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the horses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of horses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching horses
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the horses where name = &#63;.
	*
	* @param name the name
	* @return the matching horses
	*/
	public static List<Horse> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the horses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public static List<Horse> findByName(java.lang.String name, int start,
		int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the horses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByName(java.lang.String name, int start,
		int end, OrderByComparator<Horse> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the horses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public static List<Horse> findByName(java.lang.String name, int start,
		int end, OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByName_First(java.lang.String name,
		OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByName_First(java.lang.String name,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public static Horse findByName_Last(java.lang.String name,
		OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public static Horse fetchByName_Last(java.lang.String name,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the horses before and after the current horse in the ordered set where name = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public static Horse[] findByName_PrevAndNext(long horseId,
		java.lang.String name, OrderByComparator<Horse> orderByComparator)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence()
				   .findByName_PrevAndNext(horseId, name, orderByComparator);
	}

	/**
	* Removes all the horses where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of horses where name = &#63;.
	*
	* @param name the name
	* @return the number of matching horses
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the horse in the entity cache if it is enabled.
	*
	* @param horse the horse
	*/
	public static void cacheResult(Horse horse) {
		getPersistence().cacheResult(horse);
	}

	/**
	* Caches the horses in the entity cache if it is enabled.
	*
	* @param horses the horses
	*/
	public static void cacheResult(List<Horse> horses) {
		getPersistence().cacheResult(horses);
	}

	/**
	* Creates a new horse with the primary key. Does not add the horse to the database.
	*
	* @param horseId the primary key for the new horse
	* @return the new horse
	*/
	public static Horse create(long horseId) {
		return getPersistence().create(horseId);
	}

	/**
	* Removes the horse with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param horseId the primary key of the horse
	* @return the horse that was removed
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public static Horse remove(long horseId)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().remove(horseId);
	}

	public static Horse updateImpl(Horse horse) {
		return getPersistence().updateImpl(horse);
	}

	/**
	* Returns the horse with the primary key or throws a {@link NoSuchHorseException} if it could not be found.
	*
	* @param horseId the primary key of the horse
	* @return the horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public static Horse findByPrimaryKey(long horseId)
		throws it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException {
		return getPersistence().findByPrimaryKey(horseId);
	}

	/**
	* Returns the horse with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param horseId the primary key of the horse
	* @return the horse, or <code>null</code> if a horse with the primary key could not be found
	*/
	public static Horse fetchByPrimaryKey(long horseId) {
		return getPersistence().fetchByPrimaryKey(horseId);
	}

	public static java.util.Map<java.io.Serializable, Horse> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the horses.
	*
	* @return the horses
	*/
	public static List<Horse> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the horses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of horses
	*/
	public static List<Horse> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the horses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of horses
	*/
	public static List<Horse> findAll(int start, int end,
		OrderByComparator<Horse> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the horses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of horses
	*/
	public static List<Horse> findAll(int start, int end,
		OrderByComparator<Horse> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the horses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of horses.
	*
	* @return the number of horses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static HorsePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HorsePersistence, HorsePersistence> _serviceTracker =
		ServiceTrackerFactory.open(HorsePersistence.class);
}