# Use a imagem base do Java
FROM openjdk:17-jdk-alpine

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR para o contêiner
COPY target/ITGOV-Contracts-Maven-0.0.1-SNAPSHOT.jar /app.jar


# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]


