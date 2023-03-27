package org.example.homework_nr_3;

public class TemperatureConverter {

    double celsius;
    double faren;

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter(23,15);
        temperatureConverter.toCelsius(temperatureConverter.faren);
        temperatureConverter.toFaren(temperatureConverter.celsius);


    }

    public TemperatureConverter(double celsius,double faren) {
        this.celsius = celsius;
        this.faren = faren;
    }

    public void toFaren(double celsius){
        double equalFar = (celsius * 1.8) + 32;
        System.out.println("Convert temperature from Celsius to Fahrenheit:  " + equalFar);

    }
    public void toCelsius(double faren){
        double equalCelsius = (faren -32) / 1.8;
        System.out.println("Convert temperature from Fahrenheit to Celsius:  " + equalCelsius);
    }
}

