-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2019 at 10:26 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javalibrary_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(10) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `bookid` varchar(50) NOT NULL,
  `bookname` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `copyno` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `isbn`, `bookid`, `bookname`, `category`, `author`, `copyno`, `price`, `created_at`) VALUES
(8, '978-1-891830-19-8', '01', 'Box Office Poison', 'IT', 'Alex Robinson', 10, 1200, '2019-01-07 17:46:10'),
(9, '978-1-60309-012-4', '02', 'Delayed Replays', 'Science', 'Brian Biggs', 2, 340, '2019-01-07 18:10:43'),
(10, '978-1-891830-77-8', '03', 'Every Girl is the End of the World for Me', 'History', 'Jeffrey Brown', 3, 240, '2019-01-07 18:11:51'),
(11, '978-0-9585783-4-9', '04', 'From Hell', 'Bussiness', 'Alan Moore & Eddie Campbell', 1, 680, '2019-01-07 18:12:41'),
(12, '978-1-60309-098-8', '05', 'God Is Disappointed in You', 'Novel', 'Tom Hart', 4, 560, '2019-01-07 18:13:47'),
(13, '978-1-60309-419-1', '06', 'I Am a Number', 'Comedy', 'Nicolas Mahler', 8, 650, '2019-01-07 18:14:48'),
(14, '978-1-891830-33-4', '07', 'Magic Boy and the Robot Elf', 'Adventure', 'James Kochalka', 3, 1200, '2019-01-07 18:15:37'),
(15, '978-1-891830-29-7', '08', 'Pinky & Stinky', 'Animal', 'James Kochalka', 5, 340, '2019-01-07 18:16:39'),
(16, '978-1-891830-04-4', '09', 'On Parade', 'Novel', 'Warnock', 2, 300, '2019-01-07 18:17:35'),
(17, '978-1-891830-11-2', '10', 'Under the Big Top', 'Adventure', 'Brett Warnock', 12, 750, '2019-01-07 18:18:25');

-- --------------------------------------------------------

--
-- Table structure for table `borrow`
--

