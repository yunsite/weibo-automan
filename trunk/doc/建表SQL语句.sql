/*
Navicat MySQL Data Transfer

Source Server         : Weibo
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : weibo

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2011-10-09 07:07:38
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `msg`
-- ----------------------------
DROP TABLE IF EXISTS `msg`;
CREATE TABLE `msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `content` varchar(300) NOT NULL COMMENT '内容',
  `sortno` int(11) NOT NULL COMMENT '排序序号',
  `type_id` int(10) unsigned NOT NULL COMMENT '类型id',
  `picture` varchar(100) DEFAULT NULL COMMENT '配图的url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg
-- ----------------------------

-- ----------------------------
-- Table structure for `msg_type`
-- ----------------------------
DROP TABLE IF EXISTS `msg_type`;
CREATE TABLE `msg_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk，分类id',
  `name` varchar(50) NOT NULL COMMENT '分类名称',
  `sortno` int(11) NOT NULL COMMENT '排序序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg_type
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `email` varchar(50) NOT NULL COMMENT '用户电子邮件',
  `reg_date` datetime NOT NULL COMMENT '用户注册时间',
  `reg_ip` varchar(32) NOT NULL COMMENT '用户注册的ip地址',
  `status` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '帐号状态，待细化',
  `score` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '积分',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登时间（若需要每天第一次登录增加积，需要此字段）',
  PRIMARY KEY (`id`),
  KEY `users_name` (`name`),
  KEY `users_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Table structure for `users_send_msg`
-- ----------------------------
DROP TABLE IF EXISTS `users_send_msg`;
CREATE TABLE `users_send_msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk，发送的序号id',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户的id',
  `msg_id` bigint(20) unsigned NOT NULL COMMENT '发送的消息id，与msg表中的id相对应',
  `send_date` datetime NOT NULL COMMENT '发送的时间',
  PRIMARY KEY (`id`),
  KEY `users_send_msg_user_id_msg_id` (`user_id`,`msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_send_msg
-- ----------------------------

-- ----------------------------
-- Table structure for `users_time_msg`
-- ----------------------------
DROP TABLE IF EXISTS `users_time_msg`;
CREATE TABLE `users_time_msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户的id',
  `weibo_id` varchar(100) NOT NULL COMMENT '用户微博id',
  `msg_content` varchar(300) NOT NULL COMMENT '微博内容',
  `msg_picture` varchar(100) DEFAULT NULL COMMENT '配图的url',
  `send_time` int(11) NOT NULL COMMENT '当前消息需要发送的时间，使用unix_timestamp',
  `is_send` char(1) NOT NULL COMMENT '当前消息是否已经发送，y表示已经发送，n表示未发送，默认值为n',
  PRIMARY KEY (`id`),
  KEY `users_time_msg_weibo_id_send_time_is_send` (`weibo_id`,`send_time`,`is_send`),
  KEY `users_time_msg_user_id_send_time_is_send` (`user_id`,`send_time`,`is_send`),
  KEY `users_time_msg_user_id_weibo_id_send_time_is_send` (`user_id`,`weibo_id`,`send_time`,`is_send`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_time_msg
-- ----------------------------

-- ----------------------------
-- Table structure for `users_weibo`
-- ----------------------------
DROP TABLE IF EXISTS `users_weibo`;
CREATE TABLE `users_weibo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户的id',
  `weibo_id` varchar(100) NOT NULL COMMENT '用户微博id',
  `weibo_email` varchar(100) DEFAULT NULL COMMENT '用户的微博email，取得到就存下来',
  `token` varchar(100) NOT NULL COMMENT 'oauth验证方式 访问的token',
  `token_secret` varchar(100) NOT NULL COMMENT 'oauth验证方式 访问的token secret',
  `weibo_type` char(1) NOT NULL COMMENT '用户微博的类型，目前只支持两种：s表示新浪微博、q表示腾讯的微博',
  `nick` varchar(50) NOT NULL COMMENT '微博昵称',
  `location` varchar(50) NOT NULL COMMENT '用户所在地',
  `head` varchar(300) NOT NULL COMMENT '用户微博头像',
  `introduction` varchar(800) NOT NULL COMMENT '个人介绍',
  PRIMARY KEY (`id`),
  KEY `users_weibo_user_id_weibo_id` (`user_id`,`weibo_id`),
  KEY `users_weibo_weibo_id_weibo_type` (`weibo_id`,`weibo_type`),
  KEY `users_weibo_token_token_secret` (`token`,`token_secret`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_weibo
-- ----------------------------
