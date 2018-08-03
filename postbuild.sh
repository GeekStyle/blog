#!/bin/bash
# build image, upload image, update service image

docker build -t geekstylecn/blog:1.0.0 .
docker push geekstylecn/blog:1.0.0
docker service update blog --image geekstylecn/blog:1.0.0
echo "---done---"