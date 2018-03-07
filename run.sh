#! /usr/bin/env bash

dev() {
    mvn spring-boot:run \
    -Drun.profiles=dev \
    -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005" \
    --projects portal-server
}

sonar() {
    mvn sonar:sonar \
        -Dsonar.organization=viqueen-github \
        -Dsonar.host.url=https://sonarcloud.io \
        -Dsonar.login=${VIQUEEN_GITHUB_SONAR_LOGIN}
}

eval $@
