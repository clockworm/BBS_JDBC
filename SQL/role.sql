create table role(
id varchar(255) primary key not null,
name varchar(64) default null,
description varchar(255),
defaultForNewUser bit(1) default null
);