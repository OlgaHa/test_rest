-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: test_rest
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `t_rest`
--

DROP TABLE IF EXISTS `t_rest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_rest` (
  `id_rest` int NOT NULL,
  `name_rest` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `city_rest` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address_rest` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `district_rest` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `free_tables_rest` int NOT NULL,
  `max_free_tables_rest` int NOT NULL,
  PRIMARY KEY (`id_rest`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_rest`
--

LOCK TABLES `t_rest` WRITE;
/*!40000 ALTER TABLE `t_rest` DISABLE KEYS */;
INSERT INTO `t_rest` VALUES (1,'Cuba Cafe','Rīga','Jauniela 15','Centra rajons',16,20),(2,'Vincents','Rīga','Elizabetes iela 19','Centra rajons',12,20),(3,'MadHouse','Rīga','Kaļķu iela 11','Centra rajons',5,25),(4,'ShotCafe','Rīga','Torņa iela 4','Centra rajons',9,10),(5,'Rivjera ','Rīga','Krišjāņa Barona iela 94A','Centra rajons',11,15),(6,'Pipars','Rīga','Brīvības gatve 372','Vidzemes priekšpilsēta',6,15),(7,'test','Rīga','Brīvības 3456','Vidzemes priekšpilsēta',13,14);
/*!40000 ALTER TABLE `t_rest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-20 14:06:54
