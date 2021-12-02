create database springDB;
use springDB;
create table user(
  id int primary key auto_increment not null,
  userName varchar(32) unique not null,
  password varchar(32) not null,
  realName varchar(32) 
);

insert into user(userName, password, realName) values('evilUser', 'evilPassword', 'Ernesto Villacorta');

CREATE USER 'newUser1_'@'localhost' IDENTIFIED BY 'newUser1_';
grant all privileges on springDB . * to 'newUser1_'@'localhost';
flush privileges;





