// Provides the location where certain business are allowed to be
package main

import (
	"fmt"
	"net/http"

	"github.com/eltonjr/microservices-exercise/ws-location/routes"
	"github.com/julienschmidt/httprouter"
)

func main() {

	address := "localhost:42000"

	r := httprouter.New()

	// logic goes here
	r.GET("/v1", routes.Index)

	fmt.Printf("Location is ready @ %s\n", address)

	http.ListenAndServe(address, r)

}
