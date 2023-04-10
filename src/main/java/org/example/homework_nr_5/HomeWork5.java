package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
//Exercise 4
        System.out.println("Exercise 4");
        System.out.println();
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        //Exercise 5
        System.out.println();
        System.out.println("Exercise 5");
        System.out.println();
        System.out.println(Weekday.monday.isWeekDay());

        String bool = "true";
        boolean booleanValue = Boolean.parseBoolean(bool);

        String byteS = "120";
        byte byteValue = Byte.parseByte(byteS);

        String shortS = "32000";
        short shortValue = Short.parseShort(shortS);

        String intS = "147895632";
        int intValue = Integer.parseInt(intS);

        String longS = "987654321987654321";
        long longValue = Long.parseLong(longS);

        String doubleS = "4444.5d";
        double doubleValue = Double.parseDouble(doubleS);

        String floatS = "2354.56f";
        float floatValue = Float.parseFloat(floatS);

    }
}
