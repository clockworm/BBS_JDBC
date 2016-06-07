create table user_role(
userid varchar(30) not null,
roleid varchar(255) not null,
primary key(userid,roleid),
key FK9C95CD553B7C6692 (roleid),
key FK9C95CD55E0A72A72 (userid),
constraint FK9C95CD55E0A72A72 FOREIGN KEY(userid) REFERENCES bbs_user(id),
constraint FK9C95CD553B7C6692 FOREIGN KEY(roleid) REFERENCES role(id)
);