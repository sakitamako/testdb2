drop database if exists testdb2;
create database testdb2;
use testdb2;

create table test2_table(
user_id int,
user_name varchar(255),
password varchar(255));

insert into test2_table values(1, "taro", "123");
insert into test2_table values(2, "jiro", "456");
insert into test2_table values(3, "hanako", "789");