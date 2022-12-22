./mvnw install -Pprod
docker build -t gta-api-docker .
docker run 54321 gta-api-docker