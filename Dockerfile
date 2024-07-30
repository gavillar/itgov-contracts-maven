# Use a imagem base do Java
FROM openjdk:17-jdk-alpine

# Defina o diretório de trabalho
WORKDIR /app

RUN mvn clean install

# Copie o arquivo JAR para o contêiner
COPY target/ITGovernance-Contracts-Thymeleaf_Maven-1.0-SNAPSHOT.jar /app.jar

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]
