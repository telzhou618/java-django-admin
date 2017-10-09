/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.54 : Database - jdjango-demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `tb_goods` */

DROP TABLE IF EXISTS `tb_goods`;

CREATE TABLE `tb_goods` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `goodsName` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `goodsPrice` float DEFAULT '0' COMMENT '价格',
  `store` int(11) DEFAULT '0' COMMENT '库存',
  `specification` varchar(100) DEFAULT NULL COMMENT '规格',
  `goodsDesc` varchar(300) DEFAULT NULL COMMENT '描述',
  `sales` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods` */

insert  into `tb_goods`(`id`,`goodsName`,`goodsPrice`,`store`,`specification`,`goodsDesc`,`sales`) values ('7c7cbdc93a904d9c946368e2d407d6fe','xxxx',654666000,0,'xxxx','sdasdas',0),('9176e81154a34963a588a97ee0966788','电视',5400,0,'60寸','',0);

/*Table structure for table `tb_test` */

DROP TABLE IF EXISTS `tb_test`;

CREATE TABLE `tb_test` (
  `id` varchar(50) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birth` date DEFAULT '2017-08-01',
  `state` int(11) DEFAULT '1',
  `file` varchar(255) DEFAULT NULL,
  `price` float DEFAULT '0',
  `textDesc` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_test` */

insert  into `tb_test`(`id`,`name`,`age`,`birth`,`state`,`file`,`price`,`textDesc`) values ('4313e0f3e080469b8df6c539c9ea06c3','',0,'2017-08-01',0,'',0,NULL),('631d8250ef1841adb13d6b41e20defc6','',0,'2017-08-01',0,'',0,NULL),('6744201fc7ba4c008c079e52cf57a84c','',0,'2017-08-01',0,'',0,NULL);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `userDesc` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`userName`,`password`,`userDesc`) values ('608bad74d4e746fcbd3560d9ce1a814d','admin','123456','xad'),('a2235572585e48369eb3572d7e1bb13b','admin','123456',''),('c7018b97844f44af9f1ef2174a78a4fb','admin5','123456','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
