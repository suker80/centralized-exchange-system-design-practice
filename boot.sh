#!/bin/bash

export BUILD_ID=dontKillMe

echo $BUILD_ID
sudo chmod 777 ./gradlew

PID=$(lsof -t -i :"${SERVER_PORT}")

echo "${PID}"
# If PID exists, kill the process
if [ -n "${PID}" ]; then
    echo "Process running on port $PORT (PID: $PID). Killing it now..."
    kill -9 $PID
    echo "Process on pocdrt $PORT has been terminated."
else
    echo "No process is running on port $PORT. Exiting normally."
fi

sleep 1

sudo ./gradlew clean bootjar
SPRING_OPTION="${SPRING_OPTION} --server.port=${SERVER_PORT}"
#SPRING_OPTION="${SPRING_OPTION} --spring.profiles.active=production"

echo ${SPRING_OPTION}
nohup java -jar ./build/libs/currency-0.0.1-SNAPSHOT.jar ${SPRING_OPTION} > ~/ces-.log 2>&1 &
# java -jar ./build/libs/log_api-0.0.1-SNAPSHOT.jar ${SPRING_OPTION}
