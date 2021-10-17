# Leaky Web Server Exercise

Installation instructions for:

* [Windows](#running-on-windows)
* [macOS](#running-on-macos)
* [Linux](#running-on-linux)

## Running on Windows

### Pre-requisites

The following need to be installed on your system:

* [Git for Windows](https://git-scm.com/download/win)
* [Docker Desktop](https://www.docker.com/products/docker-desktop)
* [Java (64-bit)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-win_x64.msi) or [Java (32-bit)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-win_i686.msi)

### Clone this repository

After installing all of the above tools, open Windows PowerShell as Administrator and run the following commands:

```shell
git config --global core.autocrlf false
git clone https://github.com/tariqking/perftest-leakyserver.git
cd perftest-leakyserver
```

### Build and run the project

Using the same PowerShell as above, build the project using the following build script

```shell
.\bnd.bat
```

### Grafana

* [Login to grafana at this link](http://127.0.0.1:3000/login) with these credentials

```
user: admin
pass: admin
```

You can then view these dashboards:
* [App Stats Dashboard](http://localhost:3000/d/17kOE7Onk/spring-boot-app?orgId=1&refresh=30s&from=now-15m&to=now)
* [Prometheus Stats Dashboard](http://localhost:3000/d/UDdpyzz7z/prometheus-stats?orgId=1&refresh=5s&from=now-15m&to=now)

## Running on macOS

### Pre-requisites

The following need to be installed on your system:

* [Docker Desktop](https://www.docker.com/products/docker-desktop)
* [Java (Intel Chip)](https://cdn.azul.com/zulu/bin/zulu8.56.0.21-ca-jdk8.0.302-macosx_x64.dmg) or * [Java (Apple M1 Chip)](https://cdn.azul.com/zulu/bin/zulu8.56.0.23-ca-jdk8.0.302-macosx_aarch64.dmg)

### Clone this repository

After installing all of the above tools, open a terminal and run the following commands:

```shell
git clone https://github.com/tariqking/perftest-leakyserver.git
cd perftest-leakyserver
```

### Build and run the project

Using the same terminal as above, build the project using the following build script

```shell
./bnd.sh
```

### Grafana

* [Login to grafana at this link](http://127.0.0.1:3000/login) with these credentials

```
user: admin
pass: admin
```

You can then view these dashboards:
* [App Stats Dashboard](http://localhost:3000/d/17kOE7Onk/spring-boot-app?orgId=1&refresh=30s&from=now-15m&to=now)
* [Prometheus Stats Dashboard](http://localhost:3000/d/UDdpyzz7z/prometheus-stats?orgId=1&refresh=5s&from=now-15m&to=now)

## Running on Linux

### Pre-requisites

The following need to be installed on your system:

* [Docker](https://docs.docker.com/get-docker/)
* [Docker Compose](https://docs.docker.com/compose/install/)
* [Java](https://www.azul.com/downloads/?version=java-8-lts&os=linux&package=jdk)

### Clone this repository

After installing all of the above tools, open a terminal and run the following commands:

```shell
git clone https://github.com/tariqking/perftest-leakyserver.git
cd perftest-leakyserver
```

### Build and run the project

Using the same terminal as above, build the project using the following build script

```shell
./bnd.sh
```

### Grafana

* [Login to grafana at this link](http://127.0.0.1:3000/login) with these credentials

```
user: admin
pass: admin
```

You can then view these dashboards:
* [App Stats Dashboard](http://localhost:3000/d/17kOE7Onk/spring-boot-app?orgId=1&refresh=30s&from=now-15m&to=now)
* [Prometheus Stats Dashboard](http://localhost:3000/d/UDdpyzz7z/prometheus-stats?orgId=1&refresh=5s&from=now-15m&to=now)

## Optional

The following would be needed to modify the project

* [JMeter](https://jmeter.apache.org/download_jmeter.cgi)
* [JMeter Prometheus Plugin](https://github.com/johrstrom/jmeter-prometheus-plugin/releases)
* [VS Code](https://code.visualstudio.com/download)
