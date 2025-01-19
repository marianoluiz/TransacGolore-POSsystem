-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: pos_db
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account types`
--

DROP TABLE IF EXISTS `account types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account types` (
  `account_type` varchar(10) NOT NULL,
  PRIMARY KEY (`account_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account types`
--

LOCK TABLES `account types` WRITE;
/*!40000 ALTER TABLE `account types` DISABLE KEYS */;
INSERT INTO `account types` VALUES ('ADMIN'),('CASHIER');
/*!40000 ALTER TABLE `account types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `account_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `account_type` varchar(10) NOT NULL,
  PRIMARY KEY (`account_id`),
  KEY `account_type_fk` (`account_type`),
  CONSTRAINT `account_type_fk` FOREIGN KEY (`account_type`) REFERENCES `account types` (`account_type`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=202440 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (202424,'KING','12345','ADMIN'),(202435,'ROBANTE','12345','ADMIN'),(202436,'ROBERT','12345','ADMIN'),(202437,'JOHN','12345','CASHIER'),(202438,'FRIAS','12345','CASHIER'),(202439,'SIMON','12345','CASHIER');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory history`
--

DROP TABLE IF EXISTS `inventory history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory history` (
  `inven_date` date NOT NULL,
  `inven_time` time NOT NULL,
  `inven_status` varchar(7) NOT NULL,
  `item_id` int NOT NULL,
  `inven_qty` int NOT NULL,
  KEY `item_id_fk2` (`item_id`),
  KEY `item_status_fk` (`inven_status`),
  CONSTRAINT `item_status_fk` FOREIGN KEY (`inven_status`) REFERENCES `inventory status` (`inven_status`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory history`
--

LOCK TABLES `inventory history` WRITE;
/*!40000 ALTER TABLE `inventory history` DISABLE KEYS */;
INSERT INTO `inventory history` VALUES ('2024-05-30','00:31:06','ADDED',39,0),('2024-05-30','01:49:58','ADDED',40,0),('2024-05-30','08:22:08','ADDED',40,20),('2024-05-30','08:22:34','ADDED',40,1),('2024-05-30','08:22:37','ADDED',40,1),('2024-05-30','08:22:43','ADDED',40,100),('2024-05-30','08:23:19','REMOVED',40,122),('2024-05-30','19:31:03','ADDED',42,10),('2024-06-04','23:49:31','ADDED',43,23),('2024-06-04','23:49:40','ADDED',43,23),('2024-06-05','02:19:45','ADDED',44,56),('2024-06-06','09:00:35','ADDED',45,2323),('2024-06-06','09:00:57','ADDED',46,2323),('2024-06-11','00:16:38','ADDED',19,100),('2024-06-11','13:53:04','ADDED',35,20),('2024-06-11','13:53:38','REMOVED',47,1300),('2024-06-11','14:21:24','ADDED',49,5),('2024-06-11','14:24:07','ADDED',50,1),('2024-06-14','09:13:58','ADDED',51,30),('2024-06-14','09:14:52','ADDED',32,13),('2024-06-14','09:36:16','ADDED',52,20),('2024-06-18','18:54:48','REMOVED',35,4),('2024-06-18','19:16:12','ADDED',53,25),('2024-06-18','19:17:39','ADDED',53,34),('2024-06-18','19:19:10','ADDED',3,4);
/*!40000 ALTER TABLE `inventory history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory status`
--

DROP TABLE IF EXISTS `inventory status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory status` (
  `inven_status` varchar(7) NOT NULL,
  PRIMARY KEY (`inven_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory status`
--

LOCK TABLES `inventory status` WRITE;
/*!40000 ALTER TABLE `inventory status` DISABLE KEYS */;
INSERT INTO `inventory status` VALUES ('ADDED'),('REMOVED');
/*!40000 ALTER TABLE `inventory status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item types`
--

DROP TABLE IF EXISTS `item types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item types` (
  `item_type` varchar(20) NOT NULL,
  PRIMARY KEY (`item_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item types`
--

LOCK TABLES `item types` WRITE;
/*!40000 ALTER TABLE `item types` DISABLE KEYS */;
INSERT INTO `item types` VALUES ('ACCESSORY'),('BOOK'),('CARD'),('CRAFT'),('FLOWER'),('MISCELLANEOUS'),('SCHOOL SUPPLY'),('TOY');
/*!40000 ALTER TABLE `item types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(40) NOT NULL,
  `item_type` varchar(20) NOT NULL,
  `item_price` float NOT NULL,
  `item_stock` int NOT NULL,
  `item_img` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `item_type_fk` (`item_type`),
  CONSTRAINT `item_type_fk` FOREIGN KEY (`item_type`) REFERENCES `item types` (`item_type`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'MONGOL PENCIL NO.1','SCHOOL SUPPLY',8,78,'src/item_images/Mongol 1.jpeg'),(2,'MONGOL PENCIL NO.2','SCHOOL SUPPLY',8,40,'src/item_images/Mongol 1.jpeg'),(3,'MONGOL PENCIL NO.3','SCHOOL SUPPLY',8,100,'src/item_images/mongol 2.jpeg'),(5,'PANDA BALLPEN - RED','SCHOOL SUPPLY',10,83,'src/item_images/panda red.jpeg'),(6,'PANDA BALLPEN - BLUE','SCHOOL SUPPLY',10,96,'src/item_images/panda blue.png'),(8,'GIFT LETTER CARD','CARD',25,41,'src/item_images/gift letter card.jpg'),(9,'CARD STOCK PAPER','CARD',40,5,'src/item_images/card stock paper.jpg'),(10,'GREETINGS CARD','CARD',25,16,'src/item_images/greetings card.jpeg'),(11,'SLVR YELLOW CPL RNG','ACCESSORY',100,36,'src/item_images/silver ylw cpl rng.jpeg'),(12,'VINTAGE FLAME RNG','ACCESSORY',100,3,'src/item_images/vntage flame rng.jpg'),(13,'DIAMOND-STUDDED RNG','ACCESSORY',100,36,'src/item_images/diamond studded ring.jpeg'),(14,'LAYERED CHOKER','ACCESSORY',120,7,'src/item_images/layered choker.jpg'),(15,'PEARL STERLING NCKLCE','ACCESSORY',95,13,'src/item_images/pearl necklce.jpeg'),(16,'HELLO KITY RNG','ACCESSORY',90,6,'src/item_images/hello kitty.jpeg'),(18,'PEARL BLUE EARNGS','ACCESSORY',125,8,'src/item_images/pearl blue earings.jpg'),(19,'ARTIFICIAL ROSE','FLOWER',55,98,'src/item_images/artificial rose.jpeg'),(20,'ARTFCL PINK ROSE','FLOWER',55,122,'src/item_images/artfcial pink rose.jpeg'),(21,'FRESH ROSE','FLOWER',10,75,'src/item_images/fresh rose.jpg'),(22,'FRESH SUNFLWR','FLOWER',110,9,'src/item_images/sunflower.jpeg'),(23,'GIFT BAG - MEDIUM','MISCELLANEOUS',30,61,'src/item_images/gift bag m.jpg'),(24,'GIFT BAG - SMALL','MISCELLANEOUS',20,21,'src/item_images/gift bag S.jpeg'),(25,'GIFT WRAPPER','MISCELLANEOUS',15,100,'src/item_images/gift wrapper.jpg'),(26,'GIFT BAG - LARGE','MISCELLANEOUS',55,99,'src/item_images/gift bag L.jpeg'),(30,'BRACELET','ACCESSORY',53,18,'src/item_images/bracelet.jpeg'),(32,'THE PICTURE OF DORIAN GRAY','BOOK',535,15,'src/item_images/dorian grey.jpeg'),(33,'INTRODUCTION TO ALGORITHMS','BOOK',353,0,'src/item_images/intro to algo.jpg'),(34,'THE ART OF COMPUTER PROGRAMMING','BOOK',425,1,'src/item_images/art of prog.jpeg'),(35,'FULLSTCK REACT BOOK','BOOK',780,19,'src/item_images/fullstack react.jpeg'),(36,'HTML TO REACT: THE ULTMT GUIDE','BOOK',630,8,'src/item_images/html to react.jpeg'),(41,'CROCHETED FLOWER','FLOWER',155,10,'src/item_images/crochet flower.jpeg'),(47,'FRICTION PEN','SCHOOL SUPPLY',83,49,'src/item_images/frixion.jpg'),(51,'SUNGLASSES','MISCELLANEOUS',200,29,'src/item_images/sunglasses.jpg'),(53,'SHIRT','MISCELLANEOUS',150,59,'src/item_images/tourist shirt.jpg');
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `transac_date` date NOT NULL,
  `transac_time` time NOT NULL,
  `item_id` int NOT NULL,
  `item_qty` int NOT NULL,
  KEY `item_id_fk` (`item_id`),
  CONSTRAINT `item_id_fk` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES ('2024-05-29','18:54:57',10,1),('2024-05-30','01:16:21',11,1),('2024-05-30','01:16:21',15,1),('2024-05-30','01:16:21',18,1),('2024-05-30','01:17:14',10,1),('2024-05-30','01:18:45',11,1),('2024-05-30','01:18:45',32,1),('2024-05-30','01:18:57',6,1),('2024-05-30','07:40:20',20,1),('2024-05-30','08:15:41',15,1),('2024-05-30','08:15:41',16,2),('2024-05-30','18:30:04',1,1),('2024-05-30','19:24:32',20,4),('2024-05-30','19:24:32',10,3),('2024-06-05','00:34:10',30,6),('2024-06-06','09:16:53',2,50),('2024-06-06','09:21:44',1,10),('2024-06-06','09:24:18',2,1),('2024-06-06','09:30:10',15,1),('2024-06-06','09:33:36',1,1),('2024-06-06','09:38:56',15,1),('2024-06-06','09:38:56',19,1),('2024-06-06','11:10:59',21,7),('2024-06-06','11:10:59',36,7),('2024-06-06','11:10:59',30,15),('2024-06-06','11:10:59',10,9),('2024-06-06','11:11:43',35,2),('2024-06-06','11:12:26',19,17),('2024-06-06','11:13:44',19,3),('2024-06-06','11:36:17',15,1),('2024-06-11','00:18:11',5,12),('2024-06-11','00:30:51',14,10),('2024-06-11','00:30:51',21,24),('2024-06-11','00:32:51',10,13),('2024-06-11','00:32:51',18,3),('2024-06-11','00:34:04',41,8),('2024-06-11','00:34:04',34,2),('2024-06-11','00:34:04',36,2),('2024-06-11','00:35:02',30,10),('2024-06-11','00:35:02',36,2),('2024-06-11','00:35:02',47,100),('2024-06-11','00:35:48',30,10),('2024-06-11','00:35:48',36,2),('2024-06-11','00:36:36',35,2),('2024-06-11','00:38:12',18,1),('2024-06-17','22:41:59',14,1),('2024-06-17','23:17:51',15,1),('2024-06-17','23:17:51',20,1),('2024-06-17','23:17:51',23,1),('2024-06-18','00:02:22',14,1),('2024-06-18','19:10:54',26,1),('2024-06-18','19:10:54',2,3),('2024-06-18','19:10:54',20,4),('2024-06-18','19:10:54',47,50),('2024-06-18','19:11:41',33,1),('2024-06-18','19:13:41',35,1),('2024-06-18','19:13:41',51,1),('2024-06-18','19:25:24',19,1),('2024-06-18','19:25:24',13,1),('2024-06-18','20:15:45',14,1),('2024-06-18','20:15:45',10,1),('2024-06-18','20:15:45',19,1),('2024-06-18','20:15:45',10,1),('2024-06-18','20:15:45',32,1),('2024-06-18','20:15:45',47,1);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-18 21:08:19
