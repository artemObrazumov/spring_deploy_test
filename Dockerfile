FROM openjdk:21-jdk-slim
ARG JAR_FILE=build/*/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]