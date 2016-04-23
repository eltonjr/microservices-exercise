# Demographics Webservice

## Summary

Provides demographics information (like population, size, bike lane extension, ...) about some cities.

Available entrypoints:

* `GET /v1`: Simple healthcheck to see if the service is online;
* `GET /v1/cities`: Return the city code together with the city's name.
* `GET /v1/cities/{id}`: Return demographics about a single city.

## How to run

You can run it with `spring-boot` by calling: (note that `java` and *maven 3* are required)

```
make run
```

Otherwise you can just run it inside a Docker container: (you need `docker` installed)

```
make ops-build
make ops-run
```

(type `docker logs ws-demographics` to check the status)

## Examples

* **/v1**


`curl -X GET "http://localhost:42001/v1"`


Response:


```
Demographics Service is online!
```

* **/v1/cities**


```curl -X GET "http://localhost:42001/v1/cities"```


Response:


```
[
  {
    "id": "530010",
    "name": "Brasilia"
  },
  {
    "id": "330455",
    "name": "Rio de Janeiro"
  },
  {
    "id": "355030",
    "name": "São Paulo"
  }
]
```

* **/v1/cities/{id}**


`curl -X GET "http://localhost:42001/v1/cities/530010"`


Response:


```
{
  "id": 530010,
  "name": "Brasilia",
  "state": "DF",
  "population": 2914830,
  "numOfCars": 1586169,
  "size": 5780,
  "bikeLaneExtension": 440
}
```

## How to give maintenance

The application is written in *Java 7* so you'll have to have that installed.  
Dependencies are installed through *Maven 3* and the service uses the *Spring Boot* framework.  
Make sure that you have Java and Maven installed properly.

A Makefile is available to ease the building process.

`make deps`: Install the needed dependencies;  
`make clean`: Remove the binaries from previous compilation;  
`make build`: Compiles the code to a *target/ws-demographics.jar* file;  
`make run`: Get the dependencies, compile the code and run the application;  
`make ops-build`: Put the compiled code inside a docker image called ws-demographics. You need the compiled code to do that!  
`make ops-run`: Starts a docker container with the ws-demographics image.

## Demographics sources

Every information provided by this service was taken from these sites:

* [IBGE Cidades](http://www.cidades.ibge.gov.br/xtras/home.php?lang=)
* [Mobilize.org.br](http://www.mobilize.org.br/estatisticas/28/estrutura-cicloviaria-em-cidades-do-brasil-km.html)
