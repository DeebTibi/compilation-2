# Use the official Ubuntu image as the base
FROM ubuntu:latest

# Set environment variables to prevent interaction during package installation
ENV DEBIAN_FRONTEND=noninteractive

# Update packages and install necessary tools
RUN apt-get update && \
    apt-get install -y \
    software-properties-common \
    curl \
    gnupg \
    build-essential \
    make && \
    apt-get clean

# Install Java SDK
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    apt-get clean

# Install JFlex
RUN curl -L https://github.com/jflex-de/jflex/releases/download/v1.8.2/jflex-1.8.2.tar.gz | tar -xz && \
    mv jflex-1.8.2 /usr/local/jflex && \
    ln -s /usr/local/jflex/bin/jflex /usr/local/bin/jflex

# Create a workspace directory
RUN mkdir -p /workspaces/compilation

# Set the workspace as the working directory
WORKDIR /workspaces/compilation

# Define a default command (optional)
CMD ["/bin/bash"]
