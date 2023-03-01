FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="common"
LABEL description="Common micro with Archaius config"

COPY target/common-0.0.1-SNAPSHOT.jar /common-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/common-0.0.1-SNAPSHOT.jar"]