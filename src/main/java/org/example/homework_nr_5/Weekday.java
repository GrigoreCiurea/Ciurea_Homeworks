package org.example.homework_nr_5;

public enum Weekday {
    monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    public  boolean isWeekDay(){
        switch (this) {
            case monday :
            case tuesday:
            case wednesday:
            case thursday:
            case friday:
                return true;
            default:
                return false;
        }

    }

    public boolean isHoliday(){
        switch (this) {
            case saturday:
            case sunday:
                return true;
            default:
                return false;
        }

    }

}
