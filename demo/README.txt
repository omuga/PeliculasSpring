Para ejecutar el programa se debe instalar en Visual Studio Code:
	- Java Extension Pack
	- Spring Extension Pack
	
Se debe tener instalado Mysql, Maven y Java JDK 8.

Para crear la base de datos:
	- Abrir Mysql Shell
	- \connect "usuario@localhost:3306" // ejemplo "root@localhost:3306"
	- Copiar en el shell:
		create database AY_4;
	 	create user 'springuser1'@'%' identified by 'ThePassword';
		grant all on AY_4.* to 'springuser1'@'%';