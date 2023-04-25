<p align="center">
  <a href="" rel="noopener">
 <img width=250px src="https://5growth.eu/wp-content/uploads/2019/05/ALB.jpg" alt="Project logo"></a>
</p>

<h3 align="center">Sequence Number Challenge</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> This is a project to calculate the sequence of numbers based on a pre-determined pattern.
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>

Implement a REST service, using a JAVA framework, returning a value from the labseq sequence.

Optionally implement a simple JavaScript web GUI to invoke the service.

The labseq – l(n) - sequence is defined as follows:

n=0 => l(0) = 0

n=1 => l(1) = 1

n=2 => l(2) = 0

n=3 => l(3) = 1

n>3 => l(n) = l(n-4) + l(n-3)

Example of the first sequence values:
0 
1
0
1
1
1
1
2
2
2
3
[...]

The endpoint created should be in the form %baseurl% /labseq/{n} where {n}

represents the index of the sequence’s (single) value to return. The index may be any non-
negative integer number.

The implemented service should use a caching mechanism to take advantage of previous
calculations to speed up future calculations. This caching mechanism must be used in the
algorithm’s intermediate calculations (if applicable), and not only in the endpoint’s
invocations.

## 🏁 Getting Started <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Acceptance Criteria

• Source code

• REST API documentation – Open API format (Swagger)

• Execution instructions (containers or other)


### Prerequisites

Install docker https://docs.docker.com/engine/install/



### Installing

What do you need to run?

1. Clone or download the git repository: 
2. In main folder called Altice Labs run the comand:

```
docker-compose build
docker-compose run
```

After that open you browser and access the link

```
FRONTEND: http://localhost:4200/
BACKEND:  http://localhost:8085/api/v1/labseq
SWAGGER:  http://localhost:8085/swagger-ui/index.html
```
After that open you browser and access the link

```
Insert one algarism and click on button Get Sequence...
```
After that, the sequence must appear in the text box below.

## 🔧 TO-DO List <a name = "tests"></a>

* Performance improvement.
* Write the test cases and unit tests.

## 🎈 Usage <a name="usage"></a>

You can use de application to generate the sequence number based on the pattern.

## 🚀 Deployment <a name = "deployment"></a>

Can be deployable on self-contained Java-based program ready to run out-of-the-box, with packages for Windows, Linux, macOS and other Unix-like operating systems.

## ⛏️ Built Using <a name = "built_using"></a>

- [SpringBoot](https://spring.io/) - Java framework
- [Redis](https://redis.io/) - Open source, in-memory data store
- [Swagger](https://swagger.io/) - Open API Format
- [Angular](https://angular.io/) - Platform for building mobile and desktop web applications.

## ✍️ Authors <a name = "authors"></a>

- [@salvis.jobs](https://github.com/salvisjobs) - Senior Software Engineer - Java Specialist

See also the list of [contributors](https://github.com/kylelobo/The-Documentation-Compendium/contributors) who participated in this project.

## 🎉 Acknowledgements <a name = "acknowledgement"></a>

- WithUs
- Altice Labs
