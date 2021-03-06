CREATE TABLE reply(
id int primary key NOT NULL,
title varchar(255) DEFAULT NULL,
content text,
postTime datetime DEFAULT NULL,
ipAddr varchar(50) DEFAULT NULL,
deleted bit(1) DEFAULT NULL,
floor int(11) DEFAULT NULL,
topicID int DEFAULT NULL,
authorID int DEFAULT NULL,
  KEY FK90DF1955AF81E56 (topicID),
  KEY FK6899E4A141601CB290df1955 (authorID),
  CONSTRAINT  FK6899E4A141601CB290df1955  FOREIGN KEY (authorID) REFERENCES  bbs_user (id),
  CONSTRAINT  FK90DF1955AF81E56  FOREIGN KEY (topicID) REFERENCES topic (id)
)