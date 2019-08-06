/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 8.0.17 : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `demo`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cityId` int(11) NOT NULL AUTO_INCREMENT,
  `provinceId` int(11) NOT NULL,
  `cityName` text COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`cityId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `city` */

insert  into `city`(`cityId`,`provinceId`,`cityName`,`description`) values (1,1001,'太原','太原好热啊'),(2,1002,'深圳','深圳靠海啊'),(3,1003,'广州',NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `userName` text COLLATE utf8_unicode_ci NOT NULL,
  `pwd` text COLLATE utf8_unicode_ci NOT NULL,
  `nickName` text COLLATE utf8_unicode_ci,
  `age` int(11) DEFAULT NULL,
  `sex` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`pwd`,`nickName`,`age`,`sex`) values (1001,'18875023340','123456','张三',25,0),(1002,'18875023341','123456','李四',22,0),(1003,'18875023342','123456',NULL,30,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
