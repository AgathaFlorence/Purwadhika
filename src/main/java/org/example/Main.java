package org.example;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //area of rectangle
        int rectanglelength = 5;
        int rectanglewidth = 3;

        System.out.println(rectanglelength * rectanglewidth);

        //diameter, circumference and area of circle
        int radius = 5;
        int diameter = 2 * radius;
        float pi = 3.14159f;

        float circumference = (pi * diameter);

        System.out.println(diameter);
        System.out.println(circumference);

        float areacircle = (pi*(radius*radius));

        System.out.println(areacircle);

        //Difference between dates
        LocalDate date1 = LocalDate.of(2024,03,19);

        LocalDate date2 = LocalDate.of(2024,03,21);

        long noOfDaysBetween = ChronoUnit.DAYS.between(date1,date2);
        System.out.println(noOfDaysBetween);







    }

}