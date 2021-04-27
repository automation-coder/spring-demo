FROM openjdk:11
EXPOSE 9000
ADD target/spring-demo.jar spring-demo.jar
ENTRYPOINT ["java", "-jar", "spring-demo.jar"]