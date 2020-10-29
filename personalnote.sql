/*
 Navicat Premium Data Transfer

 Source Server         : 个人使用
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : personalnote

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 29/10/2020 14:08:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(20) NOT NULL COMMENT '评论ID',
  `rootid` int(20) NOT NULL COMMENT '根评论ID',
  `noteid` int(20) NOT NULL COMMENT '笔记ID',
  `fromuserid` int(20) NOT NULL COMMENT '评论用户ID',
  `touserid` int(20) NOT NULL COMMENT '被评论用户ID',
  `commentContent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评论内容',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `isdelete` tinyint(4) NOT NULL COMMENT '是否删除：0不删除 1删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '评论表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note`  (
  `id` int(20) NOT NULL COMMENT '笔记ID',
  `themeid` int(20) NOT NULL COMMENT '主题ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '内容',
  `isshare` tinyint(4) NOT NULL COMMENT '是否共享：0不共享 1共享',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `modifytime` bigint(20) NOT NULL COMMENT '修改时间',
  `isdelete` tinyint(4) NOT NULL COMMENT '是否删除：0不删除 1删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '笔记表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of note
-- ----------------------------

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `id` int(20) NOT NULL COMMENT '标签ID',
  `tagname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标签名',
  `userid` int(20) NOT NULL COMMENT '用户ID',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `modifytime` bigint(20) NOT NULL COMMENT '修改时间',
  `isdelete` tinyint(4) NOT NULL COMMENT '是否删除：0不删除 1删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '标签表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for tag_note
-- ----------------------------
DROP TABLE IF EXISTS `tag_note`;
CREATE TABLE `tag_note`  (
  `id` int(20) NOT NULL COMMENT '标签笔记关联ID',
  `tagid` int(20) NOT NULL COMMENT '标签ID',
  `noteid` int(20) NOT NULL COMMENT '笔记ID',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `modifytime` bigint(20) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '标签笔记关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tag_note
-- ----------------------------

-- ----------------------------
-- Table structure for theme
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme`  (
  `id` int(20) NOT NULL COMMENT '主题ID',
  `themename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主题名',
  `userid` int(20) NOT NULL COMMENT '用户ID',
  `islock` tinyint(4) NULL DEFAULT NULL COMMENT '是否上锁： 0不上锁  1上锁',
  `lockpassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主题锁密码',
  `passwordhint` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码提示',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `modifytime` bigint(20) NOT NULL COMMENT '修改时间',
  `isdelete` tinyint(4) NOT NULL COMMENT '是否删除：0不删除 1删除 ',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '主题表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of theme
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户昵称',
  `realname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '真实姓名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `sex` tinyint(4) NULL DEFAULT NULL COMMENT '性别: 0男 1女',
  `mail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `birth` datetime(0) NULL DEFAULT NULL COMMENT '生日',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `createtime` bigint(20) NOT NULL COMMENT '创建时间',
  `modifytime` bigint(20) NOT NULL COMMENT '修改时间',
  `isdelete` tinyint(4) NOT NULL COMMENT '是否删除：0不删除 1删除',
  `power` int(20) NOT NULL COMMENT '权限：0管理员 1用户',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'hhh', 'hhh1', '1234', 0, '123@qq.com', '2020-02-02 12:21:33', '12345', '今天心情好', 1603881066083, 1603881100111, 1, 1);
INSERT INTO `user` VALUES (4, 'asahi', 'asahi1', '1234', 0, '123@qq.com', '2020-02-02 12:21:33', '12345', '今天心情好', 1603937188998, 1603940944066, 0, 1);

SET FOREIGN_KEY_CHECKS = 1;
