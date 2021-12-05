package com.sparta.mvc.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static Logger logger = LogManager.getLogger("Sort manager project");

    public static final String invalidInput = "Invalid input, please try again...";
    public static final String options = ("Type 'b' for using Bubblesort method,\n" +
            "type 'q' for using Quicksort method,\ntype 'both' to compare performance between Bubblesort and Quicksort,\n" +
            "or 't' for Binary Sort Tree method,\n'e' to Exit.");

    public static final String listOptions = "Type 'a' for sorting Arrays, or type 'l' for sorting Lists";
    
    public static final String bubblePick = "Bubble sort method chosen";
    public static final String quicksortPick = "Quick sort method chosen";
    public static final String binaryTreePick = "Binary tree sort method chosen";
    public static final String arraysSortingPick = "You picked Array sorting";
    public static final String listsSortingPick = "You picked List sorting";

    public static final String exitMessage = "Goodbye. Exiting...";






}
