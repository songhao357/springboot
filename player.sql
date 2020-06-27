create table mydb.player
(
	id int auto_increment
		primary key,
	name varchar(32) not null,
	passWord varchar(50) not null,
	nickName varchar(32) not null,
	score int default 0 null,
	constraint name
		unique (name)
)
charset=utf8mb4;

