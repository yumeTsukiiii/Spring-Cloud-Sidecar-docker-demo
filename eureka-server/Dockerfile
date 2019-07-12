# Use an official Python runtime as a parent image
# 使用openjdk8作为父镜像
FROM openjdk:8-jdk-alpine

# Set the working directory to /app
# 设置运行时使用的工作目录
WORKDIR /app

# Copy the current directory contents into the container at /app
# 复制libs下的文件到/app目录
COPY ./build/libs /app

# Make port 8080 available to the world outside this container
# 暴露8080端口，我们的服务注册中心是在8080端口运行的
EXPOSE 8080

# Define environment variable
# 配置环境变量(这里可有可无)
ENV NAME eureka-server-docker

# Run jar when the container launches
# 设置容器运行时的指令
CMD java -jar demo-0.0.1-SNAPSHOT.jar