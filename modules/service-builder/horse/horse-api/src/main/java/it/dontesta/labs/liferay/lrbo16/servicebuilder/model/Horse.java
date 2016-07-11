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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Horse service. Represents a row in the &quot;LRBO_HORSE_Horse&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HorseModel
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseImpl
 * @see it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseModelImpl
 * @generated
 */
@ImplementationClassName("it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseImpl")
@ProviderType
public interface Horse extends HorseModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link it.dontesta.labs.liferay.lrbo16.servicebuilder.model.impl.HorseImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Horse, Long> HORSE_ID_ACCESSOR = new Accessor<Horse, Long>() {
			@Override
			public Long get(Horse horse) {
				return horse.getHorseId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Horse> getTypeClass() {
				return Horse.class;
			}
		};
}