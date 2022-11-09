#!/bin/bash

jarFilePath="lib/junit-platform-console-standalone-1.9.1.jar"
JAVA_REGEX=".*\.java"

if [ ! -d "lib" ]; then
	echo "The directory lib is missing or misspelled."
elif [ ! -e $jarFilePath ]; then
	echo "The file $jarFilePath is missing."
elif [ !  -e $1 ]; then
    echo "The file $1 does not exist."
elif [[ ! $1 =~ $JAVA_REGEX ]]; then
    echo "The file "$1" is not a Java file" 
else 
    classFilePath=`basename -s .java $1`
    classFileDir=`dirname $1`"/"
	classAccess="${classFileDir//\//.}$classFilePath"
	 
	classFilePath="$classFileDir/$classFilePath.class"
	
	if [ -e $classFilePath ]; then
	    rm $classFilePath
	fi

    javac -cp "$jarFilePath:." $1
    
    if [ -e $classFilePath ]; then
        java -jar "$jarFilePath" -cp . --select-class "$classAccess" --disable-banner --disable-ansi-colors
	fi

fi