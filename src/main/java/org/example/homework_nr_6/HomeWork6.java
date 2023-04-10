package org.example.homework_nr_6;

public class HomeWork6 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Tara", "oil",-2 , 12.3);
        System.out.println("Made: " + invoice.getMade());
        System.out.println("Details: " + invoice.getDetails());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Amount: " +invoice.getAmount());

        Date date = new Date(13, 11,2021);
        date.displayDate();

    }
}
