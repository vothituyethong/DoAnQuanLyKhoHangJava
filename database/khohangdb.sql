-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2020 at 10:48 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `khohangdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `ct_pn`
--

CREATE TABLE `ct_pn` (
  `MA_PN` varchar(20) NOT NULL,
  `MA_HANG` varchar(20) NOT NULL,
  `SLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ct_pn`
--

INSERT INTO `ct_pn` (`MA_PN`, `MA_HANG`, `SLUONG`) VALUES
('N001', 'BA001', 50),
('N001', 'KE002', 15),
('N002', 'KE003', 20),
('N002', 'SK001', 30),
('N003', 'BA005', 30),
('N003', 'SK002', 30),
('N004', 'BA004', 25),
('N004', 'SK003', 25),
('N005', 'BA003', 25),
('N006', 'KE001', 15),
('N006', 'KE005', 30),
('N007', 'SK002', 25),
('N007', 'SK004', 15),
('N008', 'BA002', 10),
('N009', 'SK004', 20),
('N009', 'SK005', 20),
('N010', 'BA005', 10),
('N010', 'KE002', 15),
('N011', 'BA005', 5),
('N011', 'SK004', 5),
('N012', 'BA001', 3),
('N012', 'BA005', 4),
('N012', 'SK001', 2),
('N013', 'BA002', 10),
('N013', 'BA004', 20),
('N014', 'KE003', 10),
('N014', 'KE004', 5),
('N014', 'SK005', 5),
('N015', 'BA006', 10),
('N015', 'SK001', 5),
('N015', 'SK003', 5);

-- --------------------------------------------------------

--
-- Table structure for table `ct_px`
--

CREATE TABLE `ct_px` (
  `MA_PX` varchar(20) NOT NULL,
  `MA_HANG` varchar(20) NOT NULL,
  `SLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ct_px`
--

INSERT INTO `ct_px` (`MA_PX`, `MA_HANG`, `SLUONG`) VALUES
('X001', 'BA001', 5),
('X001', 'KE002', 10),
('X002', 'KE001', 8),
('X002', 'SK003', 10),
('X003', 'BA003', 7),
('X003', 'SK001', 8),
('X004', 'SK001', 15),
('X005', 'BA002', 8),
('X005', 'BA004', 5),
('X005', 'BA005', 10),
('X006', 'SK001', 20),
('X007', 'KE002', 10),
('X007', 'KE005', 20),
('X008', 'SK002', 25),
('X009', 'BA001', 15),
('X009', 'BA003', 10),
('X010', 'KE003', 5),
('X010', 'SK005', 20),
('X011', 'BA003', 5),
('X011', 'KE005', 5),
('X012', 'BA001', 10),
('X012', 'BA003', 5);

-- --------------------------------------------------------

--
-- Table structure for table `hanghoa`
--

CREATE TABLE `hanghoa` (
  `MA_HANG` varchar(20) NOT NULL,
  `TEN_HANG` varchar(50) NOT NULL,
  `SO_LUONG` int(11) NOT NULL,
  `GIA` int(11) NOT NULL,
  `MA_LOAI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hanghoa`
--

INSERT INTO `hanghoa` (`MA_HANG`, `TEN_HANG`, `SO_LUONG`, `GIA`, `MA_LOAI`) VALUES
('BA001', 'Bánh bơ trứng Richy', 103, 36500, 'BA'),
('BA002', 'Bánh bông lan kem Solite', 60, 59000, 'BA'),
('BA003', 'Bánh Choco-Pie Orion', 65, 55000, 'BA'),
('BA004', 'Bánh gạo nướng vị truyền thống Orion An gói 151.2g', 60, 20500, 'BA'),
('BA005', 'Bánh xốp nhân phomai Richeese Nabati', 60, 43000, 'BA'),
('BA006', 'Bánh Doowee Donut socola', 60, 62000, 'BA'),
('KE001', 'Kẹo nhai socola hương bạc hà Dynamite Chews', 57, 20000, 'KE'),
('KE002', 'Kẹo mềm hương trái cây Alpenliebe', 50, 13500, 'KE'),
('KE003', 'Kẹo mút Milkita túi lớn 50 cây', 55, 80000, 'KE'),
('KE004', 'Socola sữa nhân hạt macca Henk', 60, 30500, 'KE'),
('KE005', 'Kẹo socola sữa M&M gói 40g', 65, 10500, 'KE'),
('SK001', 'Snack khoai tây vị kim chi Hàn Quốc OStar', 59, 22000, 'SK'),
('SK002', 'Snack khoai tây vị bit tết New York Swing', 74, 21000, 'SK'),
('SK003', 'Snack khoai tây vị tảo biển OStar', 60, 22000, 'SK'),
('SK004', 'Snack rong biển giòn vị chua cay Tao Kae Noi', 60, 23000, 'SK'),
('SK005', 'Snack que nhân sữa Oishi Akiko', 55, 21500, 'SK');

-- --------------------------------------------------------

--
-- Table structure for table `k_hang`
--

CREATE TABLE `k_hang` (
  `MA_KH` varchar(20) NOT NULL,
  `TEN_KH` varchar(50) NOT NULL,
  `D_CHI` varchar(50) NOT NULL,
  `SDT` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `k_hang`
--

INSERT INTO `k_hang` (`MA_KH`, `TEN_KH`, `D_CHI`, `SDT`) VALUES
('CHAL', 'Cửa hàng Ánh Linh', '46C Nguyễn Văn Trỗi, P. 15, Q. Phú Nhuận', '02838449224'),
('CHBB', 'Cửa hàng bánh Bon Bon', '19 Đường 3 Tháng 2, P. 11, Q. 10', '02838344746'),
('CHDN', 'Cửa hàng Dủ Nguyên', '1D Lê Quang Sung, P. 2, Q. 6', '02839690052'),
('CHHA', 'Cửa hàng Hồng Anh', 'D1/8 ấp 4, X. Bình Chánh, H. Bình Chánh', '02838758464'),
('CHHH', 'Cửa hàng bánh kẹo Hồng Hoa', '351/2A Nguyễn Trọng Tuyển, P. 1, Q. Tân Bình', '02838445591'),
('CHHT', 'Cửa hàng Huyền Trân', '93 Lê Văn Lương, P. Tân Kiểng, Q. 7', '02837711768'),
('CHTH', 'Cửa hàng Thiên Hương', '47/1A Phan Văn Hớn, X. Bà Điểm, H. Hóc Môn', '02837125951'),
('CHTK', 'Cửa hàng bánh kẹo Thiền Ký', '58 Bến Cần Giuộc,P. 11, Q. 8', '02838565388'),
('CHTP', 'Cửa hàng bánh kẹo Thanh Phương', '74/2 Nguyễn ảnh Thủ, P. Trung Mỹ Tây, Q. 12', '02838834437'),
('CHTV', 'Cửa hàng bánh kẹo Thùy Vân', '130/3 ấp Trung Chánh, X. Trung Chánh, H. Hóc Môn', '02837183614');

-- --------------------------------------------------------

--
-- Table structure for table `loaihang`
--

CREATE TABLE `loaihang` (
  `MA_LOAI` varchar(20) NOT NULL,
  `TEN_LOAI` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaihang`
