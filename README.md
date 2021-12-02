# Prueba spring
## Base de datos
El proyecto se conecta a una base de datos llamada springDB en MySQL.

    create database springDB;
    use springDB;
    create table user(
      id int primary key auto_increment not null,
      userName varchar(32) unique not null,
      password varchar(32) not null,
      realName varchar(32) 
    );

Para que el proyecto puede comunicarse a la base de datos es necesario crear un usuario en servidor de base de datos.

    CREATE USER 'newUser1_'@'localhost' IDENTIFIED BY 'newUser1_';
    grant all privileges on springDB . * to 'newUser1_'@'localhost';
    flush privileges;

En caso de querer utilizar otro usuario para conectarse u otro nombre para la base de datos hay que modifiar unas cuantas lineas del archivo application.properrties

    spring.datasource.url=jdbc:mysql://localhost:3306/springDB
    spring.datasource.username=newUser1_
    spring.datasource.password=newUser1_

## Probar las rutas
En la carpeta /postman se encuentra un archivo .json para importar a postman y probar cada una de las rutas disponibles.