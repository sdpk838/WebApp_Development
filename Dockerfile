FROM openjdk:8
ADD target/WebApplication-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]