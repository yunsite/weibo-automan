/*
Navicat MySQL Data Transfer

Source Server         : Weibo
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : weibo

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2011-11-08 12:45:34
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg
-- ----------------------------
INSERT INTO msg VALUES ('1', '���Ըտ������Զ�����Դ��������ˮ�����ٺȣ����������ٳԴ�ͣ�ÿ��ȾƲ����һ����������ˮ�����ң�˯�߲����Сʱ�˻�䱿���ֻ����ʣһ��ʱ��Ҫ��绰��ʣһ��ʱ������ƽʱһǧ������Ҫ�ǵ�������ӵ绰�����Ҷ���ֱ���˺������ԣ��뷢��ÿһ������ϧ����', '1', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('2', '���������Ĥ����׼���������5-8�������㽶һ��������Ĥ�����������㽶������״����������ͣ���ֵ��Ⱥ󣬼��Ƴ���Ĥ������Ĥˢ�����Ǿ��ȵ�ͿĨ���ֲ�Ƥ����ָ���ϣ�Ȼ���ñ���Ĥ��������10-15���Ӻ�ϴ�����ɡ�', '2', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('3', '��������ţ�̺������ټ��ǹ��ࣻ��ţ�̹�Ũ����ţ�̷�ҩ����ţ�̼��ɿ�����������ιӤ���������������֭������֭�������������ţ�̣�����ţ�����������ϡ����������ţ�̣����չ���ɹţ�̡�ת������ĵ��˰ɡ�', '3', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('4', '�������ֺóԵ���ʳ��1.������-���գ�2.����-�ܷ�Ƥ������3.����-����ף�4.����-Ԥ����Ѫ����5.����-�̳ݣ�6.�޻���-�ٽ�ѪҺѭ����7.�Ϲ��ӺͿ��Ĺ�-���ԣ�8.����-�����9.���Ѹ�-��Ѫ10.֥���-�ڷ���11.�ɿ���-���飻12.������-���13.����-����ά����C��', '4', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('5', '����������Ƥ���ϼ��С���С�ȡ��Ҷ500��(7Ԫ500��)���컨100��(7Ԫ50��)��ƽ����Ϊ20�ݣ�ÿ��1��(��ʳ��100�ˣ�����20����ʳ��2��)����ɴ��������ˮ��---��ˮ��Ϊ�������״����ɣ������ݽţ���15--30����Ϊ�ޡ�', '5', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('6', '��������������Һ���߲�������ƽ�����ڱ����������յ�ʱ�����ײ�Ҫ������������ҩ��Ҳ��Ҫ��Һ�����߸�λ�������յ�һ�����ӣ����ȥҶ�������͸�3-4�� ���ܲ�2-3Ƭ ����1-2Ƭ �ӱ��Ǽ�ˮ��15���ӡ����¶����и������ȣ���������ȥ��������ȵġ���λ�����ǿ������Կ���Ч���ǳ��á�', '6', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('7', '������ͷʹ�ļ���ݲ衿1���ƾջ�����Ѫѹ��ͷʹѣ�Ρ�����ͷʹ��2��޹�²ݣ�ʧ����ͷʹ���滺���ǽ������顣3��Ұ�ջ���ƽ����Ŀ�����ȸ�ð����ͷ��Ŀѣ��4���ϻ������������������ƣ���˥����5���Ե��㣺������ͷ����ѣ��������ͷʹ��6�����ʲݣ��θ�Ѫѹ��ͷ�Ρ�', '7', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('8', '���������������������ɰ�������(������)������Ǯ������(��ţ��)�������������(˫����)�������͵�����(��з��)������������(ʨ����)�����Ͻ�������(��Ů��)������˽������(�����)����լ������(��Ы��)�����¸ҵ�����(������)�����вŵ�����(Ħ����)��������������(ˮƿ��)����������������', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('9', '�����޵���������һ��:��з��������̬�ȣ����±�ɡ��ϴ��ѡ����ڶ���:˫��������֪�������Ŀֻţ�����˭Ҳ����ס�ɻ�������������������:ʨ�������й��������⣬�������Խ��Խ���ײ�������������������:��Ы����������:˫������', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('10', '��12����Ů˭��а�񡿹ھ�����Ы�������Ǿ���˫���������������������������������Ů����������������ţ��������������ˮƿ��������������˫���������ڰ�����Ħ���������ھ�������з��������ʮ����������������ʮһ����������������ʮ������ʨ������', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('11', '��׷�������͵�����Ů���ھ���ĵ���������Ǿ�����Ы�����������������������һ����ĬĬ��������������ھ���˫���������Ǿ�����Ы���������������������������Ů�˻���������С��ھ���˫���������Ǿ�����Ы������������˫������', '3', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('12', '��Ů���ǡ�˯�������ġ������ݾ���ָ����ʮ���������賿���㡣���ʱ��ǳ���Ҫ��˯�����ݾ��Ա�������Ƥ���Ľ��ۺ���Ч�����������ָ��ʱ����23�㵽�賿1�㣩����ʱ��11�㵽13�㣩����˯�������������кô����ۻ�������������������˯���������������Լ�һ�쾫�����档', '1', '8', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('13', '��Ƥ���Ŷ�������һ����������Ĥ������Ĥ�м�ά����C�ۺ�ά����E��������Ĥ���ϣ�����+ţ��+��ĸ��+�����+ά����C��+ά����E��', '1', '8', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');

-- ----------------------------
-- Table structure for `msg_type`
-- ----------------------------
DROP TABLE IF EXISTS `msg_type`;
CREATE TABLE `msg_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk������id',
  `name` varchar(50) NOT NULL COMMENT '��������',
  `sortno` int(11) NOT NULL COMMENT '�������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg_type
-- ----------------------------
INSERT INTO msg_type VALUES ('1', '��������', '1');
INSERT INTO msg_type VALUES ('2', '��������', '1');
INSERT INTO msg_type VALUES ('3', '��Ĭ��Ц', '1');
INSERT INTO msg_type VALUES ('4', '������¼', '1');
INSERT INTO msg_type VALUES ('5', '������¼', '1');
INSERT INTO msg_type VALUES ('6', '��������', '1');
INSERT INTO msg_type VALUES ('7', 'Ψ��Ӣ��', '1');
INSERT INTO msg_type VALUES ('8', '��������', '1');
INSERT INTO msg_type VALUES ('9', '��ʳ����', '1');
INSERT INTO msg_type VALUES ('10', 'ʱ�мҾ�', '1');
INSERT INTO msg_type VALUES ('11', 'С˵����', '1');
INSERT INTO msg_type VALUES ('12', 'ʱ�н���', '1');
INSERT INTO msg_type VALUES ('13', 'ְ������', '1');
INSERT INTO msg_type VALUES ('14', '�������', '1');
INSERT INTO msg_type VALUES ('15', '��������', '1');
INSERT INTO msg_type VALUES ('16', '�ȳ趯��', '1');
INSERT INTO msg_type VALUES ('17', 'Ӱ��̨��', '1');
INSERT INTO msg_type VALUES ('19', '����һ�仰', '1');
INSERT INTO msg_type VALUES ('20', 'Ψ������', '1');
INSERT INTO msg_type VALUES ('21', '����֮��', '1');
INSERT INTO msg_type VALUES ('22', '�羰����', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO users VALUES ('1', 'zsea', 'xxxxxx', 'zsea@qq.com', '2011-10-09 07:18:58', '::1', '0', '5', '2011-11-07 19:18:56');

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
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_send_msg
-- ----------------------------
INSERT INTO users_send_msg VALUES ('41', '1', '13', '2011-11-07 23:35:00');

-- ----------------------------
-- Table structure for `users_time_msg`
-- ----------------------------
DROP TABLE IF EXISTS `users_time_msg`;
CREATE TABLE `users_time_msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '�û���id',
  `weibo_id` varchar(3000) NOT NULL,
  `msg_content` varchar(300) NOT NULL COMMENT '΢������',
  `msg_picture` varchar(100) DEFAULT NULL COMMENT '��ͼ��url',
  `send_time` int(11) NOT NULL COMMENT '��ǰ��Ϣ��Ҫ���͵�ʱ�䣬ʹ��unix_timestamp',
  `is_send` char(1) NOT NULL COMMENT '��ǰ��Ϣ�Ƿ��Ѿ����ͣ�y��ʾ�Ѿ����ͣ�n��ʾδ���ͣ�Ĭ��ֵΪn',
  `send_result` varchar(300) DEFAULT NULL,
  `msg_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `users_time_msg_weibo_id_send_time_is_send` (`weibo_id`(255),`send_time`,`is_send`),
  KEY `users_time_msg_user_id_send_time_is_send` (`user_id`,`send_time`,`is_send`),
  KEY `users_time_msg_user_id_weibo_id_send_time_is_send` (`user_id`,`weibo_id`(255),`send_time`,`is_send`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_time_msg
-- ----------------------------
INSERT INTO users_time_msg VALUES ('51', '1', '[{\"type\":\"S\",\"uwid\":2},{\"type\":\"Q\",\"uwid\":4}]', '��Ƥ���Ŷ�������һ����������Ĥ������Ĥ�м�ά����C�ۺ�ά����E��������Ĥ���ϣ�����+ţ��+��ĸ��+�����+ά����C��+ά����E��', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg', '1320680100', 'N', null, '13');

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
  `binddate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `users_weibo_user_id_weibo_id` (`user_id`,`weibo_id`),
  KEY `users_weibo_weibo_id_weibo_type` (`weibo_id`,`weibo_type`),
  KEY `users_weibo_token_token_secret` (`token`,`token_secret`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_weibo
-- ----------------------------
INSERT INTO users_weibo VALUES ('2', '1', '1430778022', null, '7cd3e0f870a0fc1bfd1054b05ec92755', 'd9f8a3621b15690e81abdb59ddb8d7a2', 'S', '�ֶպ���', '����', 'http://tp3.sinaimg.cn/1430778022/50/0/1', '', '2011-10-26 12:40:18');
INSERT INTO users_weibo VALUES ('4', '1', 'zzzsea', '', 'cc16479289a14e47910c2fb78b7ea21d', 'f57882b18c9d7d5a23a6183ea1b1f0f4', 'Q', '����', '', 'http://app.qlogo.cn/mbloghead/bcff5ccc0225863bd58e', '', '2011-10-28 13:36:59');
