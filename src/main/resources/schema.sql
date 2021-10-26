
DROP TABLE IF EXISTS users;


CREATE TABLE IF NOT EXISTS users (
  id VARCHAR(255) PRIMARY KEY  NOT NULL,
  name VARCHAR(255) NULL,
  email VARCHAR(255) NULL,
  password VARCHAR(255) NULL,
  created DATE NULL,
  modified DATE NULL,
  last_login DATE NULL,
  token VARCHAR(255) NULL,
  isactive TINYINT NULL );

DROP TABLE IF EXISTS phones;


CREATE TABLE IF NOT EXISTS phones (
  id VARCHAR(255) PRIMARY KEY NOT NULL,
  number VARCHAR(255) NULL,
  citycode INT NULL,
  contrycode INT NULL,
  users_id INT NOT NULL,
  CONSTRAINT fk_phones_users
    FOREIGN KEY (users_id)
    REFERENCES users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);