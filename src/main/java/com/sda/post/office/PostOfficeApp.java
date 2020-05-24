package com.sda.post.office;

import java.util.Scanner;

public class PostOfficeApp {

    public static void main(String[] args) {
//        Package rower = new Package("rower");
//        System.out.println(rower);
//
//        rower.changeStatus(PackageStatus.LOST);
//        System.out.println(rower);

        Scanner s  = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Statuses:");

        PackageStatus[] statuses = PackageStatus.values();
        for (PackageStatus status: statuses){
           System.out.println(status);
       }

        System.out.println("Choose staus:");
        String inputText = s.nextLine();
        try{
        PackageStatus chosenStatus = PackageStatus.valueOf(inputText.toUpperCase());
            System.out.println("You choose: " + chosenStatus.getDescription());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
