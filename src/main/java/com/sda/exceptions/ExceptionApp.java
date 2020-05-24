package com.sda.exceptions;

import com.sda.strings.StringOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionApp {

    public static void main(String[] args) {

//        try {
//            List<String> texts = List.of("Ala","ma","kota","a","Karol","komputer");
////            List<String> texts = new ArrayList<>();
////            texts.add("Ala");
////            texts.add("ma");
////            texts.add("kota");
//
//            System.out.println("Choose index from 0 to 2: ");
//            Scanner scanner = new Scanner(System.in);
//            String text = scanner.nextLine();
//
//            System.out.println("You entered: " + text);
//
//            int index  = Integer.parseInt(text);
//
//            System.out.println("chosen text: " + texts.get(index));
//        } catch (IndexOutOfBoundsException exception){
//            System.out.println("you asked for too much!");
//        } catch (RuntimeException exception){
//            System.out.println("Unknown error");
//        } finally {
//            System.out.println("Exiting!");
//        }
//
        System.out.println("enter your name:");
        Scanner s = new Scanner(System.in);
        String inputText = s.nextLine();

        try {
            greet(inputText);
        } catch (InvalidNameException exception){
            System.out.println("It seems like you passed wrong data!");
        }
        System.out.println("next message");
    }

//    private static void greet(String who){
//
//        if(who == null || who.isBlank()){
//            throw new IllegalArgumentException("passed text [" + who + "] is invalid");
//        }
//
//        System.out.println("Hello " + who);
//
//    }

    private static void greet(String name) throws InvalidNameException{

        if(name == null || name.isBlank()){
            throw new InvalidNameException(name);
        }
        System.out.println("Hello " + name);
    }
}
