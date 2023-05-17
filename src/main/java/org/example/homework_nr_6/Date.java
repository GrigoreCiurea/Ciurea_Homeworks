package org.example.homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid Day: " + day);
        }
    }

    public void setMonth ( int month){
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month: " + month);
        }
    }

    public void setYear ( int year){
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d\n", day, month, year);
    }
}