--

INSERT INTO `loaihang` (`MA_LOAI`, `TEN_LOAI`) VALUES
('BA', 'Bánh'),
('KE', 'Kẹo'),
('SK', 'Snack');

-- --------------------------------------------------------

--
-- Table structure for table `ncc`
--

CREATE TABLE `ncc` (
  `MA_NCC` varchar(20) NOT NULL,
  `TEN_NCC` varchar(50) NOT NULL,
  `D_CHI` varchar(50) NOT NULL,
  `SDT` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ncc`
--

INSERT INTO `ncc` (`MA_NCC`, `TEN_NCC`, `D_CHI`, `SDT`) VALUES
('BKHT', 'CTy TM DV Hương Thủy', 'C10, 39, Nguyễn Hữu Thọ, Nhà Bè', '02836209955'),
('CLTH', 'CTy  TM Lợi Thành Hưng', '325 -327 Bến Phú Lâm, P. 9, Q. 6', '02839600695'),
('DVDV', 'Cty TNHH TM Đại Vinh', '67, Đức Hòa, Long An', '0933388484'),
('DVMK', 'CTy TNHH TM Mai Kim', '60K Lê Thị Riêng, Q1', '02838298280'),
('PPLP', 'CTy CP Lai Phú', '95 Bàu Cát 3, Q. Tân Bình', '02839491725'),
('PTQT', 'CTy CP Phú Trường', 'B09 Nguyễn Văn Linh, Q7', '02854121595'),
('TMHT', 'CTy TNHH TM Hùng Thu', '6/17 Phạm Văn Hai, Q. Tân Bình', '02838454155'),
('TMKP', 'CTy TNHH TM Kim Phúc', '79/11 Trần Huy Liệu, Q. Phú Nhuận', '02838728434'),
('TPAN', 'Cty TNHH TP Ân Nam', '41 Thảo Điền - P. Thảo Điền, Q. 2', '02835126400'),
('VTNP', 'CTy TNHH Nguyễn Phước', '71/12/36 Nguyễn Bặc , Q. Tân Bình', '02838449925');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MA_NV` varchar(20) NOT NULL,
  `TEN_NV` varchar(32) NOT NULL,
  `NG_SINH` date NOT NULL,
  `G_TINH` varchar(3) NOT NULL,
  `D_CHI` varchar(30) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `CHUC_VU` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MA_NV`, `TEN_NV`, `NG_SINH`, `G_TINH`, `D_CHI`, `SDT`, `CHUC_VU`) VALUES
('001', 'Đặng Thị Tiểu My', '2000-09-16', 'Nữ', '273 An Dương Vương, P3, Q5', '0767231827', 'Quản trị viên'),
('002', 'Vũ Thị Hải Hương', '2000-11-24', 'Nữ', '105 Bà Huyện Thanh Quan, Q3', '0371521963', 'Nhân viên xuất-nhập'),
('003', 'Võ Thị Tuyết Hồng', '2000-02-14', 'Nữ', '04 Tôn Đức Thắng, Q1', '0527741476', 'Nhân viên xuất-nhập'),
('004', 'Trần Lê Ngọc Huyền', '2000-09-11', 'Nữ', '20 Ngô Thời Nhiệm, Q3', '0738459367', 'Nhân viên xuất-nhập'),
('005', 'Bùi Thị Cẩm Huyền', '2000-09-22', 'Nữ', '06 Nguyễn Trãi, Q5', '0568300148', 'Nhân viên xuất-nhập'),
('006', 'Nguyễn Minh An', '1998-11-30', 'Nam', '24 Dương Bá Trạc, Q8', '0776417241', 'Nhân viên xuất-nhập'),
('007', 'Nguyễn Trần Đức Nghĩa', '1999-03-05', 'Nam', '201 Hồng Bàng, Q5', '0341018467', 'Nhân viên xuất-nhập'),
('008', 'Phạm Quốc Minh', '2001-10-19', 'Nam', '173 Tô Hiến Thành, Q10', '0901006334', 'Quản lý'),
('009', 'Dương Ngọc Vinh', '1999-07-25', 'Nam', '32 Cao Lỗ, Q8', '0941026500', 'Quản lý'),
('010', 'Ngô Thanh Ngọc', '1997-05-15', 'Nữ', '236 Bến Vân Đồn, Q4', '0331019169', 'Nhân viên xuất-nhập');

-- --------------------------------------------------------

--
-- Table structure for table `p_nhap`
--

CREATE TABLE `p_nhap` (
  `MA_PN` varchar(20) NOT NULL,
  `NGAY_LAP` date NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_NCC` varchar(20) NOT NULL,
  `TONG_TIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `p_nhap`
--

INSERT INTO `p_nhap` (`MA_PN`, `NGAY_LAP`, `MA_NV`, `MA_NCC`, `TONG_TIEN`) VALUES
('N001', '2020-01-15', '002', 'PPLP', 2027500),
('N002', '2020-02-28', '003', 'BKHT', 2260000),
('N003', '2020-02-06', '005', 'DVDV', 1920000),
('N004', '2020-03-10', '004', 'TPAN', 1062500),
('N005', '2020-03-17', '006', 'DVMK', 1375000),
('N006', '2020-04-22', '009', 'TPAN', 615000),
('N007', '2020-03-29', '002', 'DVDV', 870000),
('N008', '2017-04-30', '005', 'DVMK', 590000),
('N009', '2020-04-06', '008', 'BKHT', 890000),
('N010', '2020-04-08', '005', 'DVDV', 632500),
('N011', '2020-06-04', '002', 'VTNP', 330000),
('N012', '2020-06-08', '007', 'BKHT', 325500),
('N013', '2020-06-08', '003', 'CLTH', 1000000),
('N014', '2020-06-15', '002', 'TPAN', 1060000),
('N015', '2020-06-15', '002', 'VTNP', 840000);

-- --------------------------------------------------------

--
-- Table structure for table `p_xuat`
--

CREATE TABLE `p_xuat` (
  `MA_PX` varchar(20) NOT NULL,
  `NGAY_LAP` date NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_KH` varchar(20) NOT NULL,
  `TONG_TIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `p_xuat`
--

INSERT INTO `p_xuat` (`MA_PX`, `NGAY_LAP`, `MA_NV`, `MA_KH`, `TONG_TIEN`) VALUES
('X001', '2020-01-17', '005', 'CHHA', 317500),
('X002', '2020-11-25', '003', 'CHDN', 380000),
('X003', '2020-01-24', '006', 'CHTP', 561000),
('X004', '2020-02-25', '008', 'CHAL', 330000),
('X005', '2020-02-02', '004', 'CHTK', 1004500),
('X006', '2020-02-08', '007', 'CHBB', 440000),
('X007', '2020-02-13', '009', 'CHHT', 345000),
('X008', '2020-03-01', '003', 'CHTV', 525000),
('X009', '2020-03-09', '004', 'CHTH', 1097500),
('X010', '2020-03-15', '006', 'CHTP', 830000),
('X011', '2020-06-04', '002', 'CHHH', 327500),
('X012', '2020-06-15', '002', 'CHHH', 640000);

-- --------------------------------------------------------

--
-- Table structure for table `quyen`
--

CREATE TABLE `quyen` (
  `MA_QUYEN` varchar(20) NOT NULL,
  `TEN_QUYEN` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `quyen`
--

INSERT INTO `quyen` (`MA_QUYEN`, `TEN_QUYEN`) VALUES
('AD', 'Quản trị hệ thống'),
('EM', 'Nhân viên'),
('MN', 'Quản lý');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` text NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_QUYEN` varchar(20) NOT NULL,
  `KHOA` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`USERNAME`, `PASSWORD`, `MA_NV`, `MA_QUYEN`, `KHOA`) VALUES
('admin', 'fddd21b9d7ce17da93c30fa5a653a1df', '001', 'AD', 0),
('mn1', 'b0baee9d279d34fa1dfd71aadb908c3f', '008', 'MN', 0),
('mn2', '3d2172418ce305c7d16d4b05597c6a59', '009', 'MN', 0),
('nv1', '827ccb0eea8a706c4c34a16891f84e7b', '002', 'EM', 0),
('nv2', 'dcddb75469b4b4875094e14561e573d8', '003', 'EM', 0),
('nv3', 'b7bc2a2f5bb6d521e64c8974c143e9a0', '004', 'EM', 0),
('nv4', '79b7cdcd14db14e9cb498f1793817d69', '005', 'EM', 1),
('nv5', 'c5fe25896e49ddfe996db7508cf00534', '006', 'EM', 0),
('nv6', 'ae8b5aa26a3ae31612eec1d1f6ffbce9', '007', 'EM', 0),
('nv7', '22a4d9b04fe95c9893b41e2fde83a427', '010', 'EM', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ct_pn`
--
ALTER TABLE `ct_pn`
  ADD PRIMARY KEY (`MA_PN`,`MA_HANG`);

--
-- Indexes for table `ct_px`
--
ALTER TABLE `ct_px`
  ADD PRIMARY KEY (`MA_PX`,`MA_HANG`);

--
-- Indexes for table `hanghoa`
--
ALTER TABLE `hanghoa`
  ADD PRIMARY KEY (`MA_HANG`);

--
-- Indexes for table `k_hang`
--
ALTER TABLE `k_hang`
  ADD PRIMARY KEY (`MA_KH`);

--
-- Indexes for table `loaihang`
--
ALTER TABLE `loaihang`
  ADD PRIMARY KEY (`MA_LOAI`);

--
-- Indexes for table `ncc`
--
ALTER TABLE `ncc`
  ADD PRIMARY KEY (`MA_NCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MA_NV`);

--
-- Indexes for table `p_nhap`
--
ALTER TABLE `p_nhap`
  ADD PRIMARY KEY (`MA_PN`);

--
-- Indexes for table `p_xuat`
--
ALTER TABLE `p_xuat`
  ADD PRIMARY KEY (`MA_PX`);

--
-- Indexes for table `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`MA_QUYEN`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`USERNAME`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
