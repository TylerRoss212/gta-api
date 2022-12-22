FROM openjdk:18-jdk-alpine
RUN cat start.sh
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]