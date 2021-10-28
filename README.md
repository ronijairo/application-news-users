# REGISTRO-USER-NISUM
    Applicación para registro de usuarios,


## Versiones
* Java `1.8`
* Gradle `1.5.8`
* spring framework `2.5.6`
* spring-boot `2.5.6`
* spring-JPA `2.5.6`
* swagger2  `2.9.2`
* swagger-ui `2.9.2`
* jsonwebtoken `0.9.1`
* mapstruct `1.4.2.Final`
* h2database `H2`

### Herramientas 
* Postman ` 6.0.9 (6.0.9)`
* Intellij IDEA `11.0.9.1+11b1145`

#### Documentacion
* **Para el desarrollo de la aplicaion obte por el patron de diseño `Orientado al Dominio` **
```

instrucciones de uso de la aplicaión

## endponts para consumo de servicios 
* [Registrar](http://localhost:8001/nisum-app/api/v1/users/save)
* [obteneter-Token](http://localhost:8001/nisum-app/api/v1/auth/authenticate)
* [consultar-todos-los-registros ](hhttp://localhost:8001/nisum-app/api/v1/users/getAll)

## Importante
    para poder hacer uso de las consultas REGISTRAR,CUNSULTAR  a expción de `obtener token`
    es necesario porder ingresar los headers de las consultas 
    el Key: `Authorization` y como valor el `Token obtenido del servicio obetener-token`

    estos datos son necesarios en la herramienta post-man
    Header(key: Authorization, value: 'Bearer eyJhbGciOiJIUzI1...')

En los Resorces de la aplicación en contrara el scritp de base de datos y la coleccion de postman: 
## >/src/main/resources
> `schema.sql`,
> `NISUM-PRACTICE.postman_collection.json`


```



## Usuario inicial para obtener TOKEN
* Usuario **`admin`**
* Contraseña **`admin`**

### Conexión a BD
* **La conexión se realiza en automatico, de igual forma inicializa con un  primer registro``**
```sql

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
  id VARCHAR(255) PRIMARY KEY  NOT NULL,
  name VARCHAR(255) NULL,
  email VARCHAR(255) NULL,
  password VARCHAR(255) NULL,
  created DATE NULL,
  modified DATE NULL,
  last_login DATE NULL,
  token VARCHAR(255) NULL,
  isactive TINYINT NULL );

DROP TABLE IF EXISTS phones;

CREATE TABLE IF NOT EXISTS phones (
  id VARCHAR(255) PRIMARY KEY NOT NULL,
  number VARCHAR(255) NULL,
  citycode INT NULL,
  contrycode INT NULL,
  users_id INT NOT NULL,
  CONSTRAINT fk_phones_users
    FOREIGN KEY (users_id)
    REFERENCES users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
```

##Request Registra usuario
```Json Request Registrar
{
	"name": "Alex Rodriguez",
	"email": "hghg@gmail.com",
	"password": "Huner12ef",
	"phones": [{
		"number": "1234567",
		"citycode": "1",
		"contrycode": "57"
	}
	]
}
```
##Request token
```Json Request obtener Token
{
	"username":"admin",
	"password":"admin"
}
```
