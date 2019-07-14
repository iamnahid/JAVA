-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2016 at 10:25 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `c1`
--

CREATE TABLE `c1` (
  `c1` varchar(30) NOT NULL,
  `c2` varchar(30) NOT NULL,
  `c3` varchar(30) NOT NULL,
  `c4` varchar(30) NOT NULL,
  `cid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `c1`
--

INSERT INTO `c1` (`c1`, `c2`, `c3`, `c4`, `cid`) VALUES
('oop1', 'os', 'stat', 'ooad', '1'),
('pl2', 'phy2', 'e2', 'math2', '2'),
('pl1', 'math1', 'phy1', 'e1', '3'),
('math4', 'PoE', 'Data str', 'DLD', '4'),
('MIS', 'Toc', 'SE', 'OOP2', '5'),
('math4', 'PoE', 'Algo', 'BusComm', '6');

-- --------------------------------------------------------

--
-- Table structure for table `c2`
--

CREATE TABLE `c2` (
  `c1` varchar(30) NOT NULL,
  `c2` varchar(30) NOT NULL,
  `c3` varchar(30) NOT NULL,
  `c4` varchar(30) NOT NULL,
  `cid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `c2`
--

INSERT INTO `c2` (`c1`, `c2`, `c3`, `c4`, `cid`) VALUES
('oop1', 'os', 'stat', 'ooad', '1'),
('pl2', 'phy2', 'e2', 'math2', '2'),
('pl1', 'math1', 'phy1', 'e1', '3'),
('math4', 'PoE', 'Data str', 'DLD', '4'),
('MIS', 'Toc', 'SE', 'OOP2', '5');

-- --------------------------------------------------------

--
-- Table structure for table `cour_list`
--

CREATE TABLE `cour_list` (
  `id` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `credit` int(30) NOT NULL,
  `code` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cour_list`
--

INSERT INTO `cour_list` (`id`, `name`, `credit`, `code`) VALUES
('1101', 'stat', 3, 'MAT 1101'),
('2101', 'ooad', 3, 'CSC 2101'),
('2102', 'os', 3, 'CSC 2102'),
('2103', 'oop1', 3, 'CSC 2103'),
('1102', 'math2', 3, 'MAT 1102'),
('3101', 'e2', 3, 'ENG 3101'),
('0102', 'phy2', 3, 'PHY 0102'),
('2104', 'pl2', 3, 'CSC 2104'),
('3102', 'e1', 3, 'ENG 3102'),
('0101', 'phy1', 3, 'PHY 0101'),
('1103', 'math1', 3, 'MAT 1103'),
('2105', 'pl1', 3, 'CSC 2105'),
('3001', 'DLD', 3, 'EEE 3001'),
('2106', 'Data str', 3, 'CSC 2106'),
('1001', 'PoE', 3, 'BBA 1001'),
('1104', 'math4', 3, 'MAT 1104'),
('2107', 'OOP2', 3, 'CSC 2107'),
('2108', 'SE', 3, 'CSC 2108'),
('2109', 'MIS', 3, 'CSC 2109'),
('2110', 'Toc', 3, 'CSC 2110'),
('3103', 'BusCom', 3, 'ENG 3103');

-- --------------------------------------------------------

--
-- Table structure for table `reg`
--

CREATE TABLE `reg` (
  `c1` varchar(30) NOT NULL,
  `c2` varchar(30) NOT NULL,
  `c3` varchar(30) NOT NULL,
  `c4` varchar(30) NOT NULL,
  `cid` varchar(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `sid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reg`
--

INSERT INTO `reg` (`c1`, `c2`, `c3`, `c4`, `cid`, `sname`, `sid`) VALUES
('oop1', 'os', 'stat', 'ooad', '1', '1', '1'),
('math4', 'PoE', 'Data str', 'DLD', '4', 'Nahid', '14-27656'),
('pl1', 'math1', 'phy1', 'e1', '3', '3', '3'),
('math4', 'PoE', 'Data str', 'DLD', '4', 'Rahid', '14-2000'),
('pl1', 'math1', 'phy1', 'e1', '3', 'Nahid', '14-27656'),
('oop1', 'os', 'stat', 'ooad', '1', 'Rinky', '14-9595'),
('oop1', 'os', 'stat', 'ooad', '1', 'Shipon', '0'),
('math4', 'PoE', 'Data str', 'DLD', '4', 'Jony', '14-0000');

-- --------------------------------------------------------

--
-- Table structure for table `s2`
--

CREATE TABLE `s2` (
  `sname` varchar(50) NOT NULL,
  `sid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `s2`
--

INSERT INTO `s2` (`sname`, `sid`) VALUES
('1', '1'),
('Rahid', '14-2000'),
('Nahid', '14-27656'),
('3', '3');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Name` varchar(50) NOT NULL,
  `Id` varchar(20) NOT NULL,
  `Cgpa` float NOT NULL,
  `Dept` varchar(5) NOT NULL,
  `Pass` varchar(50) NOT NULL,
  `Balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Name`, `Id`, `Cgpa`, `Dept`, `Pass`, `Balance`) VALUES
('Shipon', '0', 4, 'BBA', '0000', 50000),
('1', '1', 1, '1', '1', 1),
('Jony', '14-0000', 2.5, 'BBA', '00', 60000),
('Nihaan', '14-1919', 4, 'CSSE', '1919', 80000),
('Rahid', '14-2000', 3.9, 'CSE', 'abcdef', 90000),
('Nahid', '14-27656', 3.48, 'BBA', '123456', 100000),
('Nazmul', '14-3030', 3, 'BBA', '3030', 70000),
('iamNahid', '14-59595', 0, 'CSSE', '59599', 1e15),
('Rinky', '14-9595', 4, 'CSE', '9595', 110000),
('Nadim', '4848', 4, 'CSIT', '4848', 80000),
('Nadim', '4949', 3, 'CSIT', '4949', 93000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `c2`
--
ALTER TABLE `c2`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `s2`
--
ALTER TABLE `s2`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
