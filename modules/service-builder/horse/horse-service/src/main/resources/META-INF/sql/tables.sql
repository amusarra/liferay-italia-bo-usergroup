create table LRBO_HORSE_Horse (
	uuid_ VARCHAR(75) null,
	horseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	age INTEGER,
	gender VARCHAR(75) null,
	kind VARCHAR(75) null,
	mantle VARCHAR(75) null
);