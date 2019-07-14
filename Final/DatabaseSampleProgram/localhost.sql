-- phpMyAdmin SQL Dump
-- version 2.9.1.1
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Mar 29, 2016 at 04:56 AM
-- Server version: 5.0.27
-- PHP Version: 5.2.0
-- 
-- Database: `mydatabase`
-- 
CREATE DATABASE `mydatabase` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `mydatabase`;

-- --------------------------------------------------------

-- 
-- Table structure for table `user`
-- 

CREATE TABLE `user` (
  `Id` int(10) NOT NULL,
  `Name` varchar(100) collate latin1_general_ci NOT NULL,
  `Contact` varchar(50) collate latin1_general_ci NOT NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- 
-- Dumping data for table `user`
-- 

INSERT INTO `user` VALUES (1, 'Test', '01561230156456');
INSERT INTO `user` VALUES (2, 'ABC', '56458611564');
INSERT INTO `user` VALUES (3, 'XYZ', '25141456156');
INSERT INTO `user` VALUES (4, 'pXYZ', '25141456156');
