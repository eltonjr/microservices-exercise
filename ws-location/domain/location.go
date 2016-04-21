// Package domain contains the data structures that the service provides
package domain

type Location struct {
	Country    string `json:"country"`
	State      string `json:"state,omitempty"`
	City       string `json:"city"`
	Street     string `json:"street,omitempty"`
	Number     string `json:"number,omitempty"`
	Complement string `json:"complement,omitempty"`
}
