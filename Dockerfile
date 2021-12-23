
FROM openjdk:8-jre-alpine

WORKDIR /

RUN mkdir app
COPY target/proyBpc-0.0.1-SNAPSHOT.jar /app
WORKDIR /app

#Exponemos el puerto 8081
EXPOSE 8081


CMD ["java","-jar","proyBpc-0.0.1-SNAPSHOT.jar"]
