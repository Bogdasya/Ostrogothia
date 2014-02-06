CREATE SCHEMA IF NOT EXISTS ostrogothia;
USE ostrogothia;

-- -----------------------------------------------------
-- Table `ostrogothia`.`Authors`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS ostrogothia.Authors(
  idAuthors INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(45) NOT NULL,
	Last_name VARCHAR(45) NOT NULL,
  Patronymic VARCHAR(45) NOT NULL,
  Year INT NOT NULL,
  PRIMARY KEY (idAuthors) )
	ENGINE = InnoDB;

-- -----------------------------------------------------
-- add values into Authors
-- -----------------------------------------------------

INSERT INTO Authors (Name, Last_name, Patronymic, Year)
	VALUES ('xxxx', 'yyyy', 'zzzz', 1111);

INSERT INTO Authors (Name, Last_name, Patronymic, Year)
	VALUES ('qqqq', 'aaaa', 'bbbb', 2222);

-- -----------------------------------------------------
-- add examples of queries Authors
-- -----------------------------------------------------

Select * from Authors;


-- -----------------------------------------------------
-- Table `ostrogothia`.`Articles`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS ostrogothia.Articles(
  idArticle INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(45) NOT NULL,
	Year INT NOT NULL,
	NameAuthor VARCHAR(45) NOT NULL,
  PRIMARY KEY (idArticle) )
	ENGINE = InnoDB;

-- -----------------------------------------------------
-- add values into Articles
-- -----------------------------------------------------
INSERT INTO Articles (Name, Year, NameAuthor)
	VALUES ('xxxx', 1111, 'Cv.Ew,Jo.f');

INSERT INTO Articles (Name, Year, NameAuthor)
	VALUES ('vvvv', 9999, 'Kiol.H.H');

-- -----------------------------------------------------
-- add examples of queries Articles
-- -----------------------------------------------------

SELECT * FROM Articles;


-- -----------------------------------------------------
-- Table `ostrogothia`.`Documents`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS ostrogothia.Documents(
  idDocuments INT NOT NULL AUTO_INCREMENT,
  Type_File VARCHAR(45) NOT NULL,
	Path_File VARCHAR(45) NOT NULL,
  PRIMARY KEY (idDocuments) )
	ENGINE = InnoDB;

-- -----------------------------------------------------
-- add values into Documents
-- -----------------------------------------------------
INSERT INTO Documents (Type_File, Path_File)
	VALUES ('xxxx','C:dls//sdsd/sdsdsd');

INSERT INTO Documents (Type_File, Path_File)
	VALUES ('gggg','C:dls//sdsd/sdsdsd');

-- -----------------------------------------------------
-- add examples of queries Documents
-- -----------------------------------------------------

SELECT * FROM Documents;

-- -----------------------------------------------------
-- Table `ostrogothia`.`Monuments`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS ostrogothia.Monuments(
  idMonument INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(45) NOT NULL,
	Type_Monument VARCHAR(45) NOT NULL,
	Nature_research VARCHAR(45) NOT NULL,
	Finding VARCHAR(100) NOT NULL,
	Authors INT NOT NULL,
	Articles INT NOT NULL,
 	Documents INT NOT NULL,
	Nl FLOAT NOT NULL,
	El FLOAT NOT NULL,
	Hydraulic VARCHAR(200) NOT NULL,
  River_order INT NOT NULL,
	Topographical VARCHAR(100) NOT NULL,
	Region VARCHAR(100) NOT NULL,
	District VARCHAR(100) NOT NULL,
  PRIMARY KEY (idMonument),
	FOREIGN KEY (Authors) REFERENCES Authors(idAuthors),
	FOREIGN KEY (Articles) REFERENCES Articles(idArticle),
	FOREIGN KEY (Documents) REFERENCES Documents(idDocuments))
	ENGINE = InnoDB;

-- -----------------------------------------------------
-- add values into Monuments
-- -----------------------------------------------------

INSERT INTO Monuments (Name, Type_Monument, Nature_research, Finding, Authors, Articles, Documents, Nl, El, Hydraulic, River_order, Topographical, Region, District)
	VALUES ('xxxx', 'rrrr', 'aaaa', '14dw5dwdsd', 1, 2, 1, 1.2645, 4.889, 'tttt', 8, 'dwdwd-edewe', 'RRRR', 'Ewqws');