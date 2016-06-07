create table fornum(
id int primary key not null,
name varchar(255) default null,
description varchar(255) default null,
order_ int default null,
topicCount int default 0,
articleCount int default 0,
lastTopicID int default null,
lastArticePostTime datetime default null,
categoryID int default null,
KEY FK903A938CA091BAEC (lastTopicID),
KEY FK903A938CCE73292 (categoryid),
constraint FK903A938CA091BAEC foreign key(lastTopicID) references bbs_user(id),
constraint FK903A938CCE73292 foreign key(categoryID) references category(id));
