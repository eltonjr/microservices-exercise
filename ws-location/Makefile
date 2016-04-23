.PHONY: deps clean run build ops-build ops-run

deps:
	go get

clean:
	rm location

build: deps
	CGO_ENABLED=0 go build -v -a -installsuffix cgo -o location

run: build
	./location

ops-build:
	docker build -t ws-location .

ops-run:
	docker run --name ws-location -d ws-location
