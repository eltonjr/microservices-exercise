.PHONY: deps run ops-build ops-run ops-clean

deps:
	npm install

run:
	node index.js

ops-clean:
	docker rm -f ws-business
	docker rmi ws-business

ops-build:
	docker build -t ws-business .

ops-run:
	docker run --name ws-business --net host -d ws-business
