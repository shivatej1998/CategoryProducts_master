create database store

use store

create table Categories (
Cid int  PRIMARY KEY auto_increment,
shirts varchar(100),
pants varchar(100),
dresses varchar(100)
);
drop table Categories;
drop table Products;

create table Products(
id int  auto_increment,
name varchar(100),
price varchar(100),
stock varchar(100),
FOREIGN KEY (id) references Categories(Cid)
);

insert into Categories values(
4,
'20',
'30',
'50'
);

insert into Products values (
4,
'shoes',
'2000',
'50'
);

insert into Categories values(
3,
'300',
'280',
'190'
);

insert into Products values (
3,
'bags',
'8000',
'850'
);

SET GLOBAL FOREIGN_KEY_CHECKS=0;

select * from Categories;
select * from Products;