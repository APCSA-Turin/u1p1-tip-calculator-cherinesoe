package com.example.project;
import java.lang.Math;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        double tip = cost * ((double) percent / 100); // calculates tip needed to be paid
        double totalCost = cost + tip; // calculates total including tip
        double costPP = cost / people; // calculates cost per person before tip
        double tipPP = tip / people; // calculates tip per person
        double totalCostPP = totalCost / people; // calculates total cost per person

        result.append("-------------------------------\n");
        result.append("Total bill before tip: "); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("$" + (Math.round(cost * 100.0) / 100.0) + "\n");
        result.append("Total percentage: ");
        result.append(percent + "%\n");
        result.append("Total tip: ");
        result.append("$" + (Math.round(tip * 100.0) / 100.0) + "\n");
        result.append("Total Bill with tip: ");
        result.append("$" + (Math.round(totalCost * 100.0) / 100.0) + "\n");
        result.append("Per person cost before tip: ");
        result.append("$" + (Math.round(costPP * 100.0) / 100.0) + "\n");
        result.append("Tip per person: ");
        result.append("$" + (Math.round(tipPP * 100.0) / 100.0) + "\n");
        result.append("Total cost per person: ");
        result.append("$" + (Math.round(totalCostPP * 100.0) / 100.0) + "\n");
        result.append("-------------------------------\n");

        /* I learned how to round using Math.round from https://www.educative.io/answers/how-to-use-the-java-mathround-method */
        
        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
