create table Roles (
id int auto_increment primary key,
name varchar(50) not null,
description Text not null,
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);


create table fuelType (
id int auto_increment primary key,
name varchar(50) not null,
description Text not null,
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);


create table Stores (
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

create table Manufacturer (
id int auto_increment primary key,
name varchar(50) not null,
email varchar(50) not null,
phoneNumber varchar(50),
createdAt datetime default Now(),
updatetimedAt datetime default Now()
);

create table Users (
id int auto_increment primary key,
roleId int,
name varchar(50) not null,
surname varchar(50) not null, 
email varchar(50) not null,
password varchar(200) not null,
birthday date,
gendre char,
img varchar,
address varchar(50),
city varchar(50),
state varchar(50),
postal varchar(50),
phoneNumber varchar(50),
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (roleId) references Roles(id) 
);

create table Card (
id int auto_increment primary key,
userId int, 
number varchar(30) not null,
expMonth int not null,
expYear int not null,
code int,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (userId) references Users(id)
);

create table Car (
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
foreign key(manufacturerId) references Manufacturer(id), 
foreign key(fuelTypeId) references fuelType(id)
);

create table Photos (
id int auto_increment primary key,
path varchar(50) not null,
carId int,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key(carId) references Car(id)
);

create table Stock (
id int auto_increment primary key,
carId int, 
storeId int,
avalible int,
price double,
isSale boolean,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (carId) references Car(id),
foreign key (storeId) references Stores(id)
);

create table Bought (
id int auto_increment primary key,
stockId int, 
userId int,
price double,
createdAt datetime default Now(),
updatetimedAt datetime default Now(),
foreign key (userId) references Users(id),
foreign key (stockId) references Stock(id)
);

