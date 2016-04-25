FROM anapsix/alpine-java

MAINTAINER Elton Hoffmann <eltonhnjr@gmail.com>

ADD ./target/microservices-exercise-*.jar /opt/ws-demographics/ws-demographics.jar

EXPOSE 42001

CMD java -jar /opt/ws-demographics/ws-demographics.jar
