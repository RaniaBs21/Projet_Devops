FROM openjdk:17-jdk-slim
EXPOSE 8089
ADD target/kaddem-0.0.4.jar Kaddem.jar
ENTRYPOINT ["java", "-jar", "/Kaddem.jar"]
