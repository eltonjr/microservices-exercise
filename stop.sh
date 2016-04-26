#!/bin/bash

stop() {
	cd $1
	make ops-clean
	cd ..
}

for proj in ws-location ws-demographics ws-business client; do
	stop $proj
done
