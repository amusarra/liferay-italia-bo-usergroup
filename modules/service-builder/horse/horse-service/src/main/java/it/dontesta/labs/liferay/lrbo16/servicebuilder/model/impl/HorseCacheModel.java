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

package it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Horse in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Horse
 * @generated
 */
@ProviderType
public class HorseCacheModel implements CacheModel<Horse>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HorseCacheModel)) {
			return false;
		}

		HorseCacheModel horseCacheModel = (HorseCacheModel)obj;

		if (horseId == horseCacheModel.horseId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, horseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", horseId=");
		sb.append(horseId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", kind=");
		sb.append(kind);
		sb.append(", mantle=");
		sb.append(mantle);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Horse toEntityModel() {
		HorseImpl horseImpl = new HorseImpl();

		if (uuid == null) {
			horseImpl.setUuid(StringPool.BLANK);
		}
		else {
			horseImpl.setUuid(uuid);
		}

		horseImpl.setHorseId(horseId);
		horseImpl.setGroupId(groupId);
		horseImpl.setCompanyId(companyId);
		horseImpl.setUserId(userId);

		if (userName == null) {
			horseImpl.setUserName(StringPool.BLANK);
		}
		else {
			horseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			horseImpl.setCreateDate(null);
		}
		else {
			horseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			horseImpl.setModifiedDate(null);
		}
		else {
			horseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			horseImpl.setName(StringPool.BLANK);
		}
		else {
			horseImpl.setName(name);
		}

		horseImpl.setAge(age);

		if (gender == null) {
			horseImpl.setGender(StringPool.BLANK);
		}
		else {
			horseImpl.setGender(gender);
		}

		if (kind == null) {
			horseImpl.setKind(StringPool.BLANK);
		}
		else {
			horseImpl.setKind(kind);
		}

		if (mantle == null) {
			horseImpl.setMantle(StringPool.BLANK);
		}
		else {
			horseImpl.setMantle(mantle);
		}

		horseImpl.resetOriginalValues();

		return horseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		horseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		age = objectInput.readInt();
		gender = objectInput.readUTF();
		kind = objectInput.readUTF();
		mantle = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(horseId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(age);

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (kind == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kind);
		}

		if (mantle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mantle);
		}
	}

	public String uuid;
	public long horseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int age;
	public String gender;
	public String kind;
	public String mantle;
}