package org.example.homework_nr_5;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public  boolean isWeekDay(){
        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return true;
            default:
                return false;
        }

    }

    public boolean isHoliday(){
        if(this != SATURDAY && this != SUNDAY){
            return true;} else{
            return false;}

    }

}
