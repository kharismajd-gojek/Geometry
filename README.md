#  Line Length Library

## Problem Statement
A library to calculate length of a line in a cartesian system

## Pre-Requisite
1. JDK 11
2. Gradle 6.9.1

## Running Test
```bash
./gradlew test
```

## Building the Library
```bash
./gradlew build
````
This command will result a .jar file in
```/lib/build/libs/lib.jar```

## Importing the Library
Place the .jar file in the ```/libs``` directory

build.gradle
``` java
  dependencies {
     ...
     implementation files('libs/lib.jar')
     ...
  }
```
