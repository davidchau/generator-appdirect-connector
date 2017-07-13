FROM openjdk:8u121-jdk-alpine

MAINTAINER Partner Integrations team <partner.integrations@appdirect.com>

ENV JAR_NAME=<%= artifactId %>.jar
ENV JAVA_OPTS="-Xms256M -Xmx256M -XX:MaxMetaspaceSize=64M"

COPY src/main/bash/entrypoint.sh /entrypoint.sh
COPY target/$JAR_NAME /$JAR_NAME
RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
