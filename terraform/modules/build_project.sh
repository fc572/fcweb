#!/bin/bash

set -e

export AWS_SDK_LOAD_CONFIG="true"

#Run docker file

cd ./${BASE_PATH}
echo "Base Path: ${BASE_PATH}"
cd ../../
echo "building jar with maven..."
mvn clean install
