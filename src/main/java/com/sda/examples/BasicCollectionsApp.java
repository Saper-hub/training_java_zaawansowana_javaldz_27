package com.sda.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCollectionsApp {
    public static void main(String[] args) {

        List<String> teksty = new ArrayList<>();
        teksty.add("Tekst 1");
        teksty.add("Tekst 2");

        for (int i = 0; i < teksty.size(); i++) {
            System.out.println(teksty.get(i));
        }

        Map<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Karol", "627627555");
        //replace previous
        phoneNumbers.put("Karol", "888488842");
        phoneNumbers.put("Janina", "889645126");

        System.out.println("MAP:");
        System.out.println(phoneNumbers.get("Karol"));
        System.out.println(phoneNumbers.get("Marek"));
        System.out.println(phoneNumbers.containsKey("Janina"));
        System.out.println(phoneNumbers.get("Janina"));
        System.out.println(phoneNumbers.containsKey("999888777"));
    }
}
