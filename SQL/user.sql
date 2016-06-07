create table bbs_user(
id varchar(30) primary key not null,
username varchar(30) not null,
password varchar(50) not null,
email varchar(80) default null,
nickname varchar(30) default null,
gender varchar(2) default null,
head_portrait mediumblob,
signature varchar(100) default null,
registrationTime datetime default null,
lastvisitTime datetime default null,
lastvisitIP varchar(25) default null,
topicCount int(11) default 0,
articleCount int(11) default 0,
locked boolean default false,
autologinAuthKey varchar(128) default null
);