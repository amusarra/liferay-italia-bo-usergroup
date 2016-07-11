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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HorseLocalService
 * @generated
 */
@ProviderType
public class HorseLocalServiceWrapper implements HorseLocalService,
	ServiceWrapper<HorseLocalService> {
	public HorseLocalServiceWrapper(HorseLocalService horseLocalService) {
		_horseLocalService = horseLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _horseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _horseLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _horseLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _horseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _horseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _horseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of horses.
	*
	* @return the number of horses
	*/
	@Override
	public int getHorsesCount() {
		return _horseLocalService.getHorsesCount();
	}

	/**
	* Adds the horse to the database. Also notifies the appropriate model listeners.
	*
	* @param horse the horse
	* @return the horse that was added
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse addHorse(
		it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse horse) {
		return _horseLocalService.addHorse(horse);
	}

	/**
	* Creates a new horse with the primary key. Does not add the horse to the database.
	*
	* @param horseId the primary key for the new horse
	* @return the new horse
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse createHorse(
		long horseId) {
		return _horseLocalService.createHorse(horseId);
	}

	/**
	* Deletes the horse from the database. Also notifies the appropriate model listeners.
	*
	* @param horse the horse
	* @return the horse that was removed
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse deleteHorse(
		it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse horse) {
		return _horseLocalService.deleteHorse(horse);
	}

	/**
	* Deletes the horse with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param horseId the primary key of the horse
	* @return the horse that was removed
	* @throws PortalException if a horse with the primary key could not be found
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse deleteHorse(
		long horseId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _horseLocalService.deleteHorse(horseId);
	}

	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse fetchHorse(
		long horseId) {
		return _horseLocalService.fetchHorse(horseId);
	}

	/**
	* Returns the horse matching the UUID and group.
	*
	* @param uuid the horse's UUID
	* @param groupId the primary key of the group
	* @return the matching horse, or <code>null</code> if a matching horse could not be found
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse fetchHorseByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _horseLocalService.fetchHorseByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the horse with the primary key.
	*
	* @param horseId the primary key of the horse
	* @return the horse
	* @throws PortalException if a horse with the primary key could not be found
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse getHorse(
		long horseId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _horseLocalService.getHorse(horseId);
	}

	/**
	* Returns the horse matching the UUID and group.
	*
	* @param uuid the horse's UUID
	* @param groupId the primary key of the group
	* @return the matching horse
	* @throws PortalException if a matching horse could not be found
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse getHorseByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _horseLocalService.getHorseByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the horse in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param horse the horse
	* @return the horse that was updated
	*/
	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse updateHorse(
		it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse horse) {
		return _horseLocalService.updateHorse(horse);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _horseLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _horseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _horseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _horseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the horses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @return the range of horses
	*/
	@Override
	public java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorses(
		int start, int end) {
		return _horseLocalService.getHorses(start, end);
	}

	/**
	* Returns all the horses matching the UUID and company.
	*
	* @param uuid the UUID of the horses
	* @param companyId the primary key of the company
	* @return the matching horses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _horseLocalService.getHorsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of horses matching the UUID and company.
	*
	* @param uuid the UUID of the horses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of horses
	* @param end the upper bound of the range of horses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching horses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorsesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> orderByComparator) {
		return _horseLocalService.getHorsesByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _horseLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _horseLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public HorseLocalService getWrappedService() {
		return _horseLocalService;
	}

	@Override
	public void setWrappedService(HorseLocalService horseLocalService) {
		_horseLocalService = horseLocalService;
	}

	private HorseLocalService _horseLocalService;
}