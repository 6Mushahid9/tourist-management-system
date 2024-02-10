create database travelSystem;
show databases;
use travelSystem;
create table sign(username varchar(20), password varchar(20), question varchar(50), answer varchar(20));
select * from sign;
delete from sign where username = '';
create table userDetail(username varchar(20), id varchar(20), number varchar(15), gender varchar(6), country varchar(30), address varchar(30), phone varchar(10), email varchar(30));
select * from userDetail;
show tables;
