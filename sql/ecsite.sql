set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

insert into login_user_transaction(login_id,login_pass,user_name) values("user1","123","testuser1");
insert into login_user_transaction(login_id,login_pass,user_name) values("user2","123","testuser2");
insert into login_user_transaction(login_id,login_pass,user_name) values("user3","123","testuser3");
insert into login_user_transaction(login_id,login_pass,user_name) values("user4","123","testuser4");
insert into login_user_transaction(login_id,login_pass,user_name) values("user5","123","testuser5");
insert into login_user_transaction(login_id,login_pass,user_name) values("user6","123","testuser6");
insert into login_user_transaction(login_id,login_pass,user_name) values("user7","123","testuser7");
insert into login_user_transaction(login_id,login_pass,user_name) values("user8","123","testuser8");
insert into login_user_transaction(login_id,login_pass,user_name) values("user9","123","testuser9");
insert into login_user_transaction(login_id,login_pass,user_name) values("user10","123","testuser10");

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

insert into item_info_transaction(item_name,item_price,item_stock) values("NoteBook",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("TV",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("Persoonal Computer",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("Mouse",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("Key Board",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("Mouse Pad",100,100);
insert into item_info_transaction(item_name,item_price,item_stock) values("Toaster",100,100);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);
