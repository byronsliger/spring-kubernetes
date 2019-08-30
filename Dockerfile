FROM openjdk:8-alpine

MAINTAINER EMI bairon.romero@ceiba.com.co

WORKDIR /home

COPY build/libs/demo-0.0.1-SNAPSHOT.jar /home/demo.jar

CMD ["sh", "-c", "java -jar /home/demo.jar"]