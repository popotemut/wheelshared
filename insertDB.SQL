INSERT INTO Category (categoryName, imageAdress)
VALUES ('wheelchair','http://images.mattel.com/scene7/V6051_berry_wheelchair_1?$oslarge$&wid=549&hei=549');

INSERT INTO Category (categoryName, imageAdress)
VALUES ('oxygen tank','http://sanyangfrp.com/data/out/213/635157995-oxygen-tank-pictures.jpg');

INSERT INTO Category (categoryName, imageAdress)
VALUES ('crutches','http://ilsau.com.au/wp-content/uploads/2014/04/Underarm-Crutches-Aluminium-510x600.jpg');

INSERT INTO Category (categoryName, imageAdress)
VALUES ('bed','http://www.praneemedical.com/pic/46-1.jpg');

INSERT INTO Category (categoryName, imageAdress)
VALUES ('other','https://vignette.wikia.nocookie.net/worldofjaymz/images/b/b7/Other.png/revision/latest?cb=20131220170522');



-------------------------------------------------------------------

INSERT INTO Province (privinceName)
VALUES ('Bangkok');

-------------------------------------------------------------------


INSERT INTO District (districtName)
VALUES ('�����ѹ');


INSERT INTO District (districtName)
VALUES ('�ǹ��ǧ');

-------------------------------------------------------------------


INSERT INTO Sub_District (subdistrictName)
VALUES ('�ѧ����');


INSERT INTO Sub_District (subdistrictName)
VALUES ('�ǹ��ǧ');

-------------------------------------------------------------------



INSERT INTO User (name,lname,address,tel,email,password,online,provinceId,subdistrictId,districtId,zipcode)
VALUES ('min','neverdie','�ѧ���','191','minnyishappy@gmail.com','1111','0','001','001','12345');

INSERT INTO User (name,lname,address,tel,email,password,online,provinceId,subdistrictId,districtId,zipcode)
VALUES ('PP','Zahaha+','�оҹ���','199','pp007@gmail.com','0101','1','002','002','78910');


---------------------------------------------------------------------

INSERT INTO RecieverPost (statement, receiverId,dateTime,provinceId,subdistrictId,districtId)
VALUES ('��ͧ�����§�͹����Ѻ�����¤�Ѻ','1','12112017','001','001','12345');

INSERT INTO RecieverPost (statement, receiverId,dateTime,provinceId,subdistrictId,districtId)
VALUES ('���նѧ�͡��ਹ��ҧ��Ѻ��ͧ��� 2 �ѧ�ѡ��sojvp8iy[���Ѻ','2','20122017','002','002','78910');

----------------------------------------------------------------------

INSERT INTO DonatorPost (statement, receiverId,dateTime,provinceId,subdistrictId,districtId)
VALUES ('�նѧ�͡��ਹ��Ҵ 1.5 ��� �ӹǹ 2 �ѧ �õ�ͧ��÷ѡ�����Ѻ','1','21122018','001','001','12345');


INSERT INTO DonatorPost (statement, donatorId,dateTime,provinceId,subdistrictId,districtId)
VALUES ('����§����Ѻ��������Ҿ 80%��Ѻ','1','01082018','002','002','78910');

----------------------------------------------------------------------


INSERT INTO Deal (recieverId,donatorId,dealStatus,trackingStatusRecieve,trackingStatusDonate)
VALUES ('1','1','0','0','0');

INSERT INTO Deal (recieverId,donatorId,dealStatus,trackingStatusRecieve,trackingStatusDonate)
VALUES ('2','2','1','1','1');

-----------------------------------------------------------------------

INSERT INTO Chat (chatName,recieverId,donatorId)
VALUES ('Min','0','0');


INSERT INTO Chat (chatName,recieverId,donatorId)
VALUES ('PPLOVEMIN','1','1');


----------------------------------------------------------------------


INSERT INTO ChatMessages (values,time,picAddress,senderId,statusRead)
VALUES ('���ʴդ�Ѻ',https://scontent.fbkk12-2.fna.fbcdn.net/v/t1.0-0/q83/p206x206/27657590_1761137530603353
_6307526506604701133_n.jpg?oh=af46eb86f1b5970c9bc9c2b79b256d73&oe=5B028F4E','s001','0'
);


INSERT INTO ChatMessages (values,time,picAddress,senderId,statusRead)
VALUES ('�������¤��Һ����','https://scontent.fbkk12-2.fna.fbcdn.net/v/t1.0-9/19990357_1492535650808611_4125285217931002661_
n.jpg?oh=b71ab32046f3ce7a09dfdfe747cd27c1&oe=5B05AC5C','s001','1');























