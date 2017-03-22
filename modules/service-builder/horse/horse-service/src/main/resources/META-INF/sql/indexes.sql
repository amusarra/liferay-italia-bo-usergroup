create index IX_1CD9D1BA on LRBO_HORSE_Horse (age);
create index IX_943F5AD4 on LRBO_HORSE_Horse (name[$COLUMN_LENGTH:75$]);
create index IX_12A69589 on LRBO_HORSE_Horse (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_16B8EA4B on LRBO_HORSE_Horse (uuid_[$COLUMN_LENGTH:75$], groupId);