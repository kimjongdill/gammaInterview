#!/bin/bash

javac Sort.java ReaderAndSorter.java ReaderFactory.java ComparatorAscendingOrderCaseInsensitive.java
jar cvfe Sort.jar Sort .
rm *.class

