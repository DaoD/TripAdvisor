CREATE TABLE user (
  userid int(10) NOT NULL AUTO_INCREMENT,
  username char(50) NOT NULL,
  password char(50) NOT NULL,
  email char(30) NOT NULL,
  type smallint(2) NOT NULL,
  PRIMARY KEY (userid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE profile (
  userid int(10) NOT NULL,
  companyname char(50) NOT NULL,
  contactnumber char(20) NOT NULL,
  country char(10) NOT NULL,
  state char(15) NOT NULL,
  address char(100) NOT NULL,
  zipcode char(10) NOT NULL,
  INDEX (userid),
  FOREIGN KEY (userid) REFERENCES user(userid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE service (
	serviceid int(10) NOT NULL AUTO_INCREMENT,
	userid int(10) NOT NULL,
	servicename char(50) NOT NULL,
	wsdladdress char(100) NOT NULL,
	addtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	note text,
	FOREIGN KEY (userid) REFERENCES user(userid),
	PRIMARY KEY(serviceid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE one_order (
  id int(10) NOT NULL AUTO_INCREMENT,
  orderid int(10) NOT NULL,
  userid int(10) NOT NULL,
  ordertype int(1) NOT NULL,
  name char(30) NOT NULL,
  flightnumber char(30),
  booktype char(30),
  flightdeparttime char(30),
  flightarrivetime char(30),
  flighttime char(30),
  flightfromcity char(30),
  flighttocity char(30),
  ordernum int(3),
  orderprice int(10),
  orderdate char(30),
  orderfromdate char(30),
  ordertodate char(30),
  orderdays int(3),
  orderaddress char(100),
  hotelstar char(10),
  ordercity char(10),
  carbrand char(20),
  carenginetype char(30),
  carpassengers char(30),
  addtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY(id),
  FOREIGN KEY (userid) REFERENCES user(userid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
