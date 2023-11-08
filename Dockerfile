# FROM eclipse-temurin:19.0.1_10-jdk-alpine
# ARG JAR_FILE=target/thymeleaf-0.0.1-SNAPSHOT.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
# Use an official Python runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine
VOLUME  /tmp
COPY target/*.jar app.jar
ENTRYPOINT [ "java", "-jar" , "app.jar" ]
EXPOSE 8080

