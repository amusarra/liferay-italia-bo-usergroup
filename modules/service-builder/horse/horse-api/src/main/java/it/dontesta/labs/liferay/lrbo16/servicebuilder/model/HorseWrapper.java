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

package it.dontesta.labs.liferay.lrbo16.servicebuilder.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Horse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Horse
 * @generated
 */
@ProviderType
public class HorseWrapper implements Horse, ModelWrapper<Horse> {
	public HorseWrapper(Horse horse) {
		_horse = horse;
	}

	@Override
	public Class<?> getModelClass() {
		return Horse.class;
	}

	@Override
	public String getModelClassName() {
		return Horse.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("horseId", getHorseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("age", getAge());
		attributes.put("gender", getGender());
		attributes.put("kind", getKind());
		attributes.put("mantle", getMantle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long horseId = (Long)attributes.get("horseId");

		if (horseId != null) {
			setHorseId(horseId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String kind = (String)attributes.get("kind");

		if (kind != null) {
			setKind(kind);
		}

		String mantle = (String)attributes.get("mantle");

		if (mantle != null) {
			setMantle(mantle);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _horse.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _horse.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _horse.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _horse.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> toCacheModel() {
		return _horse.toCacheModel();
	}

	@Override
	public int compareTo(
		it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse horse) {
		return _horse.compareTo(horse);
	}

	/**
	* Returns the age of this horse.
	*
	* @return the age of this horse
	*/
	@Override
	public int getAge() {
		return _horse.getAge();
	}

	@Override
	public int hashCode() {
		return _horse.hashCode();
	}

	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse toEscapedModel() {
		return new HorseWrapper(_horse.toEscapedModel());
	}

	@Override
	public it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse toUnescapedModel() {
		return new HorseWrapper(_horse.toUnescapedModel());
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _horse.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HorseWrapper((Horse)_horse.clone());
	}

	/**
	* Returns the gender of this horse.
	*
	* @return the gender of this horse
	*/
	@Override
	public java.lang.String getGender() {
		return _horse.getGender();
	}

	/**
	* Returns the kind of this horse.
	*
	* @return the kind of this horse
	*/
	@Override
	public java.lang.String getKind() {
		return _horse.getKind();
	}

	/**
	* Returns the mantle of this horse.
	*
	* @return the mantle of this horse
	*/
	@Override
	public java.lang.String getMantle() {
		return _horse.getMantle();
	}

	/**
	* Returns the name of this horse.
	*
	* @return the name of this horse
	*/
	@Override
	public java.lang.String getName() {
		return _horse.getName();
	}

	/**
	* Returns the user name of this horse.
	*
	* @return the user name of this horse
	*/
	@Override
	public java.lang.String getUserName() {
		return _horse.getUserName();
	}

	/**
	* Returns the user uuid of this horse.
	*
	* @return the user uuid of this horse
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _horse.getUserUuid();
	}

	/**
	* Returns the uuid of this horse.
	*
	* @return the uuid of this horse
	*/
	@Override
	public java.lang.String getUuid() {
		return _horse.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _horse.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _horse.toXmlString();
	}

	/**
	* Returns the create date of this horse.
	*
	* @return the create date of this horse
	*/
	@Override
	public Date getCreateDate() {
		return _horse.getCreateDate();
	}

	/**
	* Returns the modified date of this horse.
	*
	* @return the modified date of this horse
	*/
	@Override
	public Date getModifiedDate() {
		return _horse.getModifiedDate();
	}

	/**
	* Returns the company ID of this horse.
	*
	* @return the company ID of this horse
	*/
	@Override
	public long getCompanyId() {
		return _horse.getCompanyId();
	}

	/**
	* Returns the group ID of this horse.
	*
	* @return the group ID of this horse
	*/
	@Override
	public long getGroupId() {
		return _horse.getGroupId();
	}

	/**
	* Returns the horse ID of this horse.
	*
	* @return the horse ID of this horse
	*/
	@Override
	public long getHorseId() {
		return _horse.getHorseId();
	}

	/**
	* Returns the primary key of this horse.
	*
	* @return the primary key of this horse
	*/
	@Override
	public long getPrimaryKey() {
		return _horse.getPrimaryKey();
	}

	/**
	* Returns the user ID of this horse.
	*
	* @return the user ID of this horse
	*/
	@Override
	public long getUserId() {
		return _horse.getUserId();
	}

	@Override
	public void persist() {
		_horse.persist();
	}

	/**
	* Sets the age of this horse.
	*
	* @param age the age of this horse
	*/
	@Override
	public void setAge(int age) {
		_horse.setAge(age);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_horse.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this horse.
	*
	* @param companyId the company ID of this horse
	*/
	@Override
	public void setCompanyId(long companyId) {
		_horse.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this horse.
	*
	* @param createDate the create date of this horse
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_horse.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_horse.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_horse.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_horse.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the gender of this horse.
	*
	* @param gender the gender of this horse
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_horse.setGender(gender);
	}

	/**
	* Sets the group ID of this horse.
	*
	* @param groupId the group ID of this horse
	*/
	@Override
	public void setGroupId(long groupId) {
		_horse.setGroupId(groupId);
	}

	/**
	* Sets the horse ID of this horse.
	*
	* @param horseId the horse ID of this horse
	*/
	@Override
	public void setHorseId(long horseId) {
		_horse.setHorseId(horseId);
	}

	/**
	* Sets the kind of this horse.
	*
	* @param kind the kind of this horse
	*/
	@Override
	public void setKind(java.lang.String kind) {
		_horse.setKind(kind);
	}

	/**
	* Sets the mantle of this horse.
	*
	* @param mantle the mantle of this horse
	*/
	@Override
	public void setMantle(java.lang.String mantle) {
		_horse.setMantle(mantle);
	}

	/**
	* Sets the modified date of this horse.
	*
	* @param modifiedDate the modified date of this horse
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_horse.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this horse.
	*
	* @param name the name of this horse
	*/
	@Override
	public void setName(java.lang.String name) {
		_horse.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_horse.setNew(n);
	}

	/**
	* Sets the primary key of this horse.
	*
	* @param primaryKey the primary key of this horse
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_horse.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_horse.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this horse.
	*
	* @param userId the user ID of this horse
	*/
	@Override
	public void setUserId(long userId) {
		_horse.setUserId(userId);
	}

	/**
	* Sets the user name of this horse.
	*
	* @param userName the user name of this horse
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_horse.setUserName(userName);
	}

	/**
	* Sets the user uuid of this horse.
	*
	* @param userUuid the user uuid of this horse
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_horse.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this horse.
	*
	* @param uuid the uuid of this horse
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_horse.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HorseWrapper)) {
			return false;
		}

		HorseWrapper horseWrapper = (HorseWrapper)obj;

		if (Objects.equals(_horse, horseWrapper._horse)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _horse.getStagedModelType();
	}

	@Override
	public Horse getWrappedModel() {
		return _horse;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _horse.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _horse.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_horse.resetOriginalValues();
	}

	private final Horse _horse;
}