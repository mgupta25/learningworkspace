FROM java:8
ADD target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar spring-boot-mongodb.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","spring-boot-mongodb.jar"]