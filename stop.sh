#!/bin/bash

stop() {
	cd $1
	make ops-clean
	cd ..
}

for proj in ws-location ws-demographics ws-business ws-client; do
	stop $proj
done
