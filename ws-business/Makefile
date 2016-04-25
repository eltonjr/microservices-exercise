.PHONY: deps run ops-build ops-run

deps:
	npm install

run:
	node index.js

ops-build:
	docker build -t ws-business .

ops-run:
	docker run --name ws-business --net host -d ws-business
