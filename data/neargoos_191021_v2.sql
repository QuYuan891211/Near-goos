-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: neargoos
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `common_area`
--

DROP TABLE IF EXISTS `common_area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `common_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  `remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `common_area`
--

LOCK TABLES `common_area` WRITE;
/*!40000 ALTER TABLE `common_area` DISABLE KEYS */;
/*!40000 ALTER TABLE `common_area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content_base_association`
--

DROP TABLE IF EXISTS `content_base_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `content_base_association` (
  `bid` int(255) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`bid`,`cid`),
  KEY `fk_content_base_bid` (`bid`) USING BTREE,
  KEY `fk_content_base_contentid` (`cid`) USING BTREE,
  CONSTRAINT `fk_content_base_bid` FOREIGN KEY (`bid`) REFERENCES `document_base` (`id`),
  CONSTRAINT `fk_content_base_contentid` FOREIGN KEY (`cid`) REFERENCES `document_content` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content_base_association`
--

LOCK TABLES `content_base_association` WRITE;
/*!40000 ALTER TABLE `content_base_association` DISABLE KEYS */;
/*!40000 ALTER TABLE `content_base_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_overview`
--

DROP TABLE IF EXISTS `data_overview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `data_overview` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  `content` varchar(3000) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `is_delete` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_overview`
--

LOCK TABLES `data_overview` WRITE;
/*!40000 ALTER TABLE `data_overview` DISABLE KEYS */;
INSERT INTO `data_overview` VALUES (1,'2019-10-10 10:22:55','2019-10-10 10:22:55','新测试屈远','标题',0);
/*!40000 ALTER TABLE `data_overview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_base`
--

DROP TABLE IF EXISTS `document_base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `document_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `is_del` tinyint(1) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `page_area` varchar(45) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_base`
--

