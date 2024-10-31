FROM openjdk:17-jdk-slim
EXPOSE 8089

ADD target/kaddem-0.0.5.jar kaddem-0.0.5.jar


ENTRYPOINT ["java", "-jar", "/kaddem-0.0.4.jar"]
