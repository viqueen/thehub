#! /usr/bin/env bash

__default() {
    echo ${1}
}

debug() {
    profile=$(__default ${1} 'dev')
    mvn spring-boot:run \
    -Drun.profiles=${profile} \
    -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005" \
    --projects portal-server
}

dev() {
    mvn spring-boot:run \
    -Drun.profiles=dev \
    --projects portal-server
}

prod() {
    mvn spring-boot:run \
    -Drun.profiles=production \
    --projects portal-server
}

sonar() {
    mvn sonar:sonar \
        -Dsonar.organization=viqueen-github \
        -Dsonar.host.url=https://sonarcloud.io \
        -Dsonar.login=${VIQUEEN_GITHUB_SONAR_LOGIN}
}

eval $@
