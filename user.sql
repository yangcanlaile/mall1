/*
Navicat MySQL Data Transfer

Source Server         : 门户
Source Server Version : 50642
Source Host           : 193.112.246.55:3306
Source Database       : newsql

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-01-07 20:10:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(32) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `desc` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'yangcan1', '11', null, null);
INSERT INTO `user` VALUES ('1000', 'yangcan', '10', '13710097312', null);
