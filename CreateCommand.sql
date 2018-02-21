Create Table Category(
	categoryId int AUTO_INCREMENT,
	categoryName varchar(255) NOT NULL,
	imageAdress varchar(255) NOT NULL,
	PRIMARY KEY (categoryId)
);
Create Table Province(
	provinceId int AUTO_INCREMENT NOT NULL,
	privinceName varchar(255) NOT NULL,
	PRIMARY KEY (provinceId)

);
Create Table District(
	districtId int AUTO_INCREMENT NOT NULL,
	districtName varchar(255) NOT NULL,
	provinceId int NOT NULL,
	PRIMARY KEY (districtId),
	FOREIGN KEY (provinceId) REFERENCE Province (provinceId)
);
Create Table Sub_District(
	
	subdistrictId int AUTO_INCREMENT NOT NULL,
	
	sudistrictName varchar(255) NOT NULL,
	
	districtId int NOT NULL,
	
	PRIMARY KEY (subdistrictId),
	
	FOREIGN KEY (districtId ) REFERENCEs District (districtId)	


);

Create Table User(
	
userId int AUTO_INCREMENT NOT NULL,
	
name  varchar(255) NOT NULL,
	
lname varchar(255) NOT NULL,
	
address varchar(255) NOT NULL,
	
tel varchar(255) NOT 
email varchar(255) NOT NULL,
	
password varchar(255) NOT NULL,
	
online Boolean NOT NULL,
	
provinceId int,
	subdistrictId int,
	
districtId int NOT NULL, 
	
zipcode varchar(255) NOT NULL,
	
PRIMARY KEY (userId),
	
FOREIGN KEY (provinceId) 
REFERENCES Province (provinceId),
	
FOREIGN KEY (subdistrictId) R
EFERENCES Sub_District(subdistrictId)

);

Create Table ReceiverPost(
	
receiverPostId int AUTO_INCREMENT NOT NULL,
	
statement varchar(255) NOT NULL,
	
categoryId int NOT NULL,
	
receiverId int NOT NULL,
	
dateTime dateTime NOT 
provinceId int NOT NULL,
	
subdistrictId int NOT NULL,
	
districtId int NOT 
PRIMARY KEY (receiverPostId),	
	
FOREIGN KEY (categoryId)
 REFERENCES Category(categoryId),
	
FOREIGN KEY (receiverId) REFERENCES User(userId)

);

Create Table DonatorPost (
	
donateId int AUTO_INCREMENT NOT NULL,
	
donateStatement varchar(255) NOT NULL,
	
categoryId int NOT NULL,
	
donatorId int NOT NULL,
	
dateTime dateTime NOT NULL,
	
provinceId int NOT NULL,
	
subdistrictId int NOT 
districtId int NOT NULL,
	
PRIMARY KEY (donateId),
	
FOREIGN KEY (categoryId) 
REFERENCES Category (categoryId),
	
FOREIGN KEY (donatorId) 
REFERENCES User (userId),
	
FOREIGN KEY (provinceId) 
REFERENCES Province (provinceId),
    
FOREIGN KEY (districtId) 
REFERENCES District (districtId),
	
FOREIGN KEY (subdistrictId) 
REFERENCES Sub_District (subdistrictId)

);

Create Table Deal (
	
dealID int AUTO_INCREMENT NOT NULL,
	
recieverId int NOT NULL,
	
donatorId int NOT NULL,
	
dealStatus boolean NOT NULL,
	
trackingStatusRecieve boolean NOT NULL,
	
recieverPostId int NOT NULL,
	
donatorPostId int NOT 
trackingStatusDonate boolean NOT NULL,
	
PRIMARY KEY (dealId),
	
FOREIGN KEY (recieverId) 
REFERENCES User (userId),
	
FOREIGN KEY (donatorId) 
REFERENCES User (userId),
	
FOREIGN KEY (recieverPostId) 
REFERENCES ReceiverPost (receiverId),
	
FOREIGN KEY (donatorPostId) 
REFERENCES DonatorPost (donatorId)
);

Create Table Chat (
	
chatId int AUTO_INCREMENT NOT NULL,
	
chatName varchar(255),
	
recieverId int NOT NULL,
	
donatorId int NOT NULL,
	
recieverPostId int NOT NULL,
	
donatorPostId int NOT NULL,
	
dealId int NOT NULL,
	
PRIMARY KEY (chatId),
	
FOREIGN KEY (recieverId) 
REFERENCES User (userId),
	
FOREIGN KEY (donatorId) 
REFERENCES User (userId),
	
FOREIGN KEY (recieverPostId) 
REFERENCES ReceiverPost (receiverId),
	
FOREIGN KEY (donatorPostId) 
REFERENCES DonatorPost (donatorId)

);

Create Table ChatMessages (
	
chatMesId int AUTO_INCREMENT NOT NULL,
	
chatId int NOT NULL,
	
value varchar(255) NOT NULL,
	
time DateTime NOT NULL,
	
picAddress varchar(255) NOT NULL,
	
senderId int NOT NULL,
	
statusRead boolean NOT NULL,
	
PRIMARY KEY (chatMesId),
	
FOREIGN KEY (chatId) 
REFERENCES Chat (chatId)

);