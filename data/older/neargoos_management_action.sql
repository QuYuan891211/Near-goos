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
-- Table structure for table `management_action`
--

DROP TABLE IF EXISTS `management_action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `management_action` (
  `name` varchar(20) NOT NULL,
  `sort` int(11) NOT NULL DEFAULT '999',
  `remark` varchar(100) DEFAULT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  `parent_id` int(11) NOT NULL DEFAULT '0',
  `url` varchar(255) NOT NULL,
  `area_name` varchar(32) DEFAULT NULL,
  `method_name` varchar(32) DEFAULT NULL,
  `controller_name` varchar(32) DEFAULT NULL,
  `js_function_name` varchar(32) DEFAULT NULL,
  `type_enum` int(11) NOT NULL,
  `menu_icon` varchar(32) NOT NULL,
  `icon_width` int(11) NOT NULL,
  `icon_height` int(11) NOT NULL,
  `icon_cls` varchar(32) DEFAULT NULL,
  `icon_class_name` varchar(32) DEFAULT NULL,
  `is_show` tinyint(1) NOT NULL DEFAULT '1',
  `method_type_enum` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `url` (`url`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_action`
--

LOCK TABLES `management_action` WRITE;
/*!40000 ALTER TABLE `management_action` DISABLE KEYS */;
INSERT INTO `management_action` VALUES ('测试权限',999,NULL,'2019-02-28 19:00:23','2019-02-28 19:00:23',0,'safasg',NULL,NULL,NULL,NULL,2,'hh',2,3,NULL,NULL,1,5,1),('测试新增',999,NULL,'2019-03-10 00:31:32','2019-03-10 00:31:34',0,'user/add',NULL,NULL,NULL,NULL,2,'add',2,2,NULL,NULL,1,2,2),('测试删除',999,NULL,'2019-03-10 00:38:15','2019-03-10 00:38:17',0,'user/del',NULL,NULL,NULL,NULL,2,'del',2,2,NULL,NULL,1,3,3),('测试查看权限',999,NULL,'2019-03-10 00:40:06','2019-03-10 00:40:09',0,'user/view',NULL,NULL,NULL,NULL,3,'view',3,3,NULL,NULL,1,3,4),('权限',999,NULL,'2019-08-23 10:27:45','2019-08-23 10:27:45',0,'sad','asd','asd',NULL,NULL,123,'adf',123,123,NULL,NULL,1,123,5),('新测试屈远',999,NULL,'2019-09-25 20:29:46','2019-09-25 20:29:46',0,'sdsdasd','aa','dd',NULL,NULL,35,'aa',4,5,NULL,NULL,1,5555,6);
/*!40000 ALTER TABLE `management_action` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-14 14:23:25
