create table privilege_role(
privilege_id int not null,
role_id int not null,
primary key(privilege_id,role_id),
KEY FK70476C853B7C6692 (role_id),
KEY FK70476C8558D7FED6 (privilege_id),
constraint FK70476C853B7C6692 foreign key(role_id) references role(id),
constraint FK70476C8558D7FED6 foreign key(privilege_id) references privilege(id)
);