.PHONY: deps clean run build ops-build ops-run

deps:
	mvn install

clean:
	rm -rf target/

build:
	mvn package

run:
	mvn spring-boot:run

ops-build:
	docker build -t ws-demographics .

ops-run:
	docker run --name ws-demographics -d ws-demographics
