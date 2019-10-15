/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : neargoos

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 15/10/2019 22:23:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for common_area
-- ----------------------------
DROP TABLE IF EXISTS `common_area`;
CREATE TABLE `common_area`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NULL DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `typeid` int(11) NULL DEFAULT NULL,
  `remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for data_overview
-- ----------------------------
DROP TABLE IF EXISTS `data_overview`;
CREATE TABLE `data_overview`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL COMMENT '更新时间',
  `content` varchar(3000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_delete` tinyint(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of data_overview
-- ----------------------------
INSERT INTO `data_overview` VALUES (1, '2019-10-10 10:22:55', '2019-10-10 10:22:55', '新测试屈远', '标题', 0);

-- ----------------------------
-- Table structure for document_base
-- ----------------------------
DROP TABLE IF EXISTS `document_base`;
CREATE TABLE `document_base`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_del` tinyint(1) NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `tid` int(11) NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  `iid` int(11) NULL DEFAULT NULL,
  `page_area` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `document_base_document_image_id_fk`(`iid`) USING BTREE,
  INDEX `document_base_document_content_id_fk`(`cid`) USING BTREE,
  INDEX `document_base_document_title_id_fk`(`tid`) USING BTREE,
  CONSTRAINT `document_base_document_content_id_fk` FOREIGN KEY (`cid`) REFERENCES `document_content` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `document_base_document_image_id_fk` FOREIGN KEY (`iid`) REFERENCES `document_image` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `document_base_document_title_id_fk` FOREIGN KEY (`tid`) REFERENCES `document_title` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for document_content
-- ----------------------------
DROP TABLE IF EXISTS `document_content`;
CREATE TABLE `document_content`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `document` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for document_image
-- ----------------------------
DROP TABLE IF EXISTS `document_image`;
CREATE TABLE `document_image`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image_url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image_heigh` float NULL DEFAULT NULL,
  `image_width` float NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for document_tab
-- ----------------------------
DROP TABLE IF EXISTS `document_tab`;
CREATE TABLE `document_tab`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `view_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `url` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `id_del` tinyint(1) NULL DEFAULT NULL,
  `icon` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image_url` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image_height` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image_width` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  `dbid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `tab_base`(`dbid`) USING BTREE,
  CONSTRAINT `tab_base` FOREIGN KEY (`dbid`) REFERENCES `document_base` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of document_tab
-- ----------------------------
INSERT INTO `document_tab` VALUES (1, '测试', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, '2019-10-14 18:56:52', '2019-10-14 18:56:52', NULL);

-- ----------------------------
-- Table structure for document_title
-- ----------------------------
DROP TABLE IF EXISTS `document_title`;
CREATE TABLE `document_title`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_del` tinyint(1) NULL DEFAULT NULL,
  `title_content` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for management_action
-- ----------------------------
DROP TABLE IF EXISTS `management_action`;
CREATE TABLE `management_action`  (
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort` int(11) NOT NULL DEFAULT 999,
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL,
  `gmt_modified` datetime(0) NULL,
  `parent_id` int(11) NOT NULL DEFAULT 0,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `area_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `method_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `controller_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `js_function_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type_enum` int(11) NOT NULL,
  `menu_icon` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `icon_width` int(11) NOT NULL,
  `icon_height` int(11) NOT NULL,
  `icon_cls` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon_class_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_show` tinyint(1) NOT NULL DEFAULT 1,
  `method_type_enum` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `url`(`url`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of management_action
-- ----------------------------
INSERT INTO `management_action` VALUES ('测试权限', 999, NULL, '2019-02-28 19:00:23', '2019-02-28 19:00:23', 0, 'safasg', NULL, NULL, NULL, NULL, 2, 'hh', 2, 3, NULL, NULL, 1, 5, 1);
INSERT INTO `management_action` VALUES ('测试新增', 999, NULL, '2019-03-10 00:31:32', '2019-03-10 00:31:34', 0, 'user/add', NULL, NULL, NULL, NULL, 2, 'add', 2, 2, NULL, NULL, 1, 2, 2);
INSERT INTO `management_action` VALUES ('测试删除', 999, NULL, '2019-03-10 00:38:15', '2019-03-10 00:38:17', 0, 'user/del', NULL, NULL, NULL, NULL, 2, 'del', 2, 2, NULL, NULL, 1, 3, 3);
INSERT INTO `management_action` VALUES ('测试查看权限', 999, NULL, '2019-03-10 00:40:06', '2019-03-10 00:40:09', 0, 'user/view', NULL, NULL, NULL, NULL, 3, 'view', 3, 3, NULL, NULL, 1, 3, 4);
INSERT INTO `management_action` VALUES ('权限', 999, NULL, '2019-08-23 10:27:45', '2019-08-23 10:27:45', 0, 'sad', 'asd', 'asd', NULL, NULL, 123, 'adf', 123, 123, NULL, NULL, 1, 123, 5);
INSERT INTO `management_action` VALUES ('新测试屈远', 999, NULL, '2019-09-25 20:29:46', '2019-09-25 20:29:46', 0, 'sdsdasd', 'aa', 'dd', NULL, NULL, 35, 'aa', 4, 5, NULL, NULL, 1, 5555, 6);

-- ----------------------------
-- Table structure for management_role
-- ----------------------------
DROP TABLE IF EXISTS `management_role`;
CREATE TABLE `management_role`  (
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sort` int(11) NOT NULL DEFAULT 999,
  `gmt_create` datetime(0) NULL,
  `gmt_modified` datetime(0) NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of management_role
-- ----------------------------
INSERT INTO `management_role` VALUES ('系统管理员', NULL, 999, '2019-02-25 16:09:47', '2019-02-25 16:09:47', 1);
INSERT INTO `management_role` VALUES ('部门领导', NULL, 999, '2019-02-25 16:10:27', '2019-02-25 16:10:27', 2);
INSERT INTO `management_role` VALUES ('组长', NULL, 999, '2019-02-26 15:28:14', '2019-02-26 15:28:14', 3);
INSERT INTO `management_role` VALUES ('组员', NULL, 999, '2019-02-26 18:37:39', '2019-02-26 18:37:39', 4);

-- ----------------------------
-- Table structure for management_user
-- ----------------------------
DROP TABLE IF EXISTS `management_user`;
CREATE TABLE `management_user`  (
  `account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_delete` tinyint(1) NOT NULL DEFAULT 0,
  `sort` int(11) NOT NULL DEFAULT 999,
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL,
  `gmt_modified` datetime(0) NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `is_locked` tinyint(1) UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `account`(`account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of management_user
-- ----------------------------
INSERT INTO `management_user` VALUES ('aabbcc', '2312421', 1, 44, NULL, '2019-02-23 23:23:35', '2019-02-24 15:31:13', '测试', 7, 0);
INSERT INTO `management_user` VALUES ('aabcc12', '2312421', 0, 44, NULL, '2019-02-24 15:00:17', '2019-02-24 15:00:17', '屈远测试', 8, 0);
INSERT INTO `management_user` VALUES ('aabbcc222', '2312421', 0, 44, NULL, '2019-02-24 21:53:53', '2019-02-24 21:53:53', '测试', 9, 0);
INSERT INTO `management_user` VALUES ('aabbcc22255', '2312421', 0, 44, NULL, '2019-02-25 12:29:49', '2019-02-25 12:29:49', '测试测试测试', 10, 0);
INSERT INTO `management_user` VALUES ('wangdong', '38964', 0, 999, NULL, '2019-02-27 00:04:18', '2019-02-27 00:04:18', '大为', 11, 0);
INSERT INTO `management_user` VALUES ('wangdouu8ng', '38964', 0, 999, NULL, '2019-02-27 00:13:24', '2019-02-27 00:13:24', '大为', 12, 0);
INSERT INTO `management_user` VALUES ('hhhhh8ng', '38964', 0, 999, NULL, '2019-02-27 00:21:53', '2019-02-27 00:21:53', '我是为', 13, 0);
INSERT INTO `management_user` VALUES ('hhhhttth8ng', '38964', 0, 999, NULL, '2019-02-27 00:42:07', '2019-02-27 00:42:07', '我是屈远', 14, 0);
INSERT INTO `management_user` VALUES ('quyuan', '111111', 0, 999, NULL, '2019-02-27 01:37:26', '2019-02-27 13:28:48', '希罗测试金卡会员', 15, 0);
INSERT INTO `management_user` VALUES ('hahaha', '889211', 0, 999, NULL, '2019-02-27 13:30:11', '2019-02-27 13:35:58', '希罗测试管理员', 16, 0);

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info`  (
  `id` int(11) NOT NULL,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `area` int(11) NULL DEFAULT NULL,
  `interval` int(11) NULL DEFAULT NULL,
  `image_url` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `target_date` datetime(0) NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL DEFAULT NULL,
  `gmt_modified` datetime(0) NULL DEFAULT NULL,
  `type` int(11) NULL DEFAULT NULL,
  `aid` int(11) NULL DEFAULT NULL,
  `typeid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `typeid_idx`(`aid`) USING BTREE,
  INDEX `product_typeid_type_id_idx`(`typeid`) USING BTREE,
  CONSTRAINT `product_aid_area_id` FOREIGN KEY (`aid`) REFERENCES `common_area` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `product_typeid_type_id` FOREIGN KEY (`typeid`) REFERENCES `product_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role_action_association
-- ----------------------------
DROP TABLE IF EXISTS `role_action_association`;
CREATE TABLE `role_action_association`  (
  `role_id` int(11) NOT NULL,
  `action_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`, `action_id`) USING BTREE,
  INDEX `FK_role_action_association2`(`action_id`) USING BTREE,
  CONSTRAINT `FK_role_action_association` FOREIGN KEY (`role_id`) REFERENCES `management_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_role_action_association2` FOREIGN KEY (`action_id`) REFERENCES `management_action` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_role_association
-- ----------------------------
DROP TABLE IF EXISTS `user_role_association`;
CREATE TABLE `user_role_association`  (
  `use_id` int(11) NOT NULL,
  `rol_id` int(11) NOT NULL,
  PRIMARY KEY (`use_id`, `rol_id`) USING BTREE,
  INDEX `FK_user_role_association2`(`rol_id`) USING BTREE,
  CONSTRAINT `FK_user_role_association` FOREIGN KEY (`use_id`) REFERENCES `management_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_user_role_association2` FOREIGN KEY (`rol_id`) REFERENCES `management_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role_association
-- ----------------------------
INSERT INTO `user_role_association` VALUES (13, 1);
INSERT INTO `user_role_association` VALUES (14, 1);
INSERT INTO `user_role_association` VALUES (16, 1);
INSERT INTO `user_role_association` VALUES (13, 2);
INSERT INTO `user_role_association` VALUES (14, 2);

SET FOREIGN_KEY_CHECKS = 1;
