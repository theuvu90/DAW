CREATE TABLE datos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_hora TIMESTAMP NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    categoria VARCHAR(50),
    dato_numerico INT,
    estado TINYINT
);