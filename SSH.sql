

create database employeedb default character set utf8;

-- ʹ��
use employeedb;




CREATE TABLE `departmentinfo` (
  `deptid` int(11) NOT NULL AUTO_INCREMENT,
  `deptName` varchar(200) DEFAULT NULL,
  `principal` varchar(200) DEFAULT NULL,
  `deptPhone` varchar(200) DEFAULT NULL,
  `deptFax` varchar(200) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`deptid`)
);



CREATE TABLE `employeeinfo` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `empName` varchar(200) DEFAULT NULL,
  `empSex` varchar(10) DEFAULT NULL,
  `empIdcard` varchar(200) DEFAULT NULL,
  `subsidies` float(10,0) DEFAULT NULL,
  `empDate` datetime DEFAULT NULL,
  `deptid` int(11) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `userPwd` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`empid`)
);



INSERT INTO `departmentinfo` VALUES (NULL, '����', 'a', '12345687977', '00120012', '��ע1');
INSERT INTO `departmentinfo` VALUES (NULL, '�з���', 'a', '12345687977', '00120012', '��ע1');
INSERT INTO `departmentinfo` VALUES (NULL, '���²�', 'a', '12345687977', '00120012', '��ע1');

INSERT INTO `employeeinfo` VALUES (NULL, 'С��', 'Ů', '52246945454545454', '200', '2018-08-09 00:00:00', '1', 'Ա����ע1', 'xx', '123456');
