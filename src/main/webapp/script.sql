DROP SCHEMA db_jogos_senai;

CREATE SCHEMA db_jogos_senai;

USE db_jogos_senai;

CREATE TABLE jogos 
(
	id 				BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
    ,nome 			VARCHAR(255) NOT NULL
    ,desenvolvedor 	VARCHAR(255)
    ,genero 		VARCHAR(255)
);

INSERT INTO jogos (nome, desenvolvedor, genero) VALUES ('Diablo 3', 'Blizzard', 'RPG'), ('World of Warcraft', 'Blizzard', 'RPG');

CREATE TABLE usuarios 
(
	id 				BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
    ,usuario 			VARCHAR(255) NOT NULL
    ,senha 	VARCHAR(255) NOT NULL
);

INSERT INTO usuarios (usuario, senha) VALUES ('admin', 'admin');