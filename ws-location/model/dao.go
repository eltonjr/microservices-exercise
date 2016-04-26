// Model operates with the domain and make it available
package model

import (
	"github.com/eltonjr/microservices-exercise/ws-location/domain"
)

// For the purpose of this exercise, there is no need of a
// more complex data than a simple dummy set of Locations
func GetLocations() [20]domain.Location {
	return [...]domain.Location{
		domain.Location{Id: 530010, City: "Brasilia", State: "DF"},
		domain.Location{Id: 330455, City: "Rio de Janeiro", State: "RJ"},
		domain.Location{Id: 355030, City: "São Paulo", State: "SP"},
		domain.Location{Id: 410690, City: "Curitiba", State: "PR"},
		domain.Location{Id: 230440, City: "Fortaleza", State: "CE"},
		domain.Location{Id: 500270, City: "Campo Grande", State: "MS"},
		domain.Location{Id: 221100, City: "Teresina", State: "PI"},
		domain.Location{Id: 120040, City: "Rio Branco", State: "AC"},
		domain.Location{Id: 150140, City: "Belém", State: "PA"},
		domain.Location{Id: 310620, City: "Belo Horizonte", State: "MG"},
		domain.Location{Id: 420540, City: "Florianópolis", State: "SC"},
		domain.Location{Id: 280030, City: "Aracaju", State: "SE"},
		domain.Location{Id: 250750, City: "João Pessoa", State: "PB"},
		domain.Location{Id: 320530, City: "Vitória", State: "ES"},
		domain.Location{Id: 510340, City: "Cuiabá", State: "MT"},
		domain.Location{Id: 261160, City: "Recife", State: "PE"},
		domain.Location{Id: 292740, City: "Salvador", State: "BA"},
		domain.Location{Id: 431490, City: "Porto Alegre", State: "RS"},
		domain.Location{Id: 130260, City: "Manaus", State: "AM"},
		domain.Location{Id: 211130, City: "São Luis", State: "MA"},
	}
}
