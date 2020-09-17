/*
 Navicat MySQL Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : stusys

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 14/09/2020 19:00:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 64 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'ah', '123', '@qq.com');
INSERT INTO `user` VALUES (4, 'jk', 'a786', NULL);
INSERT INTO `user` VALUES (5, 'jk0', 'a7860', NULL);
INSERT INTO `user` VALUES (6, 'jk1', 'a7861', NULL);
INSERT INTO `user` VALUES (7, 'jk2', 'a7862', NULL);
INSERT INTO `user` VALUES (8, 'jk3', 'a7863', NULL);
INSERT INTO `user` VALUES (9, 'jk4', 'a7864', NULL);
INSERT INTO `user` VALUES (10, 'jk5', 'a7865', NULL);
INSERT INTO `user` VALUES (11, 'jk6', 'a7866', NULL);
INSERT INTO `user` VALUES (12, 'jk7', 'a7867', NULL);
INSERT INTO `user` VALUES (13, 'jk8', 'a7868', NULL);
INSERT INTO `user` VALUES (14, 'jk9', 'a7869', NULL);
INSERT INTO `user` VALUES (15, 'jk10', 'a78610', NULL);
INSERT INTO `user` VALUES (16, 'jk11', 'a78611', NULL);
INSERT INTO `user` VALUES (17, 'jk12', 'a78612', NULL);
INSERT INTO `user` VALUES (18, 'jk13', 'a78613', NULL);
INSERT INTO `user` VALUES (19, 'jk14', 'a78614', NULL);
INSERT INTO `user` VALUES (20, 'jk15', 'a78615', NULL);
INSERT INTO `user` VALUES (21, 'jk16', 'a78616', NULL);
INSERT INTO `user` VALUES (25, 'jk0', 'a7860', '0@qq.com');
INSERT INTO `user` VALUES (26, 'jk1', 'a7861', '1@qq.com');
INSERT INTO `user` VALUES (27, 'jk2', 'a7862', '2@qq.com');
INSERT INTO `user` VALUES (28, 'jk3', 'a7863', '3@qq.com');
INSERT INTO `user` VALUES (29, 'jk4', 'a7864', '4@qq.com');
INSERT INTO `user` VALUES (30, 'jk5', 'a7865', '5@qq.com');
INSERT INTO `user` VALUES (31, 'jk6', 'a7866', '6@qq.com');
INSERT INTO `user` VALUES (32, 'jk7', 'a7867', '7@qq.com');
INSERT INTO `user` VALUES (33, 'jk8', 'a7868', '8@qq.com');
INSERT INTO `user` VALUES (34, 'jk9', 'a7869', '9@qq.com');
INSERT INTO `user` VALUES (35, 'jk10', 'a78610', '10@qq.com');
INSERT INTO `user` VALUES (36, 'jk11', 'a78611', '11@qq.com');
INSERT INTO `user` VALUES (37, 'jk12', 'a78612', '12@qq.com');
INSERT INTO `user` VALUES (38, 'jk13', 'a78613', '13@qq.com');
INSERT INTO `user` VALUES (39, 'jk14', 'a78614', '14@qq.com');
INSERT INTO `user` VALUES (40, 'jk15', 'a78615', '15@qq.com');
INSERT INTO `user` VALUES (41, 'jk16', 'a78616', '16@qq.com');
INSERT INTO `user` VALUES (42, 'jk17', 'a78617', '17@qq.com');
INSERT INTO `user` VALUES (43, 'jk18', 'a78618', '18@qq.com');
INSERT INTO `user` VALUES (44, 'jk19', 'a78619', '19@qq.com');
INSERT INTO `user` VALUES (45, 'jk0', 'a7860', '0@qq.com');
INSERT INTO `user` VALUES (46, 'jk1', 'a7861', '1@qq.com');
INSERT INTO `user` VALUES (47, 'jk2', 'a7862', '2@qq.com');
INSERT INTO `user` VALUES (48, 'jk3', 'a7863', '3@qq.com');
INSERT INTO `user` VALUES (49, 'jk4', 'a7864', '4@qq.com');
INSERT INTO `user` VALUES (50, 'jk5', 'a7865', '5@qq.com');
INSERT INTO `user` VALUES (51, 'jk6', 'a7866', '6@qq.com');
INSERT INTO `user` VALUES (52, 'jk7', 'a7867', '7@qq.com');
INSERT INTO `user` VALUES (53, 'jk8', 'a7868', '8@qq.com');
INSERT INTO `user` VALUES (54, 'jk9', 'a7869', '9@qq.com');
INSERT INTO `user` VALUES (55, 'jk10', 'a78610', '10@qq.com');
INSERT INTO `user` VALUES (56, 'jk11', 'a78611', '11@qq.com');
INSERT INTO `user` VALUES (57, 'jk12', 'a78612', '12@qq.com');
INSERT INTO `user` VALUES (58, 'jk13', 'a78613', '13@qq.com');
INSERT INTO `user` VALUES (59, 'jk14', 'a78614', '14@qq.com');
INSERT INTO `user` VALUES (60, 'jk15', 'a78615', '15@qq.com');
INSERT INTO `user` VALUES (61, 'jk16', 'a78616', '16@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
