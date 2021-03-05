-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2021 at 01:36 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `android`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `useradmin` varchar(10) NOT NULL,
  `passadmin` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `useradmin`, `passadmin`) VALUES
(1, 'admin', 'Admin'),
(2, 'ADMIN', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `gejala`
--

CREATE TABLE `gejala` (
  `id_gejala` int(11) NOT NULL,
  `gejala` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gejala`
--

INSERT INTO `gejala` (`id_gejala`, `gejala`) VALUES
(1, 'Berat badan turun meskipun banyak makan'),
(2, 'Bulu rontok'),
(3, 'Frekuensi urinasi meningkat'),
(4, 'Batuk'),
(5, 'Napas tidak teratur/napas berbunyi'),
(6, 'Kesulitan bernapas'),
(7, 'Kulit kering'),
(8, 'Kuku patah-patah'),
(9, 'Kulit terkelupas'),
(10, 'Frekuensi urinasi menurun'),
(11, 'Keluar lendir dari saluran pernapasan'),
(12, 'Sering membuka mulut'),
(13, 'Aktifitas fisik menurun'),
(14, 'Bibir dan gusi berwarna kebiruan'),
(15, 'Sering menjilat daerah genital'),
(16, 'Adanya darah pada urin'),
(17, 'Tidak nafsu makan'),
(18, 'Merejan kesakitan'),
(19, 'Mengejan saat buang air kecil'),
(20, 'Banyak minum'),
(21, 'Nafsu makan berlebih'),
(22, 'Kesulitan buang air besar'),
(23, 'Demam'),
(24, 'Depresi'),
(25, 'Penurunan berat badan'),
(26, 'Pilek'),
(27, 'Sariawan'),
(28, 'Sering menjilati bulu'),
(29, 'Peradangan pada gusi'),
(30, 'Muntah'),
(31, 'Terlihat dehidrasi'),
(32, 'Kemerahan dan kerak pada kulit kaki belakang'),
(33, 'Peradangan pada hidung'),
(34, 'Air liur keluar secara berlebih'),
(35, 'Terdapat luka pada rongga mulut'),
(36, 'Terlihat ada kotoran yang menempel pada bulu dan tidak bisa hilang'),
(37, 'Peradangan selaput bening mata'),
(38, 'Sering menggaruk badan'),
(39, 'Adanya darah pada feses'),
(40, 'Adanya luka pada kulit disertai kerak seperti sisik'),
(41, 'Feses cair'),
(42, 'Mukosa menjadi kuning'),
(43, 'Diare'),
(44, 'Kotoran yang dikeluarkan sangat sedikit'),
(45, 'Telinga kemerahan dan bengkak'),
(46, 'Telinga beraroma tidak sedap'),
(47, 'Sering menggelengkan kepala'),
(48, 'Diare akut'),
(49, 'Gangguan tidur'),
(50, 'Feses berwarna hitam'),
(51, 'Refleks menelan buruk'),
(52, 'Feses mengandung cacing'),
(53, 'Suhu badan subnormal'),
(54, 'Keluar cairan seperti lendir dari rectum'),
(55, 'Kondisi terus menurun'),
(56, 'Keluar cairan dari telinga'),
(57, 'Selaput lendir pucat'),
(58, 'Mata berair'),
(59, 'Muncul ruam pada kulit'),
(60, 'Muntah darah atau cairan pekat berwarna hitam'),
(61, 'Muntahan disertai cacing'),
(63, 'Berat badan turun meskipun banyak makann');

-- --------------------------------------------------------

--
-- Table structure for table `hasil`
--

CREATE TABLE `hasil` (
  `id_hasil` int(11) NOT NULL,
  `hasil` varchar(100) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hasil`
--

INSERT INTO `hasil` (`id_hasil`, `hasil`, `tanggal`) VALUES
(35, 'Enteritis', '2020-12-02'),
(36, 'Enteritis', '2020-12-02'),
(37, 'Enteritis', '2020-12-02'),
(38, 'Mikosis', '2020-12-02'),
(39, 'Enteritis', '2020-12-02'),
(40, 'Enteritis', '2020-12-02'),
(41, '', '0000-00-00'),
(42, '', '0000-00-00'),
(43, 'Helminthiasis', '0000-00-00'),
(44, 'Helminthiasis', '2021-02-27'),
(45, 'Helminthiasis', '2021-02-28');

-- --------------------------------------------------------

--
-- Table structure for table `kamus`
--

CREATE TABLE `kamus` (
  `id_kamus` int(11) NOT NULL,
  `kata` varchar(250) NOT NULL,
  `arti` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kamus`
--

INSERT INTO `kamus` (`id_kamus`, `kata`, `arti`) VALUES
(1, 'Adopter', 'Pengadopsi'),
(2, 'Adopt Fee', 'Biaya yang harus dikeluarkan untuk mengadopsi kucing'),
(3, 'Agresif', 'Perilaku kucing yang cenderung menyerang tanpa diprovokasi'),
(4, 'Angora', 'Salah satu jenis ras kucing yang memiliki bulu tebal'),
(5, 'Bicolor', 'Istilah untuk pola warna pada bulu kucing dimana sebagian berwarna putih dan sebagian berwarna lain'),
(6, 'Birahi', 'Kondisi dimana kucing sedang ingin kawin'),
(7, 'Blacan', 'Jenis kucing hutan'),
(8, 'Blue', 'Istilah yang digunakan untuk kucing yang memiliki warna bulu abu-abu kebiruan'),
(9, 'Breed', 'Kucing yang masih satu spesies dengan karakteristik keturunan yang sama'),
(10, 'Breeder', 'Peternak kucing'),
(11, 'British Short Hair', 'Salah satu jenis ras kucing yang memiliki bulu lebih pendek dibanding jenis kucing lain'),
(12, 'Calico', 'Istilah Amerika untuk menggambarkan kucing dengan warna bulu tortie dan putih'),
(13, 'Cameo', 'Kucing dengan warna bulu silver yang ujung helai rambutnya merah-coklat atau krem'),
(14, 'Cattery', 'Peternak kucing yang sudah terverifikasi'),
(15, 'Classic Tabby', 'Istilah warna bulu belang pada kucing dengan tanda seperti huruf M pada dahi dan cincin warna pada e'),
(16, 'Coat', 'Lapisan bulu yang tebal, lembut, dan fleksibel pada kucing'),
(17, 'Color Point', 'Kucing dengan warna bulu terang dan memiliki warna gelap pada bagian tertentu'),
(18, 'Color Point Carrier', 'Kucing yang membawa gen color point, tetapi tidak terlihat secara fenotip'),
(19, 'Dilute', 'Istilah untuk merepresentasikan warna yang lebih muda dari warna dasar'),
(20, 'Exo', 'Salah satu jenis kucing persia yang memiliki bulu pendek'),
(21, 'Fault', 'Ketidaksempurnaan. Cacat'),
(22, 'Feral', 'Istilah yang mendeskripsikan kondisi dimana kucing domestik kembali menjadi kucing liar'),
(23, 'Flat Nose', 'Kucing yang memiliki hidung yang lebih pesek dari peak nose'),
(24, 'Golden', 'Warna bulu keemasan'),
(25, 'Hairless', 'Kucing yang mengalami kerontokan bulu sehingga memiliki sedikit bulu ataupun botak'),
(26, 'Harlequin', 'Kucing yang memiliki warna bulu putih antara 1/4 sampai 1/2 bagian tubuh'),
(27, 'Heterokromatik', 'Kucing dengan 2 warna bola mata'),
(28, 'Himalayan', 'Nama lain dari kucing jenis persia dengan pola warna color point'),
(29, 'Inbreeding', 'Perkawinan 2 kucing yang masih mempunyai hubungan keluarga'),
(30, 'Long Hair', 'Kucing yang memiliki bulu panjang'),
(31, 'Lynx Point', 'Pola warna yang terdapat di sekitar telinga, hidung, dan ekor kucing'),
(32, 'Lynx Tip', 'Sekumpulan rambut panjang yang terdapat di ujung telinga kucing'),
(33, 'Mackarel', 'Pola loreng pada bulu kucing yang berbentuk garis lurus'),
(34, 'Marble', 'Pola warna pada kucing klasik dengan rosette di sisi-sisinya'),
(35, 'Mix', 'Perkawinan 2 atau lebih kucing ras sehingga menghasilkan keturunan baru(campuran)'),
(36, 'Non Agoti', 'Suatu gen pada kucing yang menghasilkan pola warna solid'),
(37, 'Patched Tabby', 'Kucing dengan warna bulu tortie yang memiliki belang'),
(38, 'Pattern', 'Istilah yang digunakan untuk menggambarkan pola tertentu pada bulu kucing'),
(39, 'Paw', 'Bantalan yang terdapat pada kaki kucign'),
(40, 'Peak Nose', 'Kucing yang memiliki hidung pipih, salah satu jenis kucing Persia'),
(41, 'Pedigree', 'Sertifikat yang berisikan silsilah keturunan kucing'),
(42, 'Pemacakan', 'Satu proses untuk mengawinkan kucing'),
(43, 'Ras', 'Jenis. Keturunan'),
(44, 'Seal Point', 'Warna resesif yang muncul pada bulu kucing, biasanya berwarna coklat kehitaman'),
(45, 'Smoke', 'Istilah untuk menggambarkan pola warna bulu kucing yang menyerupai asap rokok, berwarna putih pada b'),
(46, 'Tabby', 'Pola warna belang pada bulu kucing'),
(47, 'Tortoiseshell', 'Tortie. Pola Kombinasi 2 warna, merah solid dan hitam dengan batas yang tidak jelas'),
(48, 'Van', 'Istilah yang menggambarkan pola kombinasi warna bulu putih, dengan warna lain hanya muncul disekitar'),
(49, 'Whip Tail', 'Kucing yang memiliki ekor panjang, tipis, dan fleksibel. Biasanya pada kucing jenis Siam, Sphynx, da'),
(50, 'Whisker Pad', 'Bantalan kumis pada kucing. Daerah bagian atas bibir kucing');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE `penyakit` (
  `id_penyakit` int(11) NOT NULL,
  `penyakit` varchar(100) NOT NULL,
  `deskripsi` varchar(1000) NOT NULL,
  `solusi` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`id_penyakit`, `penyakit`, `deskripsi`, `solusi`) VALUES
(1, 'Diabetes', 'Diabetes dinyatakan sebagai suatu keadaan dimana terjadi produksi urin yang melimpah pada penderita. Hal ini disebabkan oleh gangguan metabolisme lipid, karbohidrat, dan protein yang pada gilirannya merangsang kondisi hiperglikemia(kadar gula darah tinggi).', 'Solusi:\r\n1. Menghentikan sementara asupan gula pada pakan maupun minum.\r\n2. Mengganti dengan pakan yang mengandung antioksidan-flavonoid.\r\n3. Jika terlanjur parah, segera bawa ke dokter hewan untuk dilakukan penanganan lebih lanjut.'),
(2, 'Mikosis', 'Mikosis merupakan salah satu penyakit menular yang menyerang bagian luar(kulit) kucing yang disebabkan oleh infeksi jamur Microsporum Canis. Penyakit ini hampir mirip dengan scabies, hanya berbeda penyebab.', 'Solusi:\r\n1. Menjaga kebersihan dan kelembaban lingkungan sekitar.\r\n2. Pemberian obat oral anti jamur.\r\n3. Melakukan diet pada kucing.\r\n4. Oleskan madu, telur, atau minyak zaitun pada daerah yang terinfeksi oleh jamur.'),
(3, 'Otitis', 'Otitis merupakan suatu penyakit peradangan yang menyerang bagian telinga kucing. Biasanya disebabkan oleh tungau telinga, bakteri, kanker, jamur atau luka yang ada pada bagian telinga kucing. Penyakit ini ditandai dengan kucing yang sering menggaruk bagian telinga dan juga keluarnya cairan kotor dan berbau tidak sedap dari dalam telinga.', 'Solusi:\r\n1. Pemberian obat tetes telinga yang mengandung antibiotik dan anti inflamasi jika terjadi pembengkakan.\r\n2. Pemberian obat tetes telinga yang mengandung anti ektoparasit jika di dalam telinga kucing terlihat parasit.'),
(4, 'Enteritis', 'Enteritis merupakan suatu penyakit yang menyerang saluran pencernaan kucing, terjadinya peradangan pada mukosa usus besar. Penyakit ini ditandai dengan diare yang berlebihan dan mengandung darah, serta feses menjadi sangat cair.', 'Solusi:\r\n1. Pemberian antibiotik spektrum luas\r\n2. Pemberian vitamin dan multivitamin\r\n3. Pemberian cairan infus sebagai pengganti cairan tubuh akibat dehidrasi\r\n4. Jika kucing terlihat kesakitan, berikan obat pengurang rasa sakit'),
(5, 'Asma Kucing', 'Asma kucing merupakan penyakit inflamasi saluran pernapasan pada kucing. Sama seperti penyakit asma pada manusia, penyakit ini umumnya disebabkan oleh alergi ataupun kondisi udara yang jelek pada lingkungan sekitar. Ditandai dengan kucing yang tampak kesulitan bernapas, megap-megap, dan mengi.', 'Solusi:\r\n1. Jika terdapat lendir, berikan obat tetes hidung untuk mengencerkan lendir.\r\n2. Memberikan vitamin C.\r\n3. Menjaga lingkungan agar tetap hangat.\r\n4. Memberikan terapi uap pada kucing.'),
(6, 'FLUTD', 'FLUTD adalah suatu penyakit yang menyerang saluran kemih kucing yang disebabkan karena disfungsi kantung kemih maupun uretra kucing. Gejala yang timbul biasanya adalah frekuensi urinasi yang meningkat, nyeri pada saat buang air kecil, dan adanya darah pada urin.', 'Solusi:\r\nJika kucing anda menderita FLUTD, sebaiknya segera bawa ke dokter hewan agar dapat dilakukan penanganan secara tepat. Biasanya dokter hewan akan memberikan antibiotik dan anti inflamasi untuk penanganan sementara. Namun jika sudah terlanjur parah, maka perlu dilakukan operasi.'),
(7, 'Flu Kucing', 'Flu kucing merupakan penyakit menular yang menyerang bagian pernapasan kucing, disebabkan oleh virus influenza. Penyakit ini dapat menular melalui udara, cairan tubuh, maupun kontak langsung. Gejala klinis dari penyakit ini antara lain mata berair, sesak nafas, liur berlebihan, hingga yang paling parah adalah terjadinya pendarahan pada hidung.', 'Solusi:\r\n1. Pemberian makan dan minuman yang hangat(masih mengeluarkan uap) untuk merangsang keluarnya lendir pada hidung kucing.\r\n2. Mandikan kucing dengan air hangat.\r\n3. Jaga agar tubuh kucing tidak sampai kedinginan, berikan selimut yang hangat ketika kucing tidur.'),
(8, 'Gastritis', 'Gastritis merupakan penyakit peradangan pada dinding lambung terutama pada bagian selaput lendir lambung kucing. Biasanya disebabkan oleh makanan yang kotor, tidak teratur, dan kandungan bahan tertentu dalam makanan yang berlebihan. Penyakit ini ditandai dengan kucing yang sering muntah padahal jarang makan, nafsu makan turun drastis, dan kucing terlihat lemas.', 'Solusi:\r\n1. Lakukan diet ringan pada kucing.\r\n2. Jaga agar kucing mendapat asupan makanan yang cukup dan sehat.\r\n3. Pemberian obat pereda nyeri dengan resep dokter.'),
(9, 'Helminthiasis', 'Helminthiasis(cacingan) merupakan salah satu penyakit berbahaya yang menyerang kucing, dikarenakan penyakit ini tidak menunjukkan gejala klinis pada infeksi awal dan baru akan muncul pada infeksi berat atau kronis. Penyebabnya adalah kondisi kandang atau lingkungan yang kotor. Umumnya gejala yang tampak seperti diare, muntah, kehilangan nafsu makan, dan berat badan terus menurun.', 'Solusi:\r\n1. Hindari memberi makan kucing dengan makanan mentah, terutama daging mentah.\r\n2. Sering membersihkan bagian luar anus kucing untuk mengurangi jumlah telur cacing yang mungkin masih menempel.\r\n3.Sering mengganti alas tidur maupun benda apapun yang sering dipakai oleh kucing.\r\n4. Jaga agar kucing tidak terlalu sering menjilati bulu, terutama pada bagian ekor.'),
(10, 'Kutu Kucing', 'Sesuai namanya, penyakit ini disebabkan oleh kutu kucing(Ctenocephalides felis) yang membawa bakteri Bartonella. Gejala yang mungkin tampak dari penyakit ini antara lain kucing sering menggaruk badan, adanya luka pada tubuh, adanya kotoran pada bulu yang susah dihilangkan, serta jika sudah kronis dapat menimbulkan penyakit pes.', 'Solusi:\r\n1. Sering memandikan kucing dengan air hangat.\r\n2. Pastikan selalu menggunakan sabun/shampo anti kutu.\r\n3. Jaga kebersihan tempat tidur kucing secara teratur.\r\n4. Jauhkan kucing dari tempat yang kotor. '),
(11, 'Diare', 'Diare pada kucing biasanya disebabkan oleh tidak higienis nya makanan kucing sehingga terpapar bakteri. Gejala yang biasa tampak adalah kucing terlihat lesu, nafsu makan turun, dan frekuensi buang air besar meningkat.', 'Solusi:\r\n1. Berikan oralit khusus hewan.\r\n2. Jika sering diberikan susu, coba untuk mengurangi frekuensinya(tidak terlalu sering memberikan susu).\r\n3. Mengganti makanan kucing, lebih baik makanan yang mengandung protein nabati.\r\n4. Campurkan madu ataupun multivitamin pada makanan dan minuman kucing.\r\n5. Pastikan kucing mendapat makanan dan minuman yang higienis.'),
(12, 'Megacolon', 'Megacolon adalah suatu gangguan fungsional dimana terjadi peningkatan diameter usus besar. Perubahan ini menyebabkan fungsi usus menjadi abnormal sehingga terjadi konstipasi kronis pada kucing. Penyebab dari penyakit ini adalah adanya benda asing yang masuk ke dalam usus dan menyumbat bagian usus besar. Gejala yang tampak antara lain kesulitan saat buang air besar, kotoran yang dikeluarkan sangat sedikit, dan menurunnya nafsu makan.', 'Solusi:\r\n1. Berikan makanan yang mengandung serat tinggi.\r\n2. Berikan buah-buahan yang tinggi serat(dapat dicampur dengan makanan).\r\n3. Berikan obat pencahar, namun biasanya untuk hewan obat ini harus dengan resep dokter.\r\n4. Jika kucing terlihat sangat kesakitan, berikan analgesik khusus hewan untuk meredakan nyeri.'),
(13, 'Rhinitis', 'Rhinitis merupakan salah satu penyakit yang menyerang saluran pernapasan. Biasanya disebabkan oleh bakteri, virus, atau jamur yang timbul karena kurangnya kebersihan kandang atau lingkungan. Gejala yang tampak antara lain sering bersin, batuk, demam, kesulitan bernapas, hipersalivasi, dan juga membuat selaput lendir hidung terlihat kemerahan dan bengkak.', 'Solusi:\r\n1. Hindari alergen jika ada, karena penyakit ini biasa disebabkan karena reaksi alergi.\r\n2. Berikan makanan dengan kadar nutrisi tinggi untuk membantu menjaga imunitas tubuh.\r\n3. Menjaga agar lingkungan tetap hangat dapat membantu menurunkan resiko penyakit.\r\n4. Sering bersihkan bagian hidung kucing.'),
(14, 'Scabies', 'Scabies merupakan penyakit yang menyerang bagian luar kulit kucing. Penyakit ini disebabkan oleh tungau. Kucing yang mengalami penyakit ini biasanya akan sangat sering menggaruk badan sehingga menimbulkan luka yang cukup parah dan akhirnya menjadi kerak.', 'Solusi:\r\n1. Rutin membersihkan kandang.\r\n2. Mandikan menggunakan shampo anti kutu.\r\n3. Berikan salep untuk mengurangi resiko inflamasi pada luka.\r\n4. Rutin membersihkan alat-alat yang digunakan untuk merawat kucing(sisir, alas tidur).'),
(15, 'Toxoplasmosis', 'Toxoplasmosis merupakan penyakit infeksi pada hewan yang disebabkan oleh Toxoplasma gondii yaitu suatu protozoa intraseluler obligat. Hampir tidak ada gejala klinis pada infeksi awal, namun pada infeksi kronis dapat menyebabkan pembengkakan kelenjar getah bening, dan pembesaran organ hati.', 'Solusi:\r\n1. Jaga kebersihan kandang kucing.\r\n2. Pastikan kucing tidak menjilat daerah genital setelah BAK atau BAB.\r\n3. Pastikan kucing tidak bermain di tempat yang kotor.\r\n4. Rutin memandikan kucing.\r\n5. Hindari pemberian makanan mentah.'),
(16, 'Polycystic Kidney Disease', 'Polycystic Kidney Disease merupakan penyakit ginjal bawaan yang diwariskan melalui gen autosomal dominan yang umumnya ditemukan pada kucing jenis Persia dan persilangannya. Gejala dari penyakit ini antara lain penurunan berat badan, anoreksia, muntah, suhu badan subnormal, dan refleks menelan yang buruk.', 'Solusi:\r\n1. Segera lakukan sterilisasi pada kucing.'),
(17, 'Normal', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(5) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'joni', '12345678'),
(4, 'jono', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `gejala`
--
ALTER TABLE `gejala`
  ADD PRIMARY KEY (`id_gejala`);

--
-- Indexes for table `hasil`
--
ALTER TABLE `hasil`
  ADD PRIMARY KEY (`id_hasil`);

--
-- Indexes for table `kamus`
--
ALTER TABLE `kamus`
  ADD PRIMARY KEY (`id_kamus`);

--
-- Indexes for table `penyakit`
--
ALTER TABLE `penyakit`
  ADD PRIMARY KEY (`id_penyakit`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `gejala`
--
ALTER TABLE `gejala`
  MODIFY `id_gejala` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT for table `hasil`
--
ALTER TABLE `hasil`
  MODIFY `id_hasil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `kamus`
--
ALTER TABLE `kamus`
  MODIFY `id_kamus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `penyakit`
--
ALTER TABLE `penyakit`
  MODIFY `id_penyakit` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
