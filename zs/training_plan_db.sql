/*
 Navicat Premium Data Transfer

 Source Server         : root管理
 Source Server Type    : MySQL
 Source Server Version : 80040
 Source Host           : localhost:3306
 Source Schema         : training_plan_db

 Target Server Type    : MySQL
 Target Server Version : 80040
 File Encoding         : 65001

 Date: 20/11/2024 20:46:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for plandoc
-- ----------------------------
DROP TABLE IF EXISTS `plandoc`;
CREATE TABLE `plandoc`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `major_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '专业名称',
  `major_code` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '专业代码',
  `type_id` int NOT NULL COMMENT '专业类别ID',
  `occupation_category` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '主要职业类别',
  `post_category` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '主要岗位类别',
  `author` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '编写人',
  `write_time` date NOT NULL COMMENT '编写时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `type_id`(`type_id` ASC) USING BTREE,
  CONSTRAINT `plandoc_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `plandoctype` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plandoc
-- ----------------------------
INSERT INTO `plandoc` VALUES (1, '智能制造装备技术', '460204', 1, '计算机程序员', '计算机程序设计', '张三哇哇的打啊大大', '2021-11-21');
INSERT INTO `plandoc` VALUES (2, '智能控制技术', '540102', 2, '自动化工程师', '自动化控制', '王五', '2021-06-12');
INSERT INTO `plandoc` VALUES (3, '信息安全技术', '610241', 1, '网络安全工程师', '网络安全管理', '李四', '2021-06-12');
INSERT INTO `plandoc` VALUES (4, '电子商务技术', '530701', 4, '电子商务工程师', '电商运营', '赵六', '2020-11-12');
INSERT INTO `plandoc` VALUES (5, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (16, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (17, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (18, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (19, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (20, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (21, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (22, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');
INSERT INTO `plandoc` VALUES (23, '计算机网络技术', '510201', 1, '网络工程师', '网络管理', '啦啦啦啦啦啦', '2017-11-12');

-- ----------------------------
-- Table structure for plandoctype
-- ----------------------------
DROP TABLE IF EXISTS `plandoctype`;
CREATE TABLE `plandoctype`  (
  `type_id` int NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '专业类别名称',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plandoctype
-- ----------------------------
INSERT INTO `plandoctype` VALUES (1, '计算机服务类');
INSERT INTO `plandoctype` VALUES (2, '计算机类');
INSERT INTO `plandoctype` VALUES (4, '电子商务类');
INSERT INTO `plandoctype` VALUES (5, '自动化类');
INSERT INTO `plandoctype` VALUES (6, '城市信息化管理');

SET FOREIGN_KEY_CHECKS = 1;
