Create Table Category(
	categoryId int,
	categoryName varchar(255) NOT NULL,
	imageAdress varchar(255) NOT NULL,
	PRIMARY KEY (categoryId)
);
Create Table RecieverPost(
	receiverPostId int NOT NULL,
	receiverStatement varchar(255) NOT NULL,
	categoryId int NOT NULL,
	receiverId int NOT NULL,
	dateTime dateTime NOT NULL,
	provinceId int NOT NULL,
	subdistrictId int NOT NULL,
	districtId int NOT NULL,
	PRIMARY KEY (receiverPostId),	
	FOREIGN KEY (categoryId) REFERENCES userId(categoryId),
	FOREIGN KEY (receiverId) REFERENCES userId (receiverId)
);
Create Table User(
	userId int NOT NULL,
	name  varchar(255) NOT NULL,
	lname varchar(255) NOT NULL,
	address varchar(255) NOT NULL,
	tel varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	online Boolean NOT NULL,
	provinceId int,
	subdistrictId int,
	districtId int NOT NULL, 
	Zipcode varchar(255) NOT NULL,
	PRIMARY KEY (userId),
	FOREIGN KEY (provinceId) REFERENCES ReceiverPost (provinceId),
	FOREIGN KEY (subdistrictId) REFERENCES ReceiverPost (subdistrictId)
);
Create Table Province(
	provinceId int NOT NULL,
	privinceName varchar(255) NOT NULL,
	PRIMARY KEY (provinceId)

);

Create Table District(
	districtId int NOT NULL,
	districtName varchar(255) NOT NULL,
	provinceId int NOT NULL,
	PRIMARY KEY (districtId),
	FOREIGN KEY (provinceId) REFERENCE Province (provinceId)

);
Create Table Sub_District(
	subdistrictId int NOT NULL,
	sudistrictName varchar(255) NOT NULL,
	districtId int NOT NULL,
	PRIMARY KEY (subdistrictId),
	FOREIGN KEY (districtId ) REFERENCE District (districtId)	

);


Create Table DonatorPost (
	donateId int NOT NULL,
	rdonateStatement varchar(255) NOT NULL,
	categoryId int NOT NULL,
	donatorId int NOT NULL,
	dateTime dateTime NOT NULL,
	provinceId int NOT NULL,
	subdistrictId int NOT NULL,
	districtId int NOT NULL,
	PRIMARY KEY (donateId),
	FOREIGN KEY (categoryId) REFERENCES Category (categoryId),
	FOREIGN KEY (donatorId) REFERENCES user (userId),
	FOREIGN KEY (provinceId) REFERENCES Province (provinceId),
	FOREIGN KEY (subdistrictId) REFERENCES District (subdistrictId),
);

Create Table Deal (
	dealID int NOT NULL,
	recieverId int NOT NULL,
	donatorId int NOT NULL,
	dealStatus boolean NOT NULL,
	trackingStatusRecieve boolean NOT NULL,
	recieverPostId int NOT NULL,
	donatorPostId int NOT NULL,
	trackingStatusDonate boolean NOT NULL,
	PRIMARY KEY (dealId),
	FOREIGN KEY (recieverId) REFERENCES Category (user),
	FOREIGN KEY (donatorId) REFERENCES Category (user),
	FOREIGN KEY (recieverPostId) REFERENCES RecieverPost (recieverId),
	FOREIGN KEY (donatorPostId) REFERENCES DonatorPost (donatorId),
);

Create Table Deal (
	chatMesId int NOT NULL,
	chatId int NOT NULL,
	value varchar(255) NOT NULL,
	time DateTime NOT NULL,
	picAddress varchar(255) NOT NULL,
	senderId int NOT NULL,
	statusRead boolean NOT NULL,
	PRIMARY KEY (chatMesId),
	FOREIGN KEY (chatId) REFERENCES Chat (chatId),
);

Create Table chat (
	chatId int NOT NULL,
	chatName varchar(255),
	recieverId int NOT NULL,
	donatorId int NOT NULL,
	recieverPostId int NOT NULL,
	donatorPostId int NOT NULL,
	dealId int NOT NULL,
	PRIMARY KEY (chatId),
	FOREIGN KEY (recieverId) REFERENCES User (recieverId),
	FOREIGN KEY (donatorId) REFERENCES User (donatorId),
	FOREIGN KEY (recieverPostId) REFERENCES RecievePost (recieverId),
	FOREIGN KEY (donatorPostId) REFERENCES DonatorPost (donateId),
	
);
