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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.service.http.HorseServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.service.http.HorseServiceSoap
 * @generated
 */
@ProviderType
public class HorseSoap implements Serializable {
	public static HorseSoap toSoapModel(Horse model) {
		HorseSoap soapModel = new HorseSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setHorseId(model.getHorseId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setAge(model.getAge());
		soapModel.setGender(model.getGender());
		soapModel.setKind(model.getKind());
		soapModel.setMantle(model.getMantle());

		return soapModel;
	}

	public static HorseSoap[] toSoapModels(Horse[] models) {
		HorseSoap[] soapModels = new HorseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HorseSoap[][] toSoapModels(Horse[][] models) {
		HorseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HorseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HorseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HorseSoap[] toSoapModels(List<Horse> models) {
		List<HorseSoap> soapModels = new ArrayList<HorseSoap>(models.size());

		for (Horse model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HorseSoap[soapModels.size()]);
	}

	public HorseSoap() {
	}

	public long getPrimaryKey() {
		return _horseId;
	}

	public void setPrimaryKey(long pk) {
		setHorseId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getHorseId() {
		return _horseId;
	}

	public void setHorseId(long horseId) {
		_horseId = horseId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getKind() {
		return _kind;
	}

	public void setKind(String kind) {
		_kind = kind;
	}

	public String getMantle() {
		return _mantle;
	}

	public void setMantle(String mantle) {
		_mantle = mantle;
	}

	private String _uuid;
	private long _horseId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private int _age;
	private String _gender;
	private String _kind;
	private String _mantle;
}