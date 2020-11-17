## Descripción

Repositorio para almacenar las fuentes del laboratorio de la asignatura de Ingeniería 
del Software 2 (IS2).

## Herramientas

Se utiliza por defecto Java 8 y Maven.

## Uso de una MySQL Dockerizada

Podemos arrancar una MySQL 5.7 sin instalar con el siguiente comando:

```bash
	docker run --name mysql57 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -d mysql/mysql-server:5.7
```

Entramos en el contenedor:

```bash
	docker exec -it mysql57 bash
```

Nos logamos con:

```bash
	mysql -h localhost -u root -p
``` 

creamos la BBDD:

```sql
	CREATE DATABASE practicaIS2;
	USE practicaIS2;
	SHOW TABLES;
``` 

creamos la tabla de usuarios:

```sql
CREATE TABLE usuarios(id int, login varchar(20), password varchar(20), dni varchar(9), nombre varchar(50), apellidos varchar(50), email varchar(25), telefono varchar(15), direccion varchar(50), fechaNacimiento date);
```

y por último creamos al usuario:

```sql
	CREATE USER 'vmarzal' IDENTIFIED BY 'vmarzal';
	grant all on *.* to 'vmarzal'@'%' identified by '1234';
	FLUSH PRIVILEGES;
```
