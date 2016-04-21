# Location Webservice

## Summary

Provides the location where certain business are allowed to be.

Available entrypoints:

* `GET /v1`: Simple healthcheck to see if the service is online;
* `GET /v1/locations`: Return a list of locations.

## How to use

To build the application you need to have `go` installed with a proper `GOPATH` exported.

A Makefile is available to ease the process.

`make deps`: Install the needed dependencies;  
`make clean`: Remove the binaries from previous compilation;  
`make location`: Compile the application;  
`make run`: Get the dependencies, compile the code and run the application.
