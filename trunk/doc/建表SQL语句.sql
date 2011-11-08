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
  `content` varchar(300) NOT NULL COMMENT '内容',
  `sortno` int(11) NOT NULL COMMENT '排序序号',
  `type_id` int(10) unsigned NOT NULL COMMENT '类型id',
  `picture` varchar(100) DEFAULT NULL COMMENT '配图的url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg
-- ----------------------------
INSERT INTO msg VALUES ('1', '不吃刚烤面包，远离充电电源，白天多喝水晚上少喝，晚上五点后少吃大餐，每天喝酒不多过一杯，不用冷水服胶囊，睡眠不足八小时人会变笨，手机电池剩一格时不要打电话，剩一格时辐射是平时一千倍，还要记得用左耳接电话，用右耳会直接伤害到大脑，请发给每一个你珍惜朋友', '1', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('2', '【橄榄油手膜】：准备：橄榄油5-8毫升，香蕉一个，保鲜膜。操作：把香蕉捣至泥状，加入橄榄油，充分调匀后，即制成手膜。用面膜刷把它们均匀的涂抹在手部皮肤和指甲上，然后用保鲜膜裹起来，10-15分钟后洗净即可。', '2', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('3', '【这样喝牛奶很伤身】①加糖过多；②牛奶过浓；③牛奶服药；④牛奶加巧克力；⑤酸奶喂婴儿；⑥奶中添加橘汁或柠檬汁；⑦以炼乳代替牛奶；⑧在牛奶中添加米汤稀饭；⑨喝煮沸牛奶；⑩日光下晒牛奶。转给你关心的人吧。', '3', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('4', '【养生又好吃的零食】1.葵花子-养颜；2.花生-能防皮肤病；3.核桃-可秀甲；4.大枣-预防坏血病；5.奶酪-固齿；6.无花果-促进血液循环；7.南瓜子和开心果-健脑；8.奶糖-润肤；9.葡萄干-补血10.芝麻糊-乌发；11.巧克力-怡情；12.薄荷糖-润喉13.柑橘-富含维生素C。', '4', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('5', '【除脚上老皮、老茧的小妙招】取艾叶500克(7元500克)，红花100克(7元50克)。平均分为20份，每日1份(加食醋100克，花椒20粒，食盐2勺)，用纱布包裹加水煮开---用水量为漫到脚踝处即可，趁热泡脚，以15--30分钟为限。', '5', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('6', '【宝宝发烧勿输液，蔬菜三样保平安】在宝宝生病发烧的时候，轻易不要给宝宝吃退烧药，也不要输液！告诉各位妈妈退烧的一个方子：香菜去叶子留茎和根3-4根 白萝卜2-3片 生姜1-2片 加冰糖加水煮15分钟。待温度适中给宝宝喝，宝宝喝下去会出汗退热的。各位妈妈们可以试试看，效果非常好。', '6', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('7', '【缓解头痛的几款花草茶】1、黄菊花：降血压，头痛眩晕、神经性头痛。2、薰衣草：失眠性头痛，舒缓焦虑紧张心情。3、野菊花：平肝明目，风热感冒引发头昏目眩。4、合欢花：宁神，治郁结胸闷，神经衰弱。5、迷迭香：对宿醉、头昏晕眩及紧张性头痛。6、柠檬草：治高血压，头晕。', '7', '1', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('8', '【你是最神马的星座】最可爱的星座(白羊座)、最有钱的星座(金牛座)、最聪明的星座(双子座)、最有型的星座(巨蟹座)、最好玩的星座(狮子座)、最严谨的星座(处女座)、最无私的星座(天秤座)、最宅的星座(天蝎座)、最勇敢的星座(射手座)、最有才的星座(摩羯座)、最善良的星座(水瓶座)，你是神马星座？', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('9', '【最愁嫁的星座】第一名:巨蟹座－悲观态度，害怕变成“老大难”；第二名:双子座－不知从哪来的恐慌，觉得谁也靠不住吧还想找人依靠；第三名:狮子座－有关面子问题，出嫁年纪越大越容易产生不自信心理；第四名:天蝎座；第五名:双鱼座。', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('10', '【12星座女谁最邪恶】冠军（天蝎座）；亚军（双鱼座）；季军（天秤座）；第四名（处女座）；第五名（金牛座）；第六名（水瓶座）；第七名（双子座）；第八名（摩羯座）；第九名（巨蟹座）；第十名（射手座）；第十一名（白羊座）；第十二名（狮子座）', '1', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('11', '【追爱最勇猛的星座女】冠军（牡羊座）、亚军（天蝎座）、季军（射手座）【最爱一个人默默流眼泪的星座】冠军（双子座）、亚军（天蝎座）、季军（射手座）【眼泪比女人还多的星座男】冠军（双鱼座）、亚军（天蝎座）、季军（双子座）', '3', '2', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('12', '【女人是“睡”出来的】①美容觉。指晚上十点至次日凌晨两点。这段时间非常重要，睡好美容觉对保持脸部皮肤的娇嫩很有效。②子午觉。指子时（晚23点到凌晨1点）和午时（11点到13点）。多睡子午觉对身体大有好处。③回笼觉。早上醒来可以睡个回笼觉，能让自己一天精力充沛。', '1', '8', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');
INSERT INTO msg VALUES ('13', '【皮肤排毒法】：一周做三次面膜，在面膜中加维生素C粉和维生素E。自制面膜材料：蜂蜜+牛奶+酵母粉+橄榄油+维生素C粉+维生素E。', '1', '8', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg');

-- ----------------------------
-- Table structure for `msg_type`
-- ----------------------------
DROP TABLE IF EXISTS `msg_type`;
CREATE TABLE `msg_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk，分类id',
  `name` varchar(50) NOT NULL COMMENT '分类名称',
  `sortno` int(11) NOT NULL COMMENT '排序序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg_type
-- ----------------------------
INSERT INTO msg_type VALUES ('1', '健康生活', '1');
INSERT INTO msg_type VALUES ('2', '星座物语', '1');
INSERT INTO msg_type VALUES ('3', '幽默搞笑', '1');
INSERT INTO msg_type VALUES ('4', '经典语录', '1');
INSERT INTO msg_type VALUES ('5', '爱情语录', '1');
INSERT INTO msg_type VALUES ('6', '人生感悟', '1');
INSERT INTO msg_type VALUES ('7', '唯美英语', '1');
INSERT INTO msg_type VALUES ('8', '瘦身美容', '1');
INSERT INTO msg_type VALUES ('9', '美食工场', '1');
INSERT INTO msg_type VALUES ('10', '时尚家居', '1');
INSERT INTO msg_type VALUES ('11', '小说故事', '1');
INSERT INTO msg_type VALUES ('12', '时尚街拍', '1');
INSERT INTO msg_type VALUES ('13', '职场人生', '1');
INSERT INTO msg_type VALUES ('14', '心理测试', '1');
INSERT INTO msg_type VALUES ('15', '创意无限', '1');
INSERT INTO msg_type VALUES ('16', '萌宠动物', '1');
INSERT INTO msg_type VALUES ('17', '影视台词', '1');
INSERT INTO msg_type VALUES ('19', '经典一句话', '1');
INSERT INTO msg_type VALUES ('20', '唯美心语', '1');
INSERT INTO msg_type VALUES ('21', '音乐之声', '1');
INSERT INTO msg_type VALUES ('22', '风景旅行', '1');

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
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk，发送的序号id',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户的id',
  `msg_id` bigint(20) unsigned NOT NULL COMMENT '发送的消息id，与msg表中的id相对应',
  `send_date` datetime NOT NULL COMMENT '发送的时间',
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
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户的id',
  `weibo_id` varchar(3000) NOT NULL,
  `msg_content` varchar(300) NOT NULL COMMENT '微博内容',
  `msg_picture` varchar(100) DEFAULT NULL COMMENT '配图的url',
  `send_time` int(11) NOT NULL COMMENT '当前消息需要发送的时间，使用unix_timestamp',
  `is_send` char(1) NOT NULL COMMENT '当前消息是否已经发送，y表示已经发送，n表示未发送，默认值为n',
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
INSERT INTO users_time_msg VALUES ('51', '1', '[{\"type\":\"S\",\"uwid\":2},{\"type\":\"Q\",\"uwid\":4}]', '【皮肤排毒法】：一周做三次面膜，在面膜中加维生素C粉和维生素E。自制面膜材料：蜂蜜+牛奶+酵母粉+橄榄油+维生素C粉+维生素E。', 'http://www.lsz.gov.cn/uploadfiles/pic/2011111/sy_2011111811653nbsvb2m4zjokvutaayxxpo2935.jpg', '1320680100', 'N', null, '13');

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
  `binddate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `users_weibo_user_id_weibo_id` (`user_id`,`weibo_id`),
  KEY `users_weibo_weibo_id_weibo_type` (`weibo_id`,`weibo_type`),
  KEY `users_weibo_token_token_secret` (`token`,`token_secret`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_weibo
-- ----------------------------
INSERT INTO users_weibo VALUES ('2', '1', '1430778022', null, '7cd3e0f870a0fc1bfd1054b05ec92755', 'd9f8a3621b15690e81abdb59ddb8d7a2', 'S', '胖墩海海', '其他', 'http://tp3.sinaimg.cn/1430778022/50/0/1', '', '2011-10-26 12:40:18');
INSERT INTO users_weibo VALUES ('4', '1', 'zzzsea', '', 'cc16479289a14e47910c2fb78b7ea21d', 'f57882b18c9d7d5a23a6183ea1b1f0f4', 'Q', '本哥', '', 'http://app.qlogo.cn/mbloghead/bcff5ccc0225863bd58e', '', '2011-10-28 13:36:59');
