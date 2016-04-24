.PHONY: deps run ops-build ops-run

deps:
	npm install

run: build
	node index.js

ops-build:
	docker build -t ws-business .

ops-run:
	docker run --name ws-business -d ws-business
