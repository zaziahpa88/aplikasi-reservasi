-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 08, 2023 at 01:09 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datagor`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `datakaryawan`
--

CREATE TABLE `datakaryawan` (
  `id_karyawan` varchar(30) NOT NULL,
  `nama_karyawan` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `no_tlp` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datakaryawan`
--

INSERT INTO `datakaryawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `no_tlp`, `alamat`) VALUES
('IDK0001', 'Afif', 'Laki-Laki', '08129312731', 'Jl. Zakaria'),
('IDK0002', 'Dodi', 'Laki-Laki', '08128312724', 'Jl. Kelapa 2'),
('IDK0003', 'Syafii', 'Laki-Laki', '08281283172', 'Jl. Margonda'),
('IDK0004', 'Diva', 'Laki- Laki', '08219199971', 'JL Swadaya II'),
('IDK0005', 'Aldi', 'Laki-Laki', '08327236322', 'Kemang Selatan');

-- --------------------------------------------------------

--
-- Table structure for table `datalapangan`
--

CREATE TABLE `datalapangan` (
  `id_lapangan` varchar(20) NOT NULL,
  `no_lapangan` varchar(20) NOT NULL,
  `tipe_lapangan` varchar(50) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datalapangan`
--

INSERT INTO `datalapangan` (`id_lapangan`, `no_lapangan`, `tipe_lapangan`, `harga`) VALUES
('IDP0001', '100A', 'A1', '55.000'),
('IDP0002', '99A', 'A2', '45.000'),
('IDP0003', '98A', 'A3', '35.000'),
('IDP0004', '97A', 'A3', '35.000'),
('IDP0005', '96A', 'A2', '45.000');

-- --------------------------------------------------------

--
-- Table structure for table `datapelanggan`
--

