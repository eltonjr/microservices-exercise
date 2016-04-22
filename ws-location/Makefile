.PHONY: deps clean run

deps:
	go get

clean:
	rm location

run: location
	./location

location: deps
	CGO_ENABLED=0 go build -v -a -installsuffix cgo -o location
