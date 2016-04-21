// Provides the location where certain business are allowed to be
package main

import (
	"fmt"
	"net/http"

	"github.com/eltonjr/microservices-exercise/ws-location/routes"
)

func main() {

	address := "localhost:42000"

	// logic goes here
	http.HandleFunc("/v1", routes.Index)
	http.HandleFunc("/v1/locations", routes.Locations)

	fmt.Printf("Location is ready @ %s\n", address)

	http.ListenAndServe(address, nil)

}
