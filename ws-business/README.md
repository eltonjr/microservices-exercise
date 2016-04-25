# Business Webservice

## Summary

Allows user to save and retrieve saved Business locations.

Available entrypoints:

* `GET /v1`: Simple healthcheck to see if the service is online;
* `GET /v1/business`: Return a list of saved businesses;
* `POST /v1/business`: Save a new business.

## How to run

The application is written in *NodeJS* so you'll have to have it installed, as well as the node package manager `npm` to download the dependencies. If you have all of these tools, you can run:

```
make deps
make run
```

If you don't want to install node, you can run it inside a docker container (you need `docker` installed):

```
make ops-build && 
make ops-run
```

(type `docker logs ws-business` to check the status)

## Examples

* **/v1**


`curl -X GET "http://localhost:42002/v1"`


Response:


```Business service is online!```

* **/v1/business**


```curl -X GET "http://localhost:42002/v1/business"```


Response:


```
[
  {
    "id": 2,
    "name": "Loja 2",
    "location": 240
  },
  {
    "id": 1,
    "name": "Loja 1",
    "location": 420
  }
]
```

* **/v1/business** (POST)


```curl -X POST -H "Content-Type: application/json" -d '{ "id": 1, "name": "Loja 1", "location": 420 }' "http://localhost:42002/v1/business"```


Response:


```
{
    "id": 1,
    "name": "Loja 1",
    "location": 420
}
```

## How to give maintenance

To build the application you need to have `node` and `npm` installed.

A Makefile is available to ease the process.

`make deps`: Install the needed dependencies;  
`make run`: Run the application;  
`make ops-build`: Put the code inside a docker image called ws-business.  
`make ops-run`: Starts a docker container with the ws-business image.
