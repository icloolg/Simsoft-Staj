# TCP Client-Server Communication

This repository contains a simple TCP client-server communication example in Java. The client sends messages to the server, and the server receives and processes these messages.

## Changes Made

1. **Port Change**:
   - Changed the port number from `2861` to `5001` in both client and server code to avoid port conflicts.

2. **Error Handling**:
   - Updated the client code to handle the `NoSuchElementException` when the client sends the "BYE" message and closes the connection.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Git installed

### Running the Server

1. Compile the server code:
   ```bash
   javac TCPServer.java
