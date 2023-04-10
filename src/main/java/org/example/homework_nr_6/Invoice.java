package org.example.homework_nr_6;

public class Invoice {

    private String made;
    private String details;
    private int quantity;
    private double price;

    public Invoice(String made, String details, int quantity, double price) {
        setMade(made);
        setDetails(details);
        setQuantity(quantity);
        setPrice(price);

    }


    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >  0) {
            this.price = price;
        }
    }

    public double getAmount(){
        return quantity * price;
    }
}
