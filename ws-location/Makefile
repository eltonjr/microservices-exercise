.PHONY: deps clean run build ops-build ops-run ops-clean

deps:
	go get

clean:
	rm location

build: deps
	CGO_ENABLED=0 go build -v -a -installsuffix cgo -o location

run: build
	./location

ops-clean:
	docker rm -f ws-location
	docker rmi ws-location

ops-build:
	docker build -t ws-location .

ops-run:
	docker run --name ws-location --net host -d ws-location
