CREATE TABLE USUARIO(
	USERNAME VARCHAR(10),
	PASSWORD VARCHAR(10),
	IMG VARCHAR(30),
	CONSTRAINT USPK PRIMARY KEY(USERNAME)
);

CREATE TABLE SERVICIO(
	COD INT,
	USERNAME VARCHAR(10) NOT NULL,
	DESCRIPCION VARCHAR(50),
	CONSTRAINT SEPK PRIMARY KEY(COD),
	CONSTRAINT SEFK FOREIGN KEY(USERNAME) REFERENCES USUARIO(USERNAME) ON DELETE CASCADE
);

CREATE TABLE CLIENTE(
	COD INT,
	DNI VARCHAR(9),
	NOMBRE VARCHAR(10),
	TLF INT,
	CONSTRAINT CLPK PRIMARY KEY(COD),
	CONSTRAINT CLUN UNIQUE (DNI)
);

CREATE TABLE FACTURA(
	COD INT,
	COD_SERVICIO INT,
	COD_CLIENTE INT,
	PRECIO REAL,
	DESCRIPCION VARCHAR(50),
	CONSTRAINT FAPK PRIMARY KEY(COD,COD_SERVICIO,COD_CLIENTE),
	CONSTRAINT FAFK1 FOREIGN KEY(COD_SERVICIO) REFERENCES SERVICIO(COD) ON DELETE CASCADE,
	CONSTRAINT FAFK2 FOREIGN KEY(COD_CLIENTE) REFERENCES CLIENTE(COD) ON DELETE CASCADE
);

------------------------- INSERTS
INSERT INTO USUARIO VALUES('ADMIN','1234', 'Profile/user0.png');
INSERT INTO USUARIO VALUES('ISMAEL','1234', 'Profile/user1.png');

INSERT INTO SERVICIO VALUES(1,'ISMAEL','ABOGADO');
INSERT INTO SERVICIO VALUES(2,'ISMAEL','COMPRA VENTA');
INSERT INTO SERVICIO VALUES(3,'ISMAEL','TRANSPORTE');

INSERT INTO CLIENTE VALUES(1,'12345678A','ANA',123456789);
INSERT INTO CLIENTE VALUES(2,'87654321B','PACO',123456789);
INSERT INTO CLIENTE VALUES(3,'12348765C','NATY',123456789);

INSERT INTO FACTURA VALUES(1,1,1, 1000, 'JUICIO CONTRA INPAGO');
INSERT INTO FACTURA VALUES(1,1,3, 700.50, 'JUICIO CONTRA ACCIDENTE DE COCHE');
INSERT INTO FACTURA VALUES(1,2,2, 40, 'COMPRA DE PC PERSONAL EN PCCOMPONENTES');