.PHONY: deps clean run build ops-build ops-run ops-clean

deps:
	mvn install

clean:
	rm -rf target/

build:
	mvn package

run:
	mvn spring-boot:run

ops-clean:
	docker rm -f ws-demographics
	docker rmi ws-demographics

ops-build:
	docker build -t ws-demographics .

ops-run:
	docker run --name ws-demographics --net host -d ws-demographics
