// Package domain contains the data structures that the service provides
package domain

type Location struct {
	Id    int    `json:"id"`
	City  string `json:"city"`
	State string `json:"state,omitempty"`
}
