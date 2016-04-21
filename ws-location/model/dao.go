// Model operates with the domain and make it available
package model

import (
	"github.com/eltonjr/microservices-exercise/ws-location/domain"
)

// For the purpose of this exercise, there is no need of a
// more complex data than a simple dummy set of Locations
func GetLocations() [2]domain.Location {
	return [...]domain.Location{
		domain.Location{Country: "Brazil", City: "Florianopolis", Street: "Lauro Linhares"},
		domain.Location{Country: "Brazil", City: "Florianopolis", Street: "Padre Roma"},
	}
}
