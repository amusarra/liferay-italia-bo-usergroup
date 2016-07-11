create index IX_5119258D on LRBOHORSE_Horse (name[$COLUMN_LENGTH:75$]);
create index IX_11D112C2 on LRBOHORSE_Horse (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_66A361C4 on LRBOHORSE_Horse (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_943F5AD4 on LRBO_HORSE_Horse (name[$COLUMN_LENGTH:75$]);
create index IX_12A69589 on LRBO_HORSE_Horse (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_16B8EA4B on LRBO_HORSE_Horse (uuid_[$COLUMN_LENGTH:75$], groupId);