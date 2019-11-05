-- MySQL dump 10.13  Distrib 8.0.17, for macos10.14 (x86_64)
--
-- Host: localhost    Database: neargoos
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `management_user`
--

DROP TABLE IF EXISTS `management_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `management_user` (
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `is_delete` tinyint(1) NOT NULL DEFAULT '0',
  `sort` int(11) NOT NULL DEFAULT '999',
  `remark` varchar(100) DEFAULT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  `name` varchar(20) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `is_locked` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_user`
--

LOCK TABLES `management_user` WRITE;
/*!40000 ALTER TABLE `management_user` DISABLE KEYS */;
INSERT INTO `management_user` VALUES ('aabbcc','2312421',1,44,NULL,'2019-02-23 23:23:35','2019-02-24 15:31:13','测试',7,0),('aabcc12','2312421',0,44,NULL,'2019-02-24 15:00:17','2019-02-24 15:00:17','屈远测试',8,0),('aabbcc222','2312421',0,44,NULL,'2019-02-24 21:53:53','2019-02-24 21:53:53','测试',9,0),('aabbcc22255','2312421',0,44,NULL,'2019-02-25 12:29:49','2019-02-25 12:29:49','测试测试测试',10,0),('wangdong','38964',0,999,NULL,'2019-02-27 00:04:18','2019-02-27 00:04:18','大为',11,0),('wangdouu8ng','38964',0,999,NULL,'2019-02-27 00:13:24','2019-02-27 00:13:24','大为',12,0),('hhhhh8ng','38964',0,999,NULL,'2019-02-27 00:21:53','2019-02-27 00:21:53','我是为',13,0),('hhhhttth8ng','38964',0,999,NULL,'2019-02-27 00:42:07','2019-02-27 00:42:07','我是屈远',14,0),('quyuan','111111',0,999,NULL,'2019-02-27 01:37:26','2019-02-27 13:28:48','希罗测试金卡会员',15,0),('hahaha','889211',0,999,NULL,'2019-02-27 13:30:11','2019-02-27 13:35:58','希罗测试管理员',16,0);
/*!40000 ALTER TABLE `management_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-14 14:23:24
