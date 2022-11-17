#Login
aws ecr get-login-password --region eu-west-2 | docker login --username AWS --password-stdin 045741104708.dkr.ecr.eu-west-2.amazonaws.com
#evaluate image id
IMAGE_ID=$(docker images httpcodes:01 -q)
#tag image to latest
docker tag ${IMAGE_ID} 045741104708.dkr.ecr.eu-west-2.amazonaws.com/fc572-ecr-repo:latest
#push image to ecr
docker push 045741104708.dkr.ecr.eu-west-2.amazonaws.com/fc572-ecr-repo:latest