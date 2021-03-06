# Project Title

Sort Manager Project

## Introduction

This repository contains code for the Sort Manager Project for Sparta Global.

**Description**

The purpose of this project is to build a sort manager that implements different sorting algorithms by using SOLID principles, design patterns and Java features. Unit testing was also required.
The three main sorting algorithms implemented in this project are BubbleSorting, QuickSorting and Binary Tree Sorting.


The MVC(Model-View-Controller) pattern is implemented for controlling logic and data. It emphasizes in the separation between the software's business logic and display. It provides better division of labor and improved maintenance.



## How to run the application

In the controller package, you can find the Runner class where you can run the application.

```
package com.sparta.mvc.controller;
```
Upon startup you are welcomed to the application and prompted to type specific letters for using the algorithms. When typing a wrong letter a message of "invalid input" is displayed and prompted to type again. 

`Type 'b' for using Bubblesort method,`
`type 'q' for using Quicksort method,`
`if you want to compare performance between Bubblesort and Quicksort methods type 'c',`
`or 't' for Binary Sort Tree method,`

`type 'e' to Exit.`

When choosing the sorting method you are prompted to choose sorting between Arrays or Lists.

The default elements of the sorting methods are set to 100.

`Type 'a' for sorting Arrays, or type 'l' for sorting Lists`

When choosing the type, the results are shown below. The Unsorted Array and below the Sorted Array in ascending order. The time for the algorithm to run in Nano seconds is also displayed.





Folder Structure

![](scrnshots/fStructure.png)



Getting Started

![](scrnshots/Getting%20Started.png)



Bubble Sorting Array example

![](scrnshots/Bubblesort%20array%20sorting.png)



Comparing methods

![](scrnshots/InkedComparing%20methods_LI.jpg)





**Unit Tests**
These tests, test the algorithms if the Array or List is null, or if there are any duplicate values. It also tests the functionality of the algorithms. This happens with dummy values, empty arrays and with assertions.
There are several types of assertions, but the main ones are assertEquals, assertArrayEquals, assertNull, assertNotNull, assertTrue.




## Built With
* [Maven](https://maven.apache.org/) - Dependency Management



## Authors

* **Nikolaos Papadopoulos** - [Moodhunter34](https://github.com/Moodhunter34)

* Hat tip to anyone whose code was used
* Inspiration

