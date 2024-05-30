DROP DATABASE IF EXISTS practica_intermodular; -- Borrar la base de datos si existe
CREATE DATABASE practica_intermodular; -- Creamos la base de datos
USE practica_intermodular; -- Usamos la base de datos

-- creamos la tabla estrella
CREATE TABLE Estrella (
    nombre VARCHAR(50) PRIMARY KEY,
    tipo VARCHAR(10),
    radio_km FLOAT,
    temperatura_superficial_c FLOAT,
    distancia_media_tierra_mkm FLOAT,
    composicion TEXT
);

-- creamos la tabla planeta
CREATE TABLE Planeta (
    nombre VARCHAR(50) PRIMARY KEY,
    radio_km FLOAT,
    distancia_media_sol_mkm FLOAT,
    periodo_orbital_dias FLOAT,
    temperatura_media_c FLOAT,
    tipo_planeta ENUM('Rocoso', 'Gaseoso'),
    num_satelites INT,
    nombre_estrella VARCHAR(50),
    FOREIGN KEY (nombre_estrella) REFERENCES Estrella(nombre)
);

-- creamos la tabla satelite
CREATE TABLE Satelite (
    nombre VARCHAR(50) PRIMARY KEY,
    radio_km FLOAT,
    distancia_media_planeta_km FLOAT,
    periodo_orbital_dias FLOAT,
    temperatura_media_c FLOAT,
    tipo_cuerpo ENUM('Sólido/Rocoso', 'Sólido/Hielo'),
    nombre_planeta VARCHAR(50),
    FOREIGN KEY (nombre_planeta) REFERENCES Planeta(nombre)
);

-- insertamos datos en la tabla estrella
INSERT INTO Estrella (nombre, tipo, radio_km, temperatura_superficial_c, distancia_media_tierra_mkm, composicion)
VALUES
('Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros');

-- insertamos datos en la 
INSERT INTO Planeta (nombre, radio_km, distancia_media_sol_mkm, periodo_orbital_dias, temperatura_media_c, tipo_planeta, num_satelites, nombre_estrella)
VALUES
('Mercurio', 2439.7, 57.9, 88, 167, 'Rocoso', 0, 'Sol'),
('Venus', 6051.8, 108.2, 225, 464, 'Rocoso', 0, 'Sol'),
('Tierra', 6371, 149.6, 365.25, 15, 'Rocoso', 1, 'Sol'),
('Marte', 3389.5, 227.9, 687, -65, 'Rocoso', 2, 'Sol'),
('Júpiter', 69911, 778.5, 4333, -110, 'Gaseoso', 4, 'Sol'),
('Saturno', 58232, 1429.4, 10759, -140, 'Gaseoso', 2, 'Sol'),
('Urano', 25362, 2870.9, 30687, -195, 'Gaseoso', 2, 'Sol'),
('Neptuno', 24622, 4498.3, 60190, -200, 'Gaseoso', 0, 'Sol');

-- insertamos datos en la tabla satelite
INSERT INTO Satelite (nombre, radio_km, distancia_media_planeta_km, periodo_orbital_dias, temperatura_media_c, tipo_cuerpo, nombre_planeta)
VALUES
('Luna', 1737.4, 384400, 27.3, -53, 'Sólido/Rocoso', 'Tierra'),
('Fobos', 11.1, 9378, 0.3, -40, 'Sólido/Rocoso', 'Marte'),
('Deimos', 6.2, 23460, 1.3, -40, 'Sólido/Rocoso', 'Marte'),
('Ío', 1821.6, 421700, 1.8, -143, 'Sólido/Rocoso', 'Júpiter'),
('Europa', 1560.8, 670900, 3.5, -160, 'Sólido/Hielo', 'Júpiter'),
('Ganimedes', 2634.1, 1070400, 7.2, -163, 'Sólido/Hielo', 'Júpiter'),
('Calisto', 2410.3, 1882700, 16.7, -139, 'Sólido/Hielo', 'Júpiter'),
('Titán', 2575.5, 1222000, 15.9, -179, 'Sólido/Hielo', 'Saturno'),
('Encélado', 252.1, 238000, 1.4, -201, 'Sólido/Hielo', 'Saturno'),
('Titania', 788.4, 435900, 8.7, -203, 'Sólido/Hielo', 'Urano'),
('Oberón', 761.4, 583500, 13.5, -203, 'Sólido/Hielo', 'Urano');
