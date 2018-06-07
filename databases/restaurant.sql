-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2015 at 05:31 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `serial` int(100) NOT NULL,
  `name` varchar(150) NOT NULL,
  `unit_price` int(100) NOT NULL,
  `quantity` int(150) NOT NULL,
  `total` int(150) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`serial`, `name`, `unit_price`, `quantity`, `total`, `date`) VALUES
(1, 'name', 100, 16, 1600, '2015-12-16 23:10:05'),
(2, 'new', 1200, 10, 12000, '2015-12-16 23:17:32'),
(3, 'test', 1234, 10, 12340, '2015-12-17 03:58:19'),
(4, 'notun', 2000, 10, 20000, '2015-12-17 04:17:59'),
(5, 'test', 1234, 1, 1234, '2015-12-17 04:21:50'),
(6, 'notun', 2000, 1, 2000, '2015-12-17 04:29:58');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_id` int(150) NOT NULL,
  `category` varchar(150) NOT NULL,
  `name` varchar(150) NOT NULL,
  `quantity` int(150) NOT NULL,
  `unit_price` int(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_id`, `category`, `name`, `quantity`, `unit_price`, `date`) VALUES
(1, 'Starter', 'new', 100, 1200, '2015-12-16 21:56:22'),
(2, 'Main', 'test', 120, 1234, '2015-12-16 21:56:44'),
(3, 'Desert', 'anothertest', 105, 1400, '2015-12-16 21:57:42'),
(4, 'Starter', 'notun', 130, 2000, '2015-12-16 21:58:07'),
(5, 'Main', 'notun2', 120, 2500, '2015-12-16 21:58:54'),
(6, 'Desert', 'test', 500, 3040, '2015-12-16 21:59:36');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `sn` int(150) NOT NULL,
  `name` varchar(150) NOT NULL,
  `unit_price` int(100) NOT NULL,
  `quantity` int(150) NOT NULL,
  `total` int(150) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` tinyint(10) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `name`, `user_name`, `password`, `role`, `date`) VALUES
(1, 'sajib', 'sajib', '1234', 1, '2015-12-16 21:52:44'),
(2, 'protick', 'protick', '1234', 1, '2015-12-16 21:52:44'),
(3, 'Onne', 'onne', '1234', 2, '2015-12-16 21:52:44');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`serial`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sn`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `serial` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `sn` int(150) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
