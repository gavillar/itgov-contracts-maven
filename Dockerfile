# Use a imagem base do Java
FROM openjdk:17-jdk-alpine

# Defina o diretório de trabalho
WORKDIR /app

RUN mvn clean install

# Copie o arquivo JAR para o contêiner
COPY out/artifacts/ITGOV-Contracts-Maven.jar /app.jar

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]
