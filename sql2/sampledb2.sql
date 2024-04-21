drop database if exists sampledb2;
create database sampledb2;
use sampledb2;

create table sample_table(
No int,
name varchar(50),
age int,
password varchar(50));

insert into sample_table values(1, "Yamada", 21, "xxx@yahoo.co.jp");
insert into sample_table values(2, "Sato", 39, "yyy@google.com");
insert into sample_table values(3, "Harada", 44, "zzz@yahoo.co.jp");