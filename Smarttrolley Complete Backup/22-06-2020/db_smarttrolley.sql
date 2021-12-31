# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_smarttrolley
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2020-06-22 18:01:14
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_smarttrolley'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_smarttrolley" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_smarttrolley";


#
# Table structure for table 'tbl_feedback'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_feedback" (
  "feedback_id" int(10) unsigned default NULL,
  "feedback_content" varchar(100) default NULL,
  "feedback_date" varchar(50) default NULL,
  "user_id" int(50) default NULL
);



#
# Dumping data for table 'tbl_feedback'
#

LOCK TABLES "tbl_feedback" WRITE;
/*!40000 ALTER TABLE "tbl_feedback" DISABLE KEYS;*/
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id") VALUES
	(NULL,'fjvjg','2020-06-18',2);
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id") VALUES
	(NULL,'assh','2020-06-18',2);
REPLACE INTO "tbl_feedback" ("feedback_id", "feedback_content", "feedback_date", "user_id") VALUES
	(NULL,'hello','2020-06-21',2);
/*!40000 ALTER TABLE "tbl_feedback" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_trolly'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_trolly" (
  "trolly_id" int(10) unsigned NOT NULL auto_increment,
  "trolly_number" varchar(50) default NULL,
  PRIMARY KEY  ("trolly_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_trolly'
#

LOCK TABLES "tbl_trolly" WRITE;
/*!40000 ALTER TABLE "tbl_trolly" DISABLE KEYS;*/
REPLACE INTO "tbl_trolly" ("trolly_id", "trolly_number") VALUES
	('1','1');
/*!40000 ALTER TABLE "tbl_trolly" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_admin" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "admin_name" varchar(50) default NULL,
  "admin_password" varchar(50) default NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tb_admin'
#

LOCK TABLES "tb_admin" WRITE;
/*!40000 ALTER TABLE "tb_admin" DISABLE KEYS;*/
REPLACE INTO "tb_admin" ("id", "admin_name", "admin_password") VALUES
	('1','admin','admin');
/*!40000 ALTER TABLE "tb_admin" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_block'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_block" (
  "block_id" int(11) unsigned NOT NULL auto_increment,
  "block_name" varchar(50) default NULL,
  PRIMARY KEY  ("block_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tb_block'
#

LOCK TABLES "tb_block" WRITE;
/*!40000 ALTER TABLE "tb_block" DISABLE KEYS;*/
REPLACE INTO "tb_block" ("block_id", "block_name") VALUES
	('2','A');
REPLACE INTO "tb_block" ("block_id", "block_name") VALUES
	('3','B');
REPLACE INTO "tb_block" ("block_id", "block_name") VALUES
	('4','C');
REPLACE INTO "tb_block" ("block_id", "block_name") VALUES
	('5','D');
/*!40000 ALTER TABLE "tb_block" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_brand'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_brand" (
  "brand_id" int(10) unsigned NOT NULL auto_increment,
  "brand_name" varchar(50) default NULL,
  PRIMARY KEY  ("brand_id")
) AUTO_INCREMENT=16;



#
# Dumping data for table 'tb_brand'
#

LOCK TABLES "tb_brand" WRITE;
/*!40000 ALTER TABLE "tb_brand" DISABLE KEYS;*/
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('10','Cello');
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('11','Nataraj');
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('12','Addidas');
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('13','Wiki');
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('14','LG');
REPLACE INTO "tb_brand" ("brand_id", "brand_name") VALUES
	('15','Sony');
/*!40000 ALTER TABLE "tb_brand" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_cartitem'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_cartitem" (
  "cart_item_id" int(10) unsigned NOT NULL auto_increment,
  "cart_id" int(10) unsigned default NULL,
  "product_id" int(10) unsigned default NULL,
  "price" int(10) unsigned default NULL,
  "cart_count" int(10) unsigned default NULL,
  PRIMARY KEY  ("cart_item_id")
) AUTO_INCREMENT=15;



#
# Dumping data for table 'tb_cartitem'
#

LOCK TABLES "tb_cartitem" WRITE;
/*!40000 ALTER TABLE "tb_cartitem" DISABLE KEYS;*/
REPLACE INTO "tb_cartitem" ("cart_item_id", "cart_id", "product_id", "price", "cart_count") VALUES
	('13','1','1','20','1');
REPLACE INTO "tb_cartitem" ("cart_item_id", "cart_id", "product_id", "price", "cart_count") VALUES
	('14','1','2','10','2');
/*!40000 ALTER TABLE "tb_cartitem" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_category'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_category" (
  "category_id" int(10) unsigned NOT NULL auto_increment,
  "category_name" varchar(50) default NULL,
  PRIMARY KEY  ("category_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tb_category'
#

LOCK TABLES "tb_category" WRITE;
/*!40000 ALTER TABLE "tb_category" DISABLE KEYS;*/
REPLACE INTO "tb_category" ("category_id", "category_name") VALUES
	('1','Fashion');
REPLACE INTO "tb_category" ("category_id", "category_name") VALUES
	('2','Carrybags');
