# Microservices Exercise

## Summary

The main goal here is to exercise the creation of three webservices that will handle the system logic

## Architecture

There are three web services handling the system domain.

![architecture](https://raw.githubusercontent.com/eltonjr/microservices-exercise/master/docs/microservices-exercise.png)

* **ws-location**: Written in Go. Holds a list of "avaliable" cities.
* **ws-demographics**: Written in Java. Holds demographic infos about each city.
* **ws-business**: Written in NodeJs. Stores current business running in each city.

There is also a **ws-client** which is a Single Page Application running behind an NGINX.  
The webpage interacts with the webservices to GET data to be displayed and to POST data to be stored in the webservices.

## How to run

For every project there is a `Makefile` and a `Dockerfile` to help you compile and run each project.  
Inside each folder there is also a `README` to help you understand more about the service.

If you just want to see the whole stack running, you can also use this two scripts:

* `start.sh`: Builds and runs a docker container for each service.
* `stop.sh`: Stop them all and remove the images from your computer as well ;)
