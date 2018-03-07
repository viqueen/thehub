#! /usr/bin/env bash

dev() {
    mvn spring-boot:run \
    -Drun.profiles=dev \
    -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005" \
    --projects portal-server
}

eval $@
