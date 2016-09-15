DROP SCHEMA IF EXISTS `test2`;
CREATE SCHEMA IF NOT EXISTS `test2` /*!40100 DEFAULT CHARACTER SET utf8 */;


DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idusers` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `enabled` INT(4) DEFAULT '1',
  PRIMARY KEY (`idusers`)
) ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` VALUES (0,'dummy','dummy','dummy@dummy.nl',1),(1,'mark','test','udr013@gmail.com',1),(2,'sas','sas','sas@sas.sa',1);/*!40000 ALTER TABLE `users` ENABLE KEYS */;



--
--  Table structure for table `records`
--

DROP TABLE IF EXISTS `records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `records` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album` varchar(1000) DEFAULT NULL,
  `artist` char(255) DEFAULT NULL,
  `date_of_release` date DEFAULT NULL,
  `label` varchar(250) DEFAULT NULL,
  `price` DOUBLE DEFAULT NULL,
  `format` varchar(45) DEFAULT NULL,
  `idusers` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)

);

--
-- Dumping data for table `records`
--


/*!40000 ALTER TABLE `records` DISABLE KEYS */;
INSERT INTO `records` VALUES (3,'Electric LadyLand','Jimi hendrix','1969-01-01','Polydors',35.56,'LP2',0),(4,'Sex Style','Kool Keith','1993-01-01','Copastatic',25.30,'LP2',2),
  (5,'Pauls Boutique','Beastie Boys','1989-01-01','Capitol',22.56,'LP',1),(9,'It takes a nation of millions to hold us back','Public Enemy','1988-01-01','Def Jam',24.10,'LP2',1),(35,'Al Along The Watchtower','Bob Dylan','1967-06-13','Polydor',13.77,'10',1),(37,'Nevermind','Nirvana','2016-05-12','DX',0.15,'10',1),(38,'Sign o the times','Prince','2016-05-11','Pasley Park',0.12,'LP3',3);

