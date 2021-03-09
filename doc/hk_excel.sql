/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50726
Source Host           : 127.0.0.1:3306
Source Database       : hk_excel

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-03-09 11:22:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) DEFAULT NULL,
  `bir` timestamp NULL DEFAULT NULL,
  `no` varchar(30) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('23', '机器人0号', '2020-09-13 11:00:00', '522401199708139634', '贵州遵义');
INSERT INTO `t_user` VALUES ('24', '机器人1号', '2020-09-14 11:00:00', '522401199708139635', '贵州毕节');
INSERT INTO `t_user` VALUES ('25', '机器人2号', '2020-09-15 11:00:00', '522401199708139636', '北京');
INSERT INTO `t_user` VALUES ('26', '机器人3号', '2020-09-16 11:00:00', '522401199708139637', '贵州贵阳');
INSERT INTO `t_user` VALUES ('27', '机器人4号', '2020-09-17 11:00:00', '522401199708139638', '厦门');
INSERT INTO `t_user` VALUES ('28', '机器人0号', '2020-09-13 11:00:00', '522401199708139634', '贵州遵义');
INSERT INTO `t_user` VALUES ('29', '机器人1号', '2020-09-14 11:00:00', '522401199708139635', '贵州毕节');
INSERT INTO `t_user` VALUES ('30', '机器人2号', '2020-09-15 11:00:00', '522401199708139636', '北京');
INSERT INTO `t_user` VALUES ('31', '机器人3号', '2020-09-16 11:00:00', '522401199708139637', '贵州贵阳');
INSERT INTO `t_user` VALUES ('32', '机器人4号', '2020-09-17 11:00:00', '522401199708139638', '厦门');
