#!/bin/bash

run() {
	cd $1
	make ops-build
	make ops-run
	cd ..
}

for proj in ws-location ws-demographics ws-business client; do
	run $proj
done
