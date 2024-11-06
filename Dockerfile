FROM openjdk:17-jdk-slim
EXPOSE 8086
ADD target/kaddem-0.0.4.jar kaddem-0.0.4.jar
ENTRYPOINT ["java", "-jar", "/kaddem-0.0.4.jar"]
