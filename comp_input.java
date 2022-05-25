
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        
        // initialize the variables

        float number = 4;
        float num = 100;
        
        float rate = ( number / num );
        int principal;
        int time;
        int number_of_time;
        int amount;
        
        // user input for the values used in the compound calculation

        Scanner calc = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        principal = calc.nextInt();
        System.out.println("Enter Time: ");
        time = calc.nextInt();
        System.out.println("Enter Frequency: ");
        number_of_time = calc.nextInt();
        
        // amount calculated by the compound formula

        amount = (int) (principal * Math.pow(1 + (rate / number_of_time), number_of_time * time));


        System.out.println("The Amount is : $" + amount);


    }

}
