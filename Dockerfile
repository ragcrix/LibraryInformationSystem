FROM openjdk:13-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} libinfosystem.jar
ENTRYPOINT ["java","-jar","/libinfosystem.jar"]