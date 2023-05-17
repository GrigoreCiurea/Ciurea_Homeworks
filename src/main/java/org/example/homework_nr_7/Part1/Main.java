package org.example.homework_nr_7.Part1;

public class Main {

    public static void main(String[] args){
        Person somePerson = new Person("Ion", "Kasanova");
        System.out.println(somePerson);
        Student someStudent = new Student("Valera", "Sokolov", "Java", 2000,18000.20);
        System.out.println(someStudent);
        Staff someStaff = new Staff("Mihail", "Minascurta", "courses",16000.12);
        System.out.println(someStaff);

    }
}