REPLACE INTO "tb_category" ("category_id", "category_name") VALUES
	('3','Home Appliances');
REPLACE INTO "tb_category" ("category_id", "category_name") VALUES
	('4','Office');
REPLACE INTO "tb_category" ("category_id", "category_name") VALUES
	('5','Writing');
/*!40000 ALTER TABLE "tb_category" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_district'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_district" (
  "district_id" int(10) unsigned NOT NULL auto_increment,
  "district_name" varchar(50) default NULL,
  PRIMARY KEY  ("district_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tb_district'
#

LOCK TABLES "tb_district" WRITE;
/*!40000 ALTER TABLE "tb_district" DISABLE KEYS;*/
REPLACE INTO "tb_district" ("district_id", "district_name") VALUES
	('1','Ernakulam');
/*!40000 ALTER TABLE "tb_district" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_mycart'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_mycart" (
  "cart_id" int(11) unsigned NOT NULL auto_increment,
  "user_id" int(50) default NULL,
  "trolley_id" varchar(50) default NULL,
  "date" date default NULL,
  "total_amount" int(10) unsigned default '0',
  "payment_status" int(10) unsigned default '0',
  "budget" int(10) unsigned default NULL,
  PRIMARY KEY  ("cart_id")
) AUTO_INCREMENT=4;



#
# Dumping data for table 'tb_mycart'
#

# No data found.



#
# Table structure for table 'tb_newsupermarket'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_newsupermarket" (
  "newsupermarket_id" int(10) unsigned NOT NULL auto_increment,
  "newsupermarket_name" varchar(50) default NULL,
  "newsupermarket_owner" varchar(50) default NULL,
  "newsupermarket_address" varchar(50) default NULL,
  "newsupermarket_email" varchar(50) default NULL,
  "newsupermarket_contact" bigint(20) unsigned default NULL,
  "newsupermarket_uname" varchar(50) default NULL,
  "newsupermarket_pwd" varchar(50) default NULL,
  "newsupermarket_plcid" int(50) default NULL,
  "status" int(10) unsigned default NULL,
  "photo" varchar(50) default NULL,
  "aadharno" bigint(20) unsigned default NULL,
  PRIMARY KEY  ("newsupermarket_id")
);



#
# Dumping data for table 'tb_newsupermarket'
#

# No data found.



#
# Table structure for table 'tb_place'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_place" (
  "place_id" int(10) unsigned NOT NULL auto_increment,
  "place_name" varchar(50) default NULL,
  "district_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("place_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tb_place'
#

LOCK TABLES "tb_place" WRITE;
/*!40000 ALTER TABLE "tb_place" DISABLE KEYS;*/
REPLACE INTO "tb_place" ("place_id", "place_name", "district_id") VALUES
	('1','Kolenchery','1');
/*!40000 ALTER TABLE "tb_place" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_product'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_product" (
  "product_id" int(10) unsigned NOT NULL auto_increment,
  "product_name" varchar(50) default NULL,
  "subcategory_id" int(10) unsigned default NULL,
  "brand_id" int(10) unsigned default NULL,
  "product_photo" varchar(50) default NULL,
  "rack_id" int(10) unsigned default NULL,
  "price" int(10) unsigned default NULL,
  PRIMARY KEY  ("product_id")
) AUTO_INCREMENT=12;



#
# Dumping data for table 'tb_product'
#

LOCK TABLES "tb_product" WRITE;
/*!40000 ALTER TABLE "tb_product" DISABLE KEYS;*/
REPLACE INTO "tb_product" ("product_id", "product_name", "subcategory_id", "brand_id", "product_photo", "rack_id", "price") VALUES
	('3','Book','1','2','book.jpg','1','30');
REPLACE INTO "tb_product" ("product_id", "product_name", "subcategory_id", "brand_id", "product_photo", "rack_id", "price") VALUES
	('7','Microwave Oven','3','9','Pro_2011.jpg',NULL,NULL);
REPLACE INTO "tb_product" ("product_id", "product_name", "subcategory_id", "brand_id", "product_photo", "rack_id", "price") VALUES
	('10','ClassMates Notes','7','13','Pro_1349.jpg','3','30');
REPLACE INTO "tb_product" ("product_id", "product_name", "subcategory_id", "brand_id", "product_photo", "rack_id", "price") VALUES
	('11','Cello','4','10','Pro_1812.jpg','4','10');
/*!40000 ALTER TABLE "tb_product" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_producttag'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_producttag" (
  "producttag_id" int(10) unsigned NOT NULL auto_increment,
  "product_id" int(10) unsigned default NULL,
  "producttag_tagid" varchar(50) default NULL,
  "producttag_status" int(10) unsigned default NULL,
  PRIMARY KEY  ("producttag_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tb_producttag'
#

LOCK TABLES "tb_producttag" WRITE;
/*!40000 ALTER TABLE "tb_producttag" DISABLE KEYS;*/
REPLACE INTO "tb_producttag" ("producttag_id", "product_id", "producttag_tagid", "producttag_status") VALUES
	('1','1','575b23436c',NULL);
