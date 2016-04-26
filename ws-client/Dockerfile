FROM nginx

MAINTAINER Elton Hoffmann <eltonhnjr@gmail.com>

COPY . /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf

RUN chmod 777 -R /usr/share/nginx/html
