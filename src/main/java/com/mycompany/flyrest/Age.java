
package com.mycompany.flyrest;

import java.time.LocalDate;

public class Age {

    private int day;
    private int month;
    private int year;

    LocalDate date = LocalDate.now();
    int Year = date.getYear();

    String c = "";

    public Age(int day) {
        this.day = day;
    }

    public Age() {

    }

    public Age(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getTheAge() {
        // TheAge=2023-The year he was born 
        int TheAge = Year - year;

        if (TheAge >= 0 & TheAge < 3) {
            c = "Infant";
        } else if (TheAge > 2 & TheAge < 13) {
            c = " Child";
        } else {
            c = " Adult";
        }
        return c;
    }
}
