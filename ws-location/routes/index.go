// Routes contains the handlers for every service HTTP entrypoint
package routes

import (
	"encoding/json"
	"fmt"
	"net/http"

	"github.com/eltonjr/microservices-exercise/ws-location/model"
	"github.com/julienschmidt/httprouter"
)

const (
	OK  = 200
	ERR = 500
)

// /v1
func Index(w http.ResponseWriter, r *http.Request, p httprouter.Params) {
	w.Header().Set("Content-Type", "text/plain")
	w.WriteHeader(OK)
	fmt.Fprint(w, "Location service is online!\n")
}

// /v1/locations
func Locations(w http.ResponseWriter, r *http.Request, p httprouter.Params) {
	l, err := json.Marshal(model.GetLocations())

	if err != nil {
		errorHandler(w, err)
		return
	}

	w.Header().Set("Content-Type", "application/json")
	w.WriteHeader(OK)
	fmt.Fprint(w, string(l))
}

func errorHandler(w http.ResponseWriter, err error) {
	w.WriteHeader(ERR)
	fmt.Fprint(w, err.Error())
}
