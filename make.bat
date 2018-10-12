echo off
title Making Sort.jar

javac Sort.java ReaderAndSorter.java ReaderFactory.java ComparatorAscendingOrderCaseInsensitive.java
jar cvfe Sort.jar Sort ReaderAndSorter.class ReaderFactory.class ComparatorAscendingOrderCaseInsensitive.class Sort.class
del *.class