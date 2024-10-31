# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:17-jdk-slim
EXPOSE 8089
COPY --from=build /app/target/kaddem-0.0.1.jar kaddem-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/kaddem-0.0.1.jar"]
