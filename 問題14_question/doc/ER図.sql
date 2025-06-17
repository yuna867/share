SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS strage_size;




/* Create Tables */

CREATE TABLE strage_size
(
	id int unsigned NOT NULL AUTO_INCREMENT,
	size int unsigned,
	date datetime,
	PRIMARY KEY (id)
);