LOCK TABLES `document_base` WRITE;
/*!40000 ALTER TABLE `document_base` DISABLE KEYS */;
INSERT INTO `document_base` VALUES (1,'base_1',NULL,NULL,NULL,NULL,NULL),(2,'base_2',NULL,NULL,NULL,NULL,NULL),(3,'base_3',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `document_base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_content`
--

DROP TABLE IF EXISTS `document_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `document_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `document` varchar(100) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_content`
--

LOCK TABLES `document_content` WRITE;
/*!40000 ALTER TABLE `document_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `document_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_image`
--

DROP TABLE IF EXISTS `document_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `document_image` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  `image_heigh` float DEFAULT NULL,
  `image_width` float DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_image`
--

LOCK TABLES `document_image` WRITE;
/*!40000 ALTER TABLE `document_image` DISABLE KEYS */;
INSERT INTO `document_image` VALUES (1,'image_1',NULL,NULL,NULL,NULL,NULL),(2,'image_2',NULL,NULL,NULL,NULL,NULL),(3,'image_3',NULL,NULL,NULL,NULL,NULL),(4,'image_4',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `document_image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_tab`
--

DROP TABLE IF EXISTS `document_tab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `document_tab` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `view_name` varchar(45) DEFAULT NULL,
  `url` varchar(45) DEFAULT NULL,
  `id_del` tinyint(1) DEFAULT NULL,
  `icon` varchar(45) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `image_height` varchar(45) DEFAULT NULL,
  `image_width` varchar(45) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `dbid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `tab_base` (`dbid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_tab`
--

LOCK TABLES `document_tab` WRITE;
/*!40000 ALTER TABLE `document_tab` DISABLE KEYS */;
INSERT INTO `document_tab` VALUES (1,'测试',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,'2019-10-14 14:54:26','2019-10-14 14:54:26',NULL),(2,'tab_1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,'2019-10-18 15:24:12','2019-10-18 15:24:14',NULL),(3,'tab_1_1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,2,'2019-10-18 15:24:44','2019-10-18 15:24:46',NULL),(4,'tab_1_2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,2,NULL,NULL,NULL),(5,'tab_2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL),(6,'tab_2_1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,2,NULL,NULL,NULL);
/*!40000 ALTER TABLE `document_tab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document_title`
--

DROP TABLE IF EXISTS `document_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `document_title` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `is_del` tinyint(1) DEFAULT NULL,
  `title_content` varchar(45) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document_title`
--

LOCK TABLES `document_title` WRITE;
/*!40000 ALTER TABLE `document_title` DISABLE KEYS */;
/*!40000 ALTER TABLE `document_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image_base_association`
--

DROP TABLE IF EXISTS `image_base_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `image_base_association` (
  `bid` int(11) NOT NULL,
  `imageid` int(11) NOT NULL,
  PRIMARY KEY (`bid`,`imageid`),
  KEY `fk_base_image_imageid` (`imageid`) USING BTREE,
  KEY `fk_base_image_bid` (`bid`) USING BTREE,
  CONSTRAINT `fk_base_image_bid` FOREIGN KEY (`bid`) REFERENCES `document_base` (`id`),
  CONSTRAINT `fk_base_image_imageid` FOREIGN KEY (`imageid`) REFERENCES `document_image` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image_base_association`
--

LOCK TABLES `image_base_association` WRITE;
/*!40000 ALTER TABLE `image_base_association` DISABLE KEYS */;
INSERT INTO `image_base_association` VALUES (1,1),(1,2),(2,3),(3,3),(3,4);
/*!40000 ALTER TABLE `image_base_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_action`
--

DROP TABLE IF EXISTS `management_action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `management_action` (
  `name` varchar(20) NOT NULL,
  `sort` int(11) NOT NULL DEFAULT '999',
  `remark` varchar(100) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
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
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `url` (`url`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_action`
--

LOCK TABLES `management_action` WRITE;
/*!40000 ALTER TABLE `management_action` DISABLE KEYS */;
INSERT INTO `management_action` VALUES ('测试权限',999,NULL,'2019-02-28 19:00:23','2019-02-28 19:00:23',0,'safasg',NULL,NULL,NULL,NULL,2,'hh',2,3,NULL,NULL,1,5,1),('测试新增',999,NULL,'2019-03-10 00:31:32','2019-03-10 00:31:34',0,'user/add',NULL,NULL,NULL,NULL,2,'add',2,2,NULL,NULL,1,2,2),('测试删除',999,NULL,'2019-03-10 00:38:15','2019-03-10 00:38:17',0,'user/del',NULL,NULL,NULL,NULL,2,'del',2,2,NULL,NULL,1,3,3),('测试查看权限',999,NULL,'2019-03-10 00:40:06','2019-03-10 00:40:09',0,'user/view',NULL,NULL,NULL,NULL,3,'view',3,3,NULL,NULL,1,3,4),('权限',999,NULL,'2019-08-23 10:27:45','2019-08-23 10:27:45',0,'sad','asd','asd',NULL,NULL,123,'adf',123,123,NULL,NULL,1,123,5),('新测试屈远',999,NULL,'2019-09-25 20:29:46','2019-09-25 20:29:46',0,'sdsdasd','aa','dd',NULL,NULL,35,'aa',4,5,NULL,NULL,1,5555,6);
/*!40000 ALTER TABLE `management_action` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_role`
--

DROP TABLE IF EXISTS `management_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `management_role` (
  `name` varchar(20) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `sort` int(11) NOT NULL DEFAULT '999',
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_role`
--

LOCK TABLES `management_role` WRITE;
/*!40000 ALTER TABLE `management_role` DISABLE KEYS */;
INSERT INTO `management_role` VALUES ('系统管理员',NULL,999,'2019-02-25 16:09:47','2019-02-25 16:09:47',1),('部门领导',NULL,999,'2019-02-25 16:10:27','2019-02-25 16:10:27',2),('组长',NULL,999,'2019-02-26 15:28:14','2019-02-26 15:28:14',3),('组员',NULL,999,'2019-02-26 18:37:39','2019-02-26 18:37:39',4);
/*!40000 ALTER TABLE `management_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_user`
--

DROP TABLE IF EXISTS `management_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `management_user` (
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `is_delete` tinyint(1) NOT NULL DEFAULT '0',
  `sort` int(11) NOT NULL DEFAULT '999',
  `remark` varchar(100) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `is_locked` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `account` (`account`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_user`
--

LOCK TABLES `management_user` WRITE;
/*!40000 ALTER TABLE `management_user` DISABLE KEYS */;
INSERT INTO `management_user` VALUES ('aabbcc','2312421',1,44,NULL,'2019-02-23 23:23:35','2019-02-24 15:31:13','测试',7,0),('aabcc12','2312421',0,44,NULL,'2019-02-24 15:00:17','2019-02-24 15:00:17','屈远测试',8,0),('aabbcc222','2312421',0,44,NULL,'2019-02-24 21:53:53','2019-02-24 21:53:53','测试',9,0),('aabbcc22255','2312421',0,44,NULL,'2019-02-25 12:29:49','2019-02-25 12:29:49','测试测试测试',10,0),('wangdong','38964',0,999,NULL,'2019-02-27 00:04:18','2019-02-27 00:04:18','大为',11,0),('wangdouu8ng','38964',0,999,NULL,'2019-02-27 00:13:24','2019-02-27 00:13:24','大为',12,0),('hhhhh8ng','38964',0,999,NULL,'2019-02-27 00:21:53','2019-02-27 00:21:53','我是为',13,0),('hhhhttth8ng','38964',0,999,NULL,'2019-02-27 00:42:07','2019-02-27 00:42:07','我是屈远',14,0),('quyuan','111111',0,999,NULL,'2019-02-27 01:37:26','2019-02-27 13:28:48','希罗测试金卡会员',15,0),('hahaha','889211',0,999,NULL,'2019-02-27 13:30:11','2019-02-27 13:35:58','希罗测试管理员',16,0);
/*!40000 ALTER TABLE `management_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_info`
--

DROP TABLE IF EXISTS `product_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product_info` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  `interval` int(11) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `target_date` datetime DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_info`
--

LOCK TABLES `product_info` WRITE;
/*!40000 ALTER TABLE `product_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_type`
--

DROP TABLE IF EXISTS `product_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_type`
--

LOCK TABLES `product_type` WRITE;
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_action_association`
--

DROP TABLE IF EXISTS `role_action_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `role_action_association` (
  `role_id` int(11) NOT NULL,
  `action_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`action_id`) USING BTREE,
  KEY `FK_role_action_association2` (`action_id`) USING BTREE,
  CONSTRAINT `FK_role_action_association` FOREIGN KEY (`role_id`) REFERENCES `management_role` (`id`),
  CONSTRAINT `FK_role_action_association2` FOREIGN KEY (`action_id`) REFERENCES `management_action` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_action_association`
--

LOCK TABLES `role_action_association` WRITE;
/*!40000 ALTER TABLE `role_action_association` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_action_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab_base_association`
--

DROP TABLE IF EXISTS `tab_base_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab_base_association` (
  `bid` int(11) NOT NULL,
  `tabid` int(11) NOT NULL,
  PRIMARY KEY (`bid`,`tabid`) USING BTREE,
  KEY `fk_tabid_tab` (`tabid`) USING BTREE,
  CONSTRAINT `fk_base_tab` FOREIGN KEY (`bid`) REFERENCES `document_base` (`id`),
  CONSTRAINT `fk_tabid_tab` FOREIGN KEY (`tabid`) REFERENCES `document_tab` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_base_association`
--

LOCK TABLES `tab_base_association` WRITE;
/*!40000 ALTER TABLE `tab_base_association` DISABLE KEYS */;
INSERT INTO `tab_base_association` VALUES (1,1),(2,2),(2,4),(3,4);
/*!40000 ALTER TABLE `tab_base_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab_content_association`
--

DROP TABLE IF EXISTS `tab_content_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab_content_association` (
  `titleid` int(11) NOT NULL,
  `contentid` int(11) NOT NULL,
  PRIMARY KEY (`titleid`,`contentid`),
  KEY `fk_title_content_cid` (`contentid`),
  CONSTRAINT `fk_title_content_cid` FOREIGN KEY (`contentid`) REFERENCES `document_content` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_title_content_tid` FOREIGN KEY (`titleid`) REFERENCES `document_tab` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_content_association`
--

LOCK TABLES `tab_content_association` WRITE;
/*!40000 ALTER TABLE `tab_content_association` DISABLE KEYS */;
/*!40000 ALTER TABLE `tab_content_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `title_base_association`
--

DROP TABLE IF EXISTS `title_base_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `title_base_association` (
  `tid` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  PRIMARY KEY (`tid`,`bid`),
  KEY `fk_title` (`tid`) USING BTREE,
  KEY `fk_base` (`bid`) USING BTREE,
  CONSTRAINT `fk_base` FOREIGN KEY (`bid`) REFERENCES `document_base` (`id`),
  CONSTRAINT `fk_title` FOREIGN KEY (`tid`) REFERENCES `document_title` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `title_base_association`
--

LOCK TABLES `title_base_association` WRITE;
/*!40000 ALTER TABLE `title_base_association` DISABLE KEYS */;
/*!40000 ALTER TABLE `title_base_association` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role_association`
--

DROP TABLE IF EXISTS `user_role_association`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_role_association` (
  `use_id` int(11) NOT NULL,
  `rol_id` int(11) NOT NULL,
  PRIMARY KEY (`use_id`,`rol_id`) USING BTREE,
  KEY `FK_user_role_association2` (`rol_id`) USING BTREE,
  CONSTRAINT `FK_user_role_association` FOREIGN KEY (`use_id`) REFERENCES `management_user` (`id`),
  CONSTRAINT `FK_user_role_association2` FOREIGN KEY (`rol_id`) REFERENCES `management_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role_association`
--

LOCK TABLES `user_role_association` WRITE;
/*!40000 ALTER TABLE `user_role_association` DISABLE KEYS */;
INSERT INTO `user_role_association` VALUES (13,1),(14,1),(16,1),(13,2),(14,2);
/*!40000 ALTER TABLE `user_role_association` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-21 21:20:29
