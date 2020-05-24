package com.sda.diary;

import java.time.LocalDate;

public class DiaryApp {

    public static void main(String[] args) {
        Diary diary = new Diary();

        diary.addEntry("first");
        diary.addEntry("second");
        diary.addEntry("third");

        System.out.println(diary.getEntry(LocalDate.now()));
    }
}
