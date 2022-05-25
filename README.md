# calculadora
Microservicio "calculadora", usando maven + spring-boot, con funcionalidades basicas de sumar y restar.


## Requisitos previos
1. Maven XX
2. Java 1.8

## Instalación
```
git clone https://github.com/oskarcp/calculadora.git
cd calculadora
mvn validate
mvn verify
mvn clean install
```

Se habra generado un el JAR calculadora-fat.jar  en /target  

## Ejecución

java -jar target/calculadora-spring-boot.jar

## Pruebas

### API REST
Puerto 8080 escuchando peticiones REST GET
Por cada operacion a realizar de la calculadora existen distintos endpoint. Los parametros son los dos numeros de la operacion, numeroUno y numeroDos

Incluir swagger
Incluir ejemplo

### TEST

mvn clean test






