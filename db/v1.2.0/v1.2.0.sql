/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-01-15 20:19:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `test_table`
-- ----------------------------
DROP TABLE IF EXISTS `test_table`;
CREATE TABLE `test_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `colume1` int(11) NOT NULL,
  `colume_char` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `age` (`age`),
  KEY `colume1` (`colume1`),
  KEY `colume_char` (`colume_char`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test_table
-- ----------------------------
INSERT INTO `test_table` VALUES ('1', '20', '1', 'www');
INSERT INTO `test_table` VALUES ('2', '20', '3', 'qqq');
INSERT INTO `test_table` VALUES ('3', '20', '16', 'aaa');
INSERT INTO `test_table` VALUES ('4', '10', '16', 'zzz');
INSERT INTO `test_table` VALUES ('5', '15', '16', 'ccc');
INSERT INTO `test_table` VALUES ('6', '20', '1', 'vvv');
INSERT INTO `test_table` VALUES ('7', '15', '22', '11');

-- ----------------------------
-- Table structure for `test_user`
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `creator` varchar(255) DEFAULT NULL,
  `modifier` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', '2017-01-15 19:08:36', null, null, null, 'wyc', '0', null);
