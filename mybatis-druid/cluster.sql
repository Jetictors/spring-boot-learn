/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 8.0.17 : Database - cluster
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cluster` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `cluster`;

/*Table structure for table `t_cluster` */

DROP TABLE IF EXISTS `t_cluster`;

CREATE TABLE `t_cluster` (
  `clusterId` int(11) NOT NULL AUTO_INCREMENT,
  `masterId` int(11) NOT NULL,
  `name` text COLLATE utf8_unicode_ci NOT NULL,
  `des` text COLLATE utf8_unicode_ci,
  `time` time NOT NULL,
  PRIMARY KEY (`clusterId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_cluster` */

insert  into `t_cluster`(`clusterId`,`masterId`,`name`,`des`,`time`) values (1,1,'first cluster','cluster 第一条数据','00:00:00'),(2,1,'second cluster','cluster 第二条数据','00:00:00'),(3,2,'third cluster','cluster 第三条数据','00:00:00'),(4,2,'forth cluster','cluster 第四条数据','00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
