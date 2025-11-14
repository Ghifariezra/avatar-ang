#!/bin/bash

javac -d bin ./src/com/polymorphism/*.java ./src/com/services/*.java ./src/com/App.java
java -cp bin com.App
