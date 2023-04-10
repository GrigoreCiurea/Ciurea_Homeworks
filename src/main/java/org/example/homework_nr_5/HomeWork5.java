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
        System.out.println(Weekday.SATURDAY.isWeekDay());
        System.out.println();
        System.out.println("Exercise 6");

        String bool = "true";
        boolean booleanValue = Boolean.parseBoolean(bool);
        System.out.println(booleanValue);

        String byteS = "120";
        byte byteValue = Byte.parseByte(byteS);
        System.out.println(byteValue);

        String shortS = "32000";
        short shortValue = Short.parseShort(shortS);
        System.out.println(shortValue);

        String intS = "147895632";
        int intValue = Integer.parseInt(intS);
        System.out.println(intValue);

        String longS = "987654321987654321";
        long longValue = Long.parseLong(longS);
        System.out.println(longValue);

        String doubleS = "4444.5d";
        double doubleValue = Double.parseDouble(doubleS);
        System.out.println(doubleValue);

        String floatS = "2354.56f";
        float floatValue = Float.parseFloat(floatS);
        System.out.println(floatValue);

    }
}
