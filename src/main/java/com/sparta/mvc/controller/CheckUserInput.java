//package com.sparta.mvc.controller;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class CheckUserInput {
//
//    public static String checkUserInput(String options) throws Exception {
//
//        Scanner scanner = new Scanner(System.in);
//        String s = "";
//        boolean pick = false;
//
//        while(!pick){
//            try{
//                s = scanner.next();
//                if(s != options){
//                    throw new Exception();
//                }
//                pick = true;
//            } catch (InputMismatchException i){
//                System.out.println("wrong input!");
//                scanner.nextLine();
//            }
//        }
//        return s;
//
//    }
//
//}
