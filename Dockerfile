FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/petz-test-0.0.1-SNAPSHOT.jar petz-test.jar
ADD target/petz-test-0.0.1-SNAPSHOT.jar petz-test.jar
ENTRYPOINT ["java","-jar","/petz-test.jar"]