CREATE TABLE `datapelanggan` (
  `id_pelanggan` varchar(30) NOT NULL,
  `nama_pelanggan` varchar(20) NOT NULL,
  `no_tlp` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datapelanggan`
--

INSERT INTO `datapelanggan` (`id_pelanggan`, `nama_pelanggan`, `no_tlp`, `alamat`) VALUES
('IDP0001', 'Dodi', '0831478623', 'Kelapa Dua'),
('IDP0002', 'Aldi', '0832642337', 'Kemang Selatan'),
('IDP0003', 'Dika', '0826523723', 'Kemang Selatan'),
('IDP0004', 'Zaziah', '08126377481', 'Lenteng Agung'),
('IDP0005', 'Samantha', '08126738842', 'Bekasi'),
('IDP0006', 'Andika', '08316463432', 'Depok'),
('IDP0007', 'Taehyung', '081281052367', 'Bogor');

-- --------------------------------------------------------

--
-- Table structure for table `datapembayaran`
--

CREATE TABLE `datapembayaran` (
  `id_pelanggan` varchar(30) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `no_tlp` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `id_lapangan` varchar(20) NOT NULL,
  `no_lapangan` varchar(50) NOT NULL,
  `tipe_lapangan` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL,
  `jam` varchar(50) NOT NULL,
  `tanggal_masuk` varchar(255) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datapembayaran`
--

INSERT INTO `datapembayaran` (`id_pelanggan`, `nama_pelanggan`, `no_tlp`, `alamat`, `id_lapangan`, `no_lapangan`, `tipe_lapangan`, `harga`, `jam`, `tanggal_masuk`, `status`) VALUES
('IDP0001 ', 'Dodi', '0831478623', 'Kelapa Dua', 'IDP0001 ', 'A1', 'A1', '55.000', '11.00 - 12.00', '7-08-2023', 'Sudah Bayar'),
('IDP0002', 'Aldi', '0832642337', 'Kemang Selatan', 'IDP0002', 'A2', 'A1', '45.000', '12.00 - 13.00', '7-08-2023', 'Sudah Bayar'),
('IDP0003', 'Dika', '0826523723', 'Kemang Selatan', 'IDP0003', 'A1', 'A1', '55.000', '10.00 - 11.00', '7-08-2023', 'Sudah Bayar'),
('IDP0004', 'Zaziah', '08126377481', 'Lenteng Agung', 'IDP0004', 'A2', 'A1', '45.000', '14.00 - 15.00', '7-08-2023', 'Sudah Bayar'),
('IDP0005', 'Samantha', '08126738842', 'Bekasi', 'IDP0005', 'A1', 'A1', '55.000', '15.00 - 16.00', '7-08-2023', 'Sudah Bayar'),
('IDP0006', 'Andika', '08316463432', 'Depok', 'IDP0006', 'A2', 'A1', '45.000', '19.00 - 20.00', '7-08-2023', 'Sudah Bayar'),
('IDP0007', 'Taehyung', '081281052367', 'Bogor', 'IDP0001', 'A1', 'A1', '55.000', '12.00 - 13.00', '8-08-2023', 'Sudah Bayar');

-- --------------------------------------------------------

--
-- Table structure for table `datatagihan`
--

CREATE TABLE `datatagihan` (
  `id_pelanggan` varchar(20) NOT NULL,
  `nama_pelanggan` varchar(20) NOT NULL,
  `no_tlp` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `id_lapangan` varchar(35) NOT NULL,
  `no_lapangan` varchar(30) NOT NULL,
  `tipe_lapangan` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL,
  `jam` varchar(50) NOT NULL,
  `tanggal_masuk` varchar(255) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datatagihan`
--

INSERT INTO `datatagihan` (`id_pelanggan`, `nama_pelanggan`, `no_tlp`, `alamat`, `id_lapangan`, `no_lapangan`, `tipe_lapangan`, `harga`, `jam`, `tanggal_masuk`, `status`) VALUES
('IDP0001 ', 'Dodi', '0831478623', 'Kelapa Dua', 'IDP0001 ', 'A1', 'A1', '55.000', '11.00 - 12.00', '7-08-2023', 'Belum Bayar'),
('IDP0002', 'Aldi', '0832642337', 'Kemang Selatan', 'IDP0002', 'A2', 'A1', '45.000', '12.00 - 13.00', '7-08-2023', 'Belum Bayar'),
('IDP0003', 'Dika', '0826523723', 'Kemang Selatan', 'IDP0003', 'A1', 'A1', '55.000', '10.00 - 11.00', '7-08-2023', 'Belum Bayar'),
('IDP0004', 'Zaziah', '08126377481', 'Lenteng Agung', 'IDP0004', 'A2', 'A1', '45.000', '14.00 - 15.00', '7-08-2023', 'Belum Bayar'),
('IDP0005', 'Samantha', '08126738842', 'Bekasi', 'IDP0005', 'A1', 'A1', '55.000', '15.00 - 16.00', '7-08-2023', 'Belum Bayar'),
('IDP0006', 'Andika', '08316463432', 'Depok', 'IDP0006', 'A2', 'A1', '45.000', '19.00 - 20.00', '7-08-2023', 'Belum Bayar'),
('IDP0007', 'Taehyung', '081281052367', 'Bogor', 'IDP0001', 'A1', '100A', '55.000', '12.00 - 13.00', '8-08-2023', 'Belum Bayar');

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `id_status` varchar(10) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datakaryawan`
--
ALTER TABLE `datakaryawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `datalapangan`
--
ALTER TABLE `datalapangan`
  ADD PRIMARY KEY (`id_lapangan`);

--
-- Indexes for table `datapelanggan`
--
ALTER TABLE `datapelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `datapembayaran`
--
ALTER TABLE `datapembayaran`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `datatagihan`
--
ALTER TABLE `datatagihan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id_status`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `datatagihan`
--
ALTER TABLE `datatagihan`
  ADD CONSTRAINT `datatagihan_ibfk_2` FOREIGN KEY (`id_lapangan`) REFERENCES `datalapangan` (`id_lapangan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `datatagihan_ibfk_3` FOREIGN KEY (`id_pelanggan`) REFERENCES `datapelanggan` (`id_pelanggan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
