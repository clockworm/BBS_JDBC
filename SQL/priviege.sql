create table privilege(
id varchar(255) primary key not null,
name varchar(255) default null,
action varchar(64) default null,
resource varchar(64) default null
);