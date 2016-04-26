# Location Webservice

## Summary

Is the front-end of the application and also the service that consumes the information from the other webservices.

## How to run

To perform http requests, the application needs *NGINX* to reverse proxy each call. So the simplest way is to run it with `docker`. (You need `docker` installed to run and also `bower` to download the dependencies).

```
make ops-build && 
make ops-run
```

## How to give maintenance

The application is a simple static Single Page Application behind an *NGINX* to serve the app and also reverse proxy the http requests to each back-end.

It is written in HTML + JS (AngularJS) + CSS.

A Makefile is available with the following:

`make deps`: Install the needed dependencies;  
`make ops-clean`: Remove the docker container and the docker image;  
`make ops-build`: Put the compiled code inside a docker image called ws-location. You need the compiled code to do that!  
`make ops-run`: Starts a docker container with the ws-location image.
