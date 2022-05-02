#docker-compose down
./gradlew assemble
docker-compose build
docker compose -f docker-compose-influx.yml up
