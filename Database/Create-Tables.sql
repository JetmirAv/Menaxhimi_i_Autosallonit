create table roles (
id int auto_increment primary key,
name varchar(50) not null,
description Text not null,
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);

create table fueltype (
id int auto_increment primary key,
name varchar(50) not null,
description Text not null,
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);

create table stores (
id int auto_increment primary key,
name varchar(50) not null,
address varchar(50),
city varchar(50),
state varchar(50),
postal varchar(50),
phoneNumber varchar(50),
createdAt datetime default Now(),
updatetimedAt datetime default Now() 
);

create table manufacturer (
id int auto_increment primary key,
name varchar(50) not null,
email varchar(50) not null,
phoneNumber varchar(50),
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);

create table users (
id int auto_increment primary key,
roleId int,
name varchar(50) not null,
surname varchar(50) not null, 
email varchar(50) not null,
password varchar(200) not null,
forgotPwToken varchar(60),  
birthday date,
gendre char,
img varchar(60),
address varchar(50),
city varchar(50),
state varchar(50),
postal varchar(50),
phoneNumber varchar(50),
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (roleId) references roles(id) 
);

create table card (
id int auto_increment primary key,
userId int, 
number varchar(30) not null,
expMonth int not null,
expYear int not null,
code int,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (userId) references users(id)
);


create table car (
id int auto_increment primary key,
manufacturerId int,
model varchar(50) not null,
bodyNumber varchar(50),
yearOfProd int,
seats int,
doors int,
roof boolean,
alarm boolean,
central boolean,
airbag boolean,
autonomus boolean,
navigator boolean,
climate boolean,
fuelTypeId int,
fuelCapacity int,
fuelConsumption double,
hidraulic boolean,
engineModel varchar(50),
enginePower double,
hoursePower int,
maxspeed int,
seconds0to100 double,
isAutomatic boolean,
gears int,
tireModel varchar(50),
tireSize int,
additionalDesc text,
is4x4 boolean,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key(manufacturerId) references manufacturer(id), 
foreign key(fuelTypeId) references fueltype(id)
);


create table photos (
id int auto_increment primary key,
path varchar(50) not null,
carId int,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key(carId) references car(id)
);


create table stock (
id int auto_increment primary key,
carId int, 
storeId int,
avalible int,
price double,
sale float,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (carId) references car(id),
foreign key (storeId) references stores(id)
);

create table bought (
id int auto_increment primary key,
stockId int, 
userId int,
price double,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (userId) references users(id),
foreign key (stockId) references stock(id)
);
