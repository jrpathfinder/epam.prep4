FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="business"
LABEL description="First microservice with Servo metrics"

COPY target/one-0.0.1-SNAPSHOT.jar /one-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/one-0.0.1-SNAPSHOT.jar"]