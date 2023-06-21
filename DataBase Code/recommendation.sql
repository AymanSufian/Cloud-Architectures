
create database recommendation_db1 ;


create table recommendations (
id int primary key auto_increment ,
product_name varchar(255),
requirement varchar(255),
reason varchar(255),
r_memory varchar(255),
r_storage varchar(255),
bandwidth varchar(255),
scalability varchar(255),
reliability varchar(255),
latency varchar(255)
);

select * from recommendations;
