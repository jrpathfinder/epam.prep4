FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="business"
LABEL description="Two Api microservice"

COPY target/two-api-0.0.1-SNAPSHOT.jar /two-api-0.0.1-SNAPSHOT.jar

EXPOSE 8084

ENTRYPOINT ["java","-jar","/two-api-0.0.1-SNAPSHOT.jar"]