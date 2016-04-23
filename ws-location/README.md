# Location Webservice

## Summary

Provides the location (just the city name) where certain business are allowed to be.

Available entrypoints:

* `GET /v1`: Simple healthcheck to see if the service is online;
* `GET /v1/locations`: Return a list of locations.

## How to run

There is a compiled file called `location` at the root of this project. You can execute it calling:

```
./location
```

If you are not in a x86-64 architecture or is having another error of that kind, you can try to recompile the code: (note that you'll have to install `go` to do that)

```
make run
```

Otherwise you can just run it inside a Docker container: (you need `docker` installed)

```
make ops-build && 
make ops-run
```

(type `docker logs ws-location` to check the status)

## Examples

* **/v1**


`curl -X GET "http://localhost:42000/v1"`


Response:


```Location service is online!```

* **/v1/locations**


```curl -X GET "http://localhost:42000/v1/locations"```


Response:


```
[
  {
    "country": "Brazil",
    "city": "Florianopolis",
    "street": "Lauro Linhares"
  },
  {
    "country": "Brazil",
    "city": "Florianopolis",
    "street": "Padre Roma"
  }
]
```

## How to give maintenance

To build the application you need to have `go` installed with a proper `GOPATH` exported.

A Makefile is available to ease the process.

`make deps`: Install the needed dependencies;  
`make clean`: Remove the binaries from previous compilation;  
`make location`: Compile the application;  
`make run`: Get the dependencies, compile the code and run the application;  
`make ops-build`: Put the compiled code inside a docker image called ws-location. You need the compiled code to do that!  
`make ops-run`: Starts a docker container with the ws-location image.
