.PHONY: ops-build ops-run ops-clean

ops-clean:
	docker rm -f ws-client
	docker rmi ws-client

ops-build:
	docker build -t ws-client .

ops-run:
	docker run --name ws-client --net host -d ws-client