CREATE TABLE `borrow` (
  `id` int(10) NOT NULL,
  `membership_no` int(255) NOT NULL,
  `member_name` varchar(255) NOT NULL,
  `book_id` varchar(50) NOT NULL,
  `bookname` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `borrowing_date` varchar(100) NOT NULL,
  `returning_date` varchar(100) NOT NULL,
  `return_ststus` varchar(10) NOT NULL DEFAULT 'False',
  `returned_date` varchar(20) DEFAULT NULL,
  `condetion` varchar(20) NOT NULL DEFAULT 'Satisfied',
  `condetion_Payment` varchar(10) DEFAULT NULL,
  `aditionl_payment` varchar(10) DEFAULT NULL,
  `total_Payment` varchar(10) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrow`
--

INSERT INTO `borrow` (`id`, `membership_no`, `member_name`, `book_id`, `bookname`, `category`, `author`, `borrowing_date`, `returning_date`, `return_ststus`, `returned_date`, `condetion`, `condetion_Payment`, `aditionl_payment`, `total_Payment`, `created_at`) VALUES
(20, 9489, 'Kavindu Theekshana', '01', 'Box Office Poison', 'IT', 'Alex Robinson', 'Jan 7, 2019', 'Jan 14, 2019', 'Done', 'Jan 15, 2019', 'Satisfied', '0', '10', '10', '2019-01-07 18:20:07'),
(21, 9489, 'Kavindu Theekshana', '08', 'Pinky & Stinky', 'Animal', 'James Kochalka', 'Jan 7, 2019', 'Jan 21, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:20:34'),
(22, 9489, 'Kavindu Theekshana', '02', 'Delayed Replays', 'Science', 'Brian Biggs', 'Jan 7, 2019', 'Jan 12, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:20:57'),
(23, 2634, 'Dilshani Senarathne', '03', 'Every Girl is the End of the World for Me', 'History', 'Jeffrey Brown', 'Jan 8, 2019', 'Jan 16, 2019', 'Done', 'Jan 15, 2019', 'Satisfied', '0', '0', '0', '2019-01-07 18:21:22'),
(24, 6898, 'Hasini Desilva', '04', 'From Hell', 'Bussiness', 'Alan Moore & Eddie Campbell', 'Jan 10, 2019', 'Jan 13, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:21:39'),
(25, 2735, 'Ruwan Tharanga', '05', 'God Is Disappointed in You', 'Novel', 'Tom Hart', 'Jan 7, 2019', 'Jan 15, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:21:58'),
(26, 2735, 'Ruwan Tharanga', '06', 'I Am a Number', 'Comedy', 'Nicolas Mahler', 'Jan 6, 2019', 'Jan 14, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:22:20'),
(27, 2315, 'Raji Abeywickrama', '07', 'Magic Boy and the Robot Elf', 'Adventure', 'James Kochalka', 'Jan 7, 2019', 'Jan 14, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:23:12'),
(28, 7391, 'Niwantha Ranawaka', '09', 'On Parade', 'Novel', 'Warnock', 'Jan 7, 2019', 'Jan 14, 2019', 'Done', 'Jan 23, 2019', 'Not Satisfied', '100', '30', '130', '2019-01-07 18:23:29'),
(29, 8497, 'Ravindu Wanninayaka', '10', 'Under the Big Top', 'Adventure', 'Brett Warnock', 'Jan 7, 2019', 'Jan 21, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 18:23:47'),
(30, 9489, 'Kavindu Theekshana', '10', 'Under the Big Top', 'Adventure', 'Brett Warnock', 'Jan 8, 2019', 'Jan 15, 2019', 'False', NULL, 'Satisfied', NULL, NULL, NULL, '2019-01-07 19:28:37');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Membership_No` int(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `user_role` varchar(10) DEFAULT 'user',
  `Full_Name` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Contact_No` varchar(10) NOT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Nic` varchar(10) NOT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `Gender` varchar(6) NOT NULL DEFAULT 'Male',
  `Created_At` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Membership_No`, `Password`, `user_role`, `Full_Name`, `Address`, `Contact_No`, `Email`, `Nic`, `DOB`, `Gender`, `Created_At`) VALUES
(2, 222222, '222222', 'admin', '0', 'No108, Nuwan Perara, Pitipane,Homagane', '0710854153', 'nuwanperera@gmail.com', '971801358V', '1997-12-25', 'Male', '2018-12-22 04:36:52'),
(17, 9489, '111', 'user', 'Kavindu Theekshana', 'Matara', '0715421423', 'kavindutheekshana@gmail.com', '971901306V', 'Jul 8, 1997', 'Male', '2019-01-07 17:57:00'),
(18, 7391, '111', 'user', 'Niwantha Ranawaka', 'Panadura ', '0703272150', 'nranawaka@gmail.com ', '960845624V', 'Aug 7, 1996', 'Male', '2019-01-07 17:58:01'),
(19, 2735, '111', 'user', 'Ruwan Tharanga', 'Kurunegala ', '0719120461', 'rtharanga@gmail.com ', '966453287V', 'Feb 4, 1996', 'Male', '2019-01-07 17:59:00'),
(20, 2315, '111', 'user', 'Raji Abeywickrama', 'Mathara', '0710890929', 'srtpabeywickrama@gamil.com', '957851236V', 'May 10, 1995', 'Female', '2019-01-07 18:00:40'),
(21, 8497, '111', 'user', 'Ravindu Wanninayaka', 'Kurunegala ', '0711617496', 'rwanninayaka@gmail.com ', '942354684v', 'Apr 26, 1994', 'Male', '2019-01-07 18:02:03'),
(22, 2634, '111', 'user', 'Dilshani Senarathne', 'Rathnapura', '0705648953', 'dilshanisenarathne@gmail.com', '956348975V', 'Jun 25, 1995', 'Female', '2019-01-07 18:03:19'),
(23, 6898, '111', 'user', 'Hasini Desilva', 'Matara', '0763548694', 'hdesilva@gmail.com', '956875324V', 'Jan 19, 1995', 'Female', '2019-01-07 18:06:01'),
(24, 5856, '111', 'user', 'Saumya Liyanage', 'Homagama', '0725698420', 'sliyanage@gmail.com', '985684569V', 'Oct 23, 1998', 'Female', '2019-01-07 18:06:44'),
(25, 5832, '111', 'user', 'Sadani Gamage', 'Kandy', '0785964238', 'sgamage@gmail.com', '960456325V', 'Aug 7, 1996', 'Female', '2019-01-07 18:07:27'),
(26, 5990, '111', 'user', 'Kasun Aravinda', 'Gampaha', '0769584632', 'karavinda@gmail.com', '956849354V', 'Apr 1, 1995', 'Male', '2019-01-07 18:08:12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `bookid` (`bookid`);

--
-- Indexes for table `borrow`
--
ALTER TABLE `borrow`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Membership_No` (`Membership_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `borrow`
--
ALTER TABLE `borrow`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
