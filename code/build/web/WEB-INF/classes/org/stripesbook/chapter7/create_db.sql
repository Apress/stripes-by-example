create database stripesbook;

use `stripesbook`;
grant all privileges on stripesbook.* to 'stripesbook'@localhost identified by 'password';


CREATE TABLE `dvds` (
  `id` INTEGER  NOT NULL AUTO_INCREMENT,
  `title` TEXT  NOT NULL,
  `genre` TEXT,
  `cost` FLOAT,
  PRIMARY KEY (`id`)
);

commit;
