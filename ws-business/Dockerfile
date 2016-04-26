FROM mhart/alpine-node

MAINTAINER Elton Hoffmann <eltonhnjr@gmail.com>

ADD . /opt/ws-business/

RUN cd /opt/ws-business/ &&	npm install

EXPOSE 42002

CMD node /opt/ws-business/index.js
