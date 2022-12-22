FROM maven:3.8.6-jdk-11-slim
COPY . .
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:18-jdk-alpine
COPY --from=build /target/gta-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]