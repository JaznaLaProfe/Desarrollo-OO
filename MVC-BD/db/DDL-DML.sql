/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Jazna
 */

DROP DATABASE dsyapp;
CREATE DATABASE IF NOT EXISTS dsyapp;
USE dsyapp;

CREATE TABLE pelicula (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT, 
    nombre VARCHAR(50) NOT NULL,
    aparicion int NOT NULL,
    popularidad DECIMAL(4,2) NOT NULL,
    primary key (id)
);

INSERT INTO pelicula(nombre, aparicion, popularidad)
VALUES('Rapido y furioso', 2001, 6.7);

INSERT INTO pelicula(nombre, aparicion, popularidad)
VALUES('El padrino', 1972, 6.8);

INSERT INTO pelicula(nombre, aparicion, popularidad)
VALUES('Rocky II', 1979, 6.0);


