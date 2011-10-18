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
  `content` varchar(300) NOT NULL COMMENT '����',
  `sortno` int(11) NOT NULL COMMENT '�������',
  `type_id` int(10) unsigned NOT NULL COMMENT '����id',
  `picture` varchar(100) DEFAULT NULL COMMENT '��ͼ��url',
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
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk������id',
  `name` varchar(50) NOT NULL COMMENT '��������',
  `sortno` int(11) NOT NULL COMMENT '�������',
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
  `name` varchar(50) NOT NULL COMMENT '�û���',
  `password` varchar(20) NOT NULL COMMENT '�û�����',
  `email` varchar(50) NOT NULL COMMENT '�û������ʼ�',
  `reg_date` datetime NOT NULL COMMENT '�û�ע��ʱ��',
  `reg_ip` varchar(32) NOT NULL COMMENT '�û�ע���ip��ַ',
  `status` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '�ʺ�״̬����ϸ��',
  `score` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '����',
  `last_login_date` datetime DEFAULT NULL COMMENT '����ʱ�䣨����Ҫÿ���һ�ε�¼���ӻ�����Ҫ���ֶΣ�',
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
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk�����͵����id',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '�û���id',
  `msg_id` bigint(20) unsigned NOT NULL COMMENT '���͵���Ϣid����msg���е�id���Ӧ',
  `send_date` datetime NOT NULL COMMENT '���͵�ʱ��',
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
  `user_id` bigint(20) unsigned NOT NULL COMMENT '�û���id',
  `weibo_id` varchar(100) NOT NULL COMMENT '�û�΢��id',
  `msg_content` varchar(300) NOT NULL COMMENT '΢������',
  `msg_picture` varchar(100) DEFAULT NULL COMMENT '��ͼ��url',
  `send_time` int(11) NOT NULL COMMENT '��ǰ��Ϣ��Ҫ���͵�ʱ�䣬ʹ��unix_timestamp',
  `is_send` char(1) NOT NULL COMMENT '��ǰ��Ϣ�Ƿ��Ѿ����ͣ�y��ʾ�Ѿ����ͣ�n��ʾδ���ͣ�Ĭ��ֵΪn',
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
  `user_id` bigint(20) unsigned NOT NULL COMMENT '�û���id',
  `weibo_id` varchar(100) NOT NULL COMMENT '�û�΢��id',
  `weibo_email` varchar(100) DEFAULT NULL COMMENT '�û���΢��email��ȡ�õ��ʹ�����',
  `token` varchar(100) NOT NULL COMMENT 'oauth��֤��ʽ ���ʵ�token',
  `token_secret` varchar(100) NOT NULL COMMENT 'oauth��֤��ʽ ���ʵ�token secret',
  `weibo_type` char(1) NOT NULL COMMENT '�û�΢�������ͣ�Ŀǰֻ֧�����֣�s��ʾ����΢����q��ʾ��Ѷ��΢��',
  `nick` varchar(50) NOT NULL COMMENT '΢���ǳ�',
  `location` varchar(50) NOT NULL COMMENT '�û����ڵ�',
  `head` varchar(300) NOT NULL COMMENT '�û�΢��ͷ��',
  `introduction` varchar(800) NOT NULL COMMENT '���˽���',
  PRIMARY KEY (`id`),
  KEY `users_weibo_user_id_weibo_id` (`user_id`,`weibo_id`),
  KEY `users_weibo_weibo_id_weibo_type` (`weibo_id`,`weibo_type`),
  KEY `users_weibo_token_token_secret` (`token`,`token_secret`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_weibo
-- ----------------------------
