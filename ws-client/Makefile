.PHONY: deps ops-build ops-run ops-clean

deps:
	bower install

ops-clean:
	docker rm -f ws-client
	docker rmi ws-client

ops-build: deps
	docker build -t ws-client .

ops-run:
	docker run --name ws-client --net host -d ws-client
