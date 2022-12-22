FROM openjdk:18-jdk-alpine
RUN ./mvnw install -Pprod
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]