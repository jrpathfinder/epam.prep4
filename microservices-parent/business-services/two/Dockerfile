FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="business"
LABEL description="Second microservice with servo metrics"

COPY target/two-0.0.1-SNAPSHOT.jar /two-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/two-0.0.1-SNAPSHOT.jar"]