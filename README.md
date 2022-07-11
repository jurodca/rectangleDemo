# Rectangle Exercise

This project implements certain algorithms that
analyze rectangles and features that exist among rectangles. The operations
related in this project are (Intersect, Contains, Adjacent).

## Introduction 🚀

A rectangle can be represented by two coordinates, top left and bottom right.
I have a class Point that represents a coordinate (X,Y), and also we have 
a Rectangle class that has two points, Top Left and Bottom Right.

I defined an Interface Operations, that receives a Generic T. This will allow me 
to work with different types of objects in the future. 

The class RectangleOperations implements the Operations Interface and has all the logic
to solve the problem.

I also included Coverage and PMD Reports in pom.xml


### Pre-requisites 📋

- You need to have Java 17 installed in your machine and Maven.
- You can use any IDE that supports Java and Maven projects.
- You need git if you want to clone the project. 

### Installation 🔧

Clone or download the project, then open it with you IDE and
run the following command in maven.

```
mvn clean install
```

Then, you open the RectangleDemoApplication and run it.
You will see a short introduction to the Exercise and then you will
ask to enter some information. 

This a little example

```
############################# RECTANGLE EXERCISE ###############################

Given two Rectangles, find if the given two rectangles intersect, one contains to other,
or if one is adjacent to other. 
Note that a rectangle can be represented by two points, 
top left and bottom right.Every point has a coordinate (X,Y). 

Enter the data of Rectangle One ...

Enter the Top Left Coordinate: 

Coordinate X:
```

## Running the tests ⚙️

Run the following command using Maven

```
mvn test
```

You can check the JaCoCo (Coverage) report and PMD report
running the following commands

```
mvn clean install
```

and

```
mvn site
```

You will find the jacoco report under the following 
directory

```
<project-directory> /target/site/jacoco/index.html
```

You will find PMD report under the following directory

```
<project-directory> /target/site/index.html
```

you can see the PMD option on the left menu

## Dependencies 📦

In this projects we use some dependencies that are important in the project

### Lombok
Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* [Lombok](https://projectlombok.org/)

### PMD
PMD is a static source code analyzer. It finds common programming flaws like unused variables, empty catch blocks, unnecessary object creation, and so forth
* [PMD](https://pmd.github.io/)

### JaCoCo
JaCoCo is an open source toolkit for measuring code coverage in a code base and reporting it through visual reports
* [JaCoCo](https://github.com/jacoco/jacoco)

## Author ✒️

* **Julian Rodriguez** - *Developer* - [jurodca](https://github.com/jurodca)

## License 📄

This project is under the GPL License

