#! /usr/bin/env bash

dev() {
    mvn spring-boot:run -Drun.profiles=dev --projects portal-server
}

eval $@
