CREATE database kafka_learn;

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address_id` int(11) unsigned DEFAULT NULL,
  `dts` varchar(255), 
  `amount` int(11),
  `bank_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (`bank_id`) REFERENCES `bank` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


