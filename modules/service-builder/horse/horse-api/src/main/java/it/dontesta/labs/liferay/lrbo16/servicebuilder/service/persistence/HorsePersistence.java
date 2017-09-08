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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.dontesta.labs.liferay.lrbo16.servicebuilder.exception.NoSuchHorseException;
import it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse;

/**
 * The persistence interface for the horse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.service.persistence.impl.HorsePersistenceImpl
 * @see HorseUtil
 * @generated
 */
@ProviderType
public interface HorsePersistence extends BasePersistence<Horse> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HorseUtil} to access the horse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the horses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching horses
	*/
	public java.util.List<Horse> findByUuid(java.lang.String uuid);

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
	public java.util.List<Horse> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Horse> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

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
	public java.util.List<Horse> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the first horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the last horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the last horse in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the horses before and after the current horse in the ordered set where uuid = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public Horse[] findByUuid_PrevAndNext(long horseId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Removes all the horses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of horses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching horses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHorseException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHorseException;

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the horse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the horse where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the horse that was removed
	*/
	public Horse removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHorseException;

	/**
	* Returns the number of horses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching horses
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the horses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching horses
	*/
	public java.util.List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

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
	public java.util.List<Horse> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the first horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the last horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the last horse in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

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
	public Horse[] findByUuid_C_PrevAndNext(long horseId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Removes all the horses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of horses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching horses
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the horses where name = &#63;.
	*
	* @param name the name
	* @return the matching horses
	*/
	public java.util.List<Horse> findByName(java.lang.String name);

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
	public java.util.List<Horse> findByName(java.lang.String name, int start,
		int end);

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
	public java.util.List<Horse> findByName(java.lang.String name, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

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
	public java.util.List<Horse> findByName(java.lang.String name, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the first horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the last horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the last horse in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the horses before and after the current horse in the ordered set where name = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public Horse[] findByName_PrevAndNext(long horseId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Removes all the horses where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of horses where name = &#63;.
	*
	* @param name the name
	* @return the number of matching horses
	*/
	public int countByName(java.lang.String name);

	/**
	* Returns all the horses where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @return the matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long horseId);

	/**
	* Returns a range of all the horses where horseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseId the horse ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long horseId, int start, int end);

	/**
	* Returns an ordered range of all the horses where horseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseId the horse ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long horseId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns an ordered range of all the horses where horseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseId the horse ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long horseId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first horse in the ordered set where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByHorseIds_First(long horseId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the first horse in the ordered set where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByHorseIds_First(long horseId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the last horse in the ordered set where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByHorseIds_Last(long horseId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the last horse in the ordered set where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByHorseIds_Last(long horseId,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns all the horses where horseId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseIds the horse IDs
	* @return the matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long[] horseIds);

	/**
	* Returns a range of all the horses where horseId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseIds the horse IDs
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long[] horseIds, int start,
		int end);

	/**
	* Returns an ordered range of all the horses where horseId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseIds the horse IDs
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long[] horseIds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns an ordered range of all the horses where horseId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param horseId the horse ID
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByHorseIds(long[] horseIds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the horses where horseId = &#63; from the database.
	*
	* @param horseId the horse ID
	*/
	public void removeByHorseIds(long horseId);

	/**
	* Returns the number of horses where horseId = &#63;.
	*
	* @param horseId the horse ID
	* @return the number of matching horses
	*/
	public int countByHorseIds(long horseId);

	/**
	* Returns the number of horses where horseId = any &#63;.
	*
	* @param horseIds the horse IDs
	* @return the number of matching horses
	*/
	public int countByHorseIds(long[] horseIds);

	/**
	* Returns all the horses where age = &#63;.
	*
	* @param age the age
	* @return the matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int age);

	/**
	* Returns a range of all the horses where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int age,
		int start, int end);

	/**
	* Returns an ordered range of all the horses where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int age,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns an ordered range of all the horses where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int age,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first horse in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByAgeAndCurrentCreateDate_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the first horse in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByAgeAndCurrentCreateDate_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the last horse in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse
	* @throws NoSuchHorseException if a matching horse could not be found
	*/
	public Horse findByAgeAndCurrentCreateDate_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns the last horse in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching horse, or <code>null</code> if a matching horse could not be found
	*/
	public Horse fetchByAgeAndCurrentCreateDate_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns the horses before and after the current horse in the ordered set where age = &#63;.
	*
	* @param horseId the primary key of the current horse
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public Horse[] findByAgeAndCurrentCreateDate_PrevAndNext(long horseId,
		int age,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator)
		throws NoSuchHorseException;

	/**
	* Returns all the horses where age = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ages the ages
	* @return the matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int[] ages);

	/**
	* Returns a range of all the horses where age = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ages the ages
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int[] ages,
		int start, int end);

	/**
	* Returns an ordered range of all the horses where age = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ages the ages
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int[] ages,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

	/**
	* Returns an ordered range of all the horses where age = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching horses
	*/
	public java.util.List<Horse> findByAgeAndCurrentCreateDate(int[] ages,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the horses where age = &#63; from the database.
	*
	* @param age the age
	*/
	public void removeByAgeAndCurrentCreateDate(int age);

	/**
	* Returns the number of horses where age = &#63;.
	*
	* @param age the age
	* @return the number of matching horses
	*/
	public int countByAgeAndCurrentCreateDate(int age);

	/**
	* Returns the number of horses where age = any &#63;.
	*
	* @param ages the ages
	* @return the number of matching horses
	*/
	public int countByAgeAndCurrentCreateDate(int[] ages);

	/**
	* Caches the horse in the entity cache if it is enabled.
	*
	* @param horse the horse
	*/
	public void cacheResult(Horse horse);

	/**
	* Caches the horses in the entity cache if it is enabled.
	*
	* @param horses the horses
	*/
	public void cacheResult(java.util.List<Horse> horses);

	/**
	* Creates a new horse with the primary key. Does not add the horse to the database.
	*
	* @param horseId the primary key for the new horse
	* @return the new horse
	*/
	public Horse create(long horseId);

	/**
	* Removes the horse with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param horseId the primary key of the horse
	* @return the horse that was removed
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public Horse remove(long horseId) throws NoSuchHorseException;

	public Horse updateImpl(Horse horse);

	/**
	* Returns the horse with the primary key or throws a {@link NoSuchHorseException} if it could not be found.
	*
	* @param horseId the primary key of the horse
	* @return the horse
	* @throws NoSuchHorseException if a horse with the primary key could not be found
	*/
	public Horse findByPrimaryKey(long horseId) throws NoSuchHorseException;

	/**
	* Returns the horse with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param horseId the primary key of the horse
	* @return the horse, or <code>null</code> if a horse with the primary key could not be found
	*/
	public Horse fetchByPrimaryKey(long horseId);

	@Override
	public java.util.Map<java.io.Serializable, Horse> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the horses.
	*
	* @return the horses
	*/
	public java.util.List<Horse> findAll();

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
	public java.util.List<Horse> findAll(int start, int end);

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
	public java.util.List<Horse> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator);

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
	public java.util.List<Horse> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horse> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the horses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of horses.
	*
	* @return the number of horses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}