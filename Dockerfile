FROM openjdk:19
COPY target/Damian-0.0.1-SNAPSHOT.jar damian.jar
ENTRYPOINT ["java","-jar","/damian.jar"]