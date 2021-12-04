package com.sparta.mvc.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static Logger logger = LogManager.getLogger("Sort manager project");

    public static final String invalidInput = "Invalid input, please try again...";
    public static final String options = ("Type 'b' for using Bubblesort method,\ntype 'q' for using Quicksort method,\ntype 'both' to compare performance\nor 't' for Binary Sort Tree\n'e' to Exit.");

    public static final String listOptions = "Type 'a' for sorting Arrays, or type 'l' for sorting Lists";


    public static final String bubblePick = "Bubble sort method chosen";
    public static final String quicksortPick = "Quick sort method chosen";

    public static final String exitMessage = "Goodbye. Exiting...";



//    public static final String unknownOption = "Unknown option. Choice: bubble or quick (q to exit) > ";
//    public static final String invalidInput = "Invalid input";

//    public static final String bubble = "bubble";
//    public static final String quick = "quick";
//    public static final String quit = "q";



}
