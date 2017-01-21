/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.26 : Database - db_uas_15312412
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_uas_15312412` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_uas_15312412`;

/*Table structure for table `tbl_pinjam` */

DROP TABLE IF EXISTS `tbl_pinjam`;

CREATE TABLE `tbl_pinjam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `namaTeman` varchar(30) NOT NULL,
  `barangDipinjam` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pinjam` */

insert  into `tbl_pinjam`(`id`,`namaTeman`,`barangDipinjam`) values (2,'yani','buku the lord'),(3,'psnca','1 unit sepeda '),(4,'Hasin','Lemari Baju berserta Bajunya');

/*Table structure for table `tbl_teman` */

DROP TABLE IF EXISTS `tbl_teman`;

CREATE TABLE `tbl_teman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(30) NOT NULL,
  `nope` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_teman` */

insert  into `tbl_teman`(`id`,`nama`,`nope`,`email`) values (1,'leo irawan','085624201702','leoirawan15312412@mail.com'),(4,'yuni','085778129512','-'),(6,'kitaro','085665561217','-'),(8,'kunti','085604740100','-');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
