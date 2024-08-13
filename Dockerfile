# BASE
FROM maven:3.8.6-openjdk-17 AS build

# DEFINITION WORK
WORKDIR /app

# Copie o código-fonte para o contêiner
COPY . .

# INSTALL AND CREATE A NEW JAR
RUN mvn clean install -DskipTests

# IMAGE
FROM openjdk:17-jdk-alpine

# WORK APP
WORKDIR /app

# COPY NEW JAR
COPY --from=build /app/target/ITGOV-Contracts-Maven-0.0.1-SNAPSHOT.jar /app/itgov.jar

# EXPORT
EXPOSE 9632

# EXECUTE JAR
ENTRYPOINT ["java", "-jar", "itgov.jar"]
