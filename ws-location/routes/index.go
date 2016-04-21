package routes

import (
	"fmt"
	"github.com/julienschmidt/httprouter"
	"net/http"
)

const (
	success = 200
)

func Index(w http.ResponseWriter, r *http.Request, p httprouter.Params) {
	w.Header().Set("Content-Type", "application/json")
	w.WriteHeader(success)
	fmt.Fprint(w, "Location service is online!\n")
}
