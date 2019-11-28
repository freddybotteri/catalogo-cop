/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : catalogo

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-10-12 16:56:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cat_curso
-- ----------------------------
DROP TABLE IF EXISTS `cat_curso`;
CREATE TABLE `cat_curso` (
  `cur_nid` int(11) NOT NULL AUTO_INCREMENT,
  `cur_vtitulo` varchar(50) NOT NULL,
  `cur_nsts` int(1) DEFAULT '0',
  `cur_vnivel` varchar(20) DEFAULT NULL,
  `cur_vhoras` varchar(50) DEFAULT NULL,
  `prof_nid` int(11) DEFAULT NULL,
  `cur_fcatalogo` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`cur_nid`),
  KEY `fk_profesor_curso` (`prof_nid`),
  CONSTRAINT `fk_profesor_curso` FOREIGN KEY (`prof_nid`) REFERENCES `cat_profesor` (`prof_nid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cat_curso
-- ----------------------------
INSERT INTO `cat_curso` VALUES ('11', 'Java desde 0', '1', 'Basico', '29', '1', null);
INSERT INTO `cat_curso` VALUES ('12', 'UML', '1', 'Basico', '90', '1', 'Temario_FundamentosDeUML.pdf');

-- ----------------------------
-- Table structure for cat_profesor
-- ----------------------------
DROP TABLE IF EXISTS `cat_profesor`;
CREATE TABLE `cat_profesor` (
  `prof_nid` int(11) NOT NULL AUTO_INCREMENT,
  `prof_vname` varchar(50) NOT NULL,
  `prof_vapellido` varchar(50) NOT NULL,
  PRIMARY KEY (`prof_nid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cat_profesor
-- ----------------------------
INSERT INTO `cat_profesor` VALUES ('1', 'Luis', 'Redondo');
INSERT INTO `cat_profesor` VALUES ('2', 'Martha', 'Martinez');
