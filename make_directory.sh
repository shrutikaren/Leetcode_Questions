#!/bin/bash 

# This bash file can be ran to automating create a directory with the name 
# provided by the user and it helps to create the same 4 files that we will 
# need to work with 

mkdir "$1"

touch "$1"/output_python.txt
touch "$1"/output.txt
touch "$1"/result.java
touch "$1"/result.py

