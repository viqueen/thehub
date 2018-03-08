#! /usr/bin/env bash

customers() {
    mvn -e clean install --projects portal-customers-api
    curl -F "file=@./portal-customers-api/target/portal-customers-api-1.0.0-SNAPSHOT.jar" http://localhost:8080/api/upload
}

eval $@
