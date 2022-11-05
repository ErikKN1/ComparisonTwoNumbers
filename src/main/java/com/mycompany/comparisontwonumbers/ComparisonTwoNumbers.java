

package com.mycompany.comparisontwonumbers;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class ComparisonTwoNumbers {

    public static void main(String[] args) {
        double number1,
                number2;

        Scanner InDate=new Scanner(System.in);
        System.out.println("Enter first number");
        number1=InDate.nextDouble();
        System.out.println("Enter second number");
        number2=InDate.nextDouble();
        if(number1>=number2){
            if(number1==number2){
                System.out.println("The numbers is iquals");
            }
            else{
                System.out.println("number " +number1+ " is greater than number " + number2);
            }
            
        }
        else{
                  System.out.println("number " +number2+ " is greater than number " + number1);
        }
    }
}
