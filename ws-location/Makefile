.PHONY: deps clean run

deps:
	go get

clean:
	rm location

run: location
	./location

location: deps
	go build location.go
