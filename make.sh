#!/bin/bash

javac Sort.java ReaderAndSorter.java ReaderFactory.java ComparatorAscendingOrderCaseInsensitive.java
jar cvfe Sort.jar Sort Sort.class ReaderAndSorter.class ReaderFactory.class ComparatorAscendingOrderCaseInsensitive.class
rm *.class

