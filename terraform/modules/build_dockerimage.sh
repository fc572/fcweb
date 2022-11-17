#!/bin/bash

set -e

export AWS_SDK_LOAD_CONFIG="true"

#Run docker file

cd ./${BASE_PATH}
cd ../../src/main/java/com/http_codes/docker
echo "Running copy command..."
cp /root/.m2/repository/com/http_codes/httpCodes/0.0.1-SNAPSHOT/httpCodes-0.0.1-SNAPSHOT.jar .
docker build -t httpcodes:01 .