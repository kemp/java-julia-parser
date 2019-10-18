# Java to Julia Processor [![Build Status](https://travis-ci.com/kemp/java-julia-processor.svg?branch=master)](https://travis-ci.com/kemp/java-julia-processor)

A language processor for Julia written in Java.

It has three parts:
1. [Scanner](./src/main/java/me/javajuliaprocessor/Scanner.java)
2. Parser
3. Interpreter

This is a school project for CS 4308 Concepts of Programming Languages.

## Installation

> This project uses [Maven](https://maven.apache.org).

1. Clone or download the project.
2. Run `mvn install` to install dependencies

## Usage

```bash
$ mvn package
$ java -cp target/JavaJuliaProcessor-1.0-SNAPSHOT.jar me.javajuliaprocessor.ScannerDriver [julia_file]
```

Be sure to include the Julia file you want to parse
