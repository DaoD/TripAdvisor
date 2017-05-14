CREATE TABLE user (
  userid int(10) NOT NULL AUTO_INCREMENT,
  username char(50) NOT NULL UNIQUE,
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