FROM openjdk:8-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY ./build/libs /app

EXPOSE 8082

# Define environment variable
ENV NAME api-gateway-docker

# Run jar when the container launches
# 注意修改该部分jar名称
CMD java -jar demo-0.0.1-SNAPSHOT.jar