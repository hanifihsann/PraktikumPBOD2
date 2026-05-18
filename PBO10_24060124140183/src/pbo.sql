CREATE DATABASE pbo;
USE pbo;
CREATE TABLE person(id INT PRIMARY KEY AUTO_INCREMENT NOT 
NULL,name VARCHAR(100));
SELECT * FROM person;

CREATE DATABASE jdbc_mhs;
USE jdbc_mhs;

CREATE TABLE mahasiswa (
    id INT(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nama VARCHAR(20) NOT NULL
);

INSERT INTO mahasiswa(nama) VALUES
('isan'),
('hasta'),
('ijat');