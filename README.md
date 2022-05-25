# Calculadora
Microservicio "calculadora", usando maven + spring-boot, con funcionalidades básicas de sumar y restar.


## Requisitos previos
1. Maven 3.3.9
2. Java 1.8

## Instalación

Genear el JAR a ejecutar, con las instrucciones: 
```
git clone https://github.com/oskarcp/calculadora.git
cd calculadora
mvn validate
mvn verify
mvn clean install
```
Al finaliza, tendremos el JAR calculadora-fat.jar  en /target.

## Ejecución

java -jar target/calculadora-spring-boot.jar

## Pruebas

### API REST
Peticiones GET en el puerto 8080.
Por cada operación a realizar de la calculadora, existen distintos endpoint (en este caso suma y resta). Los parámetros son los dos números de la operación, numeroUno y numeroDos.

Para realizar una prueba: 
Swagger: http://localhost:8080/swagger-ui.html#/calculadora-controller.
Request URL: http://localhost:8080/rest/calculadora/resta?numeroDos=1&numeroUno=1
Curl: curl -X GET "http://localhost:8080/rest/calculadora/resta?numeroDos=1&numeroUno=1" -H "accept: */*"


### TEST

mvn clean test