REPLACE INTO "tb_producttag" ("producttag_id", "product_id", "producttag_tagid", "producttag_status") VALUES
	('2','2','6963efd530',NULL);
REPLACE INTO "tb_producttag" ("producttag_id", "product_id", "producttag_tagid", "producttag_status") VALUES
	('3','3','b99ff5d47',NULL);
/*!40000 ALTER TABLE "tb_producttag" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_rack'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_rack" (
  "rack_id" int(11) NOT NULL auto_increment,
  "block_id" int(10) unsigned default NULL,
  "rack_no" int(10) unsigned default NULL,
  PRIMARY KEY  ("rack_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tb_rack'
#

LOCK TABLES "tb_rack" WRITE;
/*!40000 ALTER TABLE "tb_rack" DISABLE KEYS;*/
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(1,'2','3');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(2,'3','3');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(3,'2','1');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(4,'2','2');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(5,'3','1');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(6,'3','2');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(7,'4','1');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(8,'4','2');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(9,'4','3');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(10,'5','1');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(11,'5','2');
REPLACE INTO "tb_rack" ("rack_id", "block_id", "rack_no") VALUES
	(12,'5','3');
/*!40000 ALTER TABLE "tb_rack" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_register'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_register" (
  "id" int(10) unsigned NOT NULL auto_increment,
  "name" varchar(50) default NULL,
  "address" varchar(50) default NULL,
  "email" varchar(50) default NULL,
  "contactno" bigint(20) unsigned default NULL,
  "gender" varchar(50) default NULL,
  "username" varchar(50) default NULL,
  "password" varchar(50) default NULL,
  "placeid" int(10) unsigned default NULL,
  "photo" varchar(50) default NULL,
  "status" int(10) unsigned default '0',
  "aadharno" bigint(20) unsigned default NULL,
  PRIMARY KEY  ("id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tb_register'
#

LOCK TABLES "tb_register" WRITE;
/*!40000 ALTER TABLE "tb_register" DISABLE KEYS;*/
REPLACE INTO "tb_register" ("id", "name", "address", "email", "contactno", "gender", "username", "password", "placeid", "photo", "status", "aadharno") VALUES
	('1','ajal','Kolenchery','ajaljosem@gmail.com','8943057297','male','ajaljose','ajal@123','1',NULL,'1','889774666332');
REPLACE INTO "tb_register" ("id", "name", "address", "email", "contactno", "gender", "username", "password", "placeid", "photo", "status", "aadharno") VALUES
	('2','ajay','vazhakulam1','ajay@gmail.com','5424241','male','ajay','ajay1','1',NULL,NULL,'4543432132');
/*!40000 ALTER TABLE "tb_register" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_stock'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_stock" (
  "stock_id" int(10) unsigned NOT NULL auto_increment,
  "product_id" int(10) unsigned default NULL,
  "stock_date" date default NULL,
  "stock_time" time default NULL,
  "stock_expirydate" date default NULL,
  "stock_manufacturedate" date default NULL,
  "stock_count" int(10) unsigned default NULL,
  PRIMARY KEY  ("stock_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tb_stock'
#

LOCK TABLES "tb_stock" WRITE;
/*!40000 ALTER TABLE "tb_stock" DISABLE KEYS;*/
REPLACE INTO "tb_stock" ("stock_id", "product_id", "stock_date", "stock_time", "stock_expirydate", "stock_manufacturedate", "stock_count") VALUES
	('1','1','2020-04-10','14:58:00','2020-04-16','2020-04-10','100');
REPLACE INTO "tb_stock" ("stock_id", "product_id", "stock_date", "stock_time", "stock_expirydate", "stock_manufacturedate", "stock_count") VALUES
	('2','7','2020-06-22','11:37:09','2021-06-22','2020-06-01','10');
/*!40000 ALTER TABLE "tb_stock" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_subcategory'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_subcategory" (
  "subcategory_id" int(10) unsigned NOT NULL auto_increment,
  "subcategory_name" varchar(50) default NULL,
  "category_id" int(10) unsigned default NULL,
  PRIMARY KEY  ("subcategory_id")
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tb_subcategory'
#

LOCK TABLES "tb_subcategory" WRITE;
/*!40000 ALTER TABLE "tb_subcategory" DISABLE KEYS;*/
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('1','shoes','1');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('2','Bag','2');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('3','Electronics','3');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('4','Pen','4');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('5','Pencil','5');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('6','TV','3');
REPLACE INTO "tb_subcategory" ("subcategory_id", "subcategory_name", "category_id") VALUES
	('7','Book','5');
/*!40000 ALTER TABLE "tb_subcategory" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tb_userpurchase'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tb_userpurchase" (
  "up_id" int(10) unsigned NOT NULL auto_increment,
  "up_date" date default NULL,
  "up_time" time default NULL,
  "user_id" int(10) unsigned default NULL,
  "up_amount" int(10) unsigned default NULL,
  "up_status" int(10) unsigned default NULL,
  PRIMARY KEY  ("up_id")
);



#
# Dumping data for table 'tb_userpurchase'
#

# No data found.

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
