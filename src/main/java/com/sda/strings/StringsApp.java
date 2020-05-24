package com.sda.strings;

public class StringsApp {
    public static void main(String[] args) {
        //TextUpperCase textUpperCase = new TextUpperCase();
//        String text = "Ala ma Kota";
        //System.out.println("Before: " + text);

//        StringOperation operation = new TextUpperCase();
//        System.out.println(operation.modify(text));
//
//        operation = new TextDuplicate();
//        System.out.println(operation.modify(text));

        //text = textUpperCase.modify(text);
        //System.out.println("After: " + text);

        //TextDuplicate textDuplicate = new TextDuplicate();
        //text = textDuplicate.modify(text);
        //System.out.println("After duplicate: " + text);

        StringOperation appendTextOperationAnonClass = new StringOperation() {
            @Override
            public String modify(String text) {
                return "Modified by anonymous class: " + text;
            }
        };
        System.out.println(appendTextOperationAnonClass.modify("Karol"));
    }

    public static void  modifyAndPrint(String text, StringOperation operation){
        System.out.println(operation.modify(text));
    }
}
