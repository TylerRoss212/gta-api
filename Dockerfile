FROM openjdk:18-jdk-alpine
RUN ls -a
RUN find ./bin -name mvnw
RUN ls -a ./bin
RUN dos2unix mvnw
RUN ./mvnw install -Pprod
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]