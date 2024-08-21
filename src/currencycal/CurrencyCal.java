/*
This program allows the user to calculated the value smount of usd with 
supported currencies from other countries.
the value for MXN, CAN, and JPY are based on the given value from may 31, 2024
from google
MADE BY: LUIS V
*/
package currencycal;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;


public class CurrencyCal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> list = new ArrayList();
        DecimalFormat df = new DecimalFormat("0.00");
        String choice;
        String choice2 = "nothing";
        boolean loop = true;
        double amount;
        Scanner scnr = new Scanner(System.in);
        
        list.add("Mexico (MXN/Mexican Pesos)");
        list.add("Japan (JPY/Japanese Yen)");
        list.add("Canada (CAD/Canadian Dollars)");
        
        System.out.println("What type of currency do you want to convert?");
        System.out.println("To view the supported countries type \"view\" ");
        
        choice = scnr.next();
        System.out.println("");
        
        do {
            if (choice2.equalsIgnoreCase("yes"))
            {
                System.out.println("");
                System.out.println("Enter the country's name");
                choice = scnr.next();
                loop = false;
            }
        if (choice.equalsIgnoreCase("view")) // views list
        {
            System.out.println(list);
            System.out.println("Do you want to continue? [Yes or No]");
            choice2 = scnr.next(); 
            if(choice2.equalsIgnoreCase("yes"))
            {
                loop = true;
            }
            else if(choice2.equalsIgnoreCase("no"))
            {
                System.out.println("");
                System.out.println("Have a wonderful day, goodbye!");
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong Input");
                System.out.println("Try Again");
                System.out.println("");
            }
        } 
        else
        {
            loop = false;
        }
        } while (loop == true);
        
        if (!choice.equalsIgnoreCase("mexico") && !choice.equalsIgnoreCase("japan") 
        && !choice.equalsIgnoreCase("canada"))
        {
            System.out.println("unsoported country or wrong input");
            System.out.println("Program is closing, goodbye.");
            System.exit(0);
        }
        
        System.out.println("");
        System.out.println("How much will you convert?");
        System.out.println("Enter amount");
        amount = scnr.nextDouble();
        System.out.println("You entered: " + amount);
        System.out.println("");
                
        
        
        if (choice.equalsIgnoreCase("mexico"))
        {
            Converter c = new Converter(amount, 17.0416);
            System.out.println(c.toString()+ " Mexican Pesos");
//            System.out.println(df.format(amount) + " USD is:");
//            System.out.println(df.format(MXN(amount)) + " Mexican Pesoss" );
        }
        else if (choice.equalsIgnoreCase("japan"))
        {
            Converter c = new Converter(amount, 157.25);
            System.out.println(c.toString()+ " Japanese Yen");
        }
        else if (choice.equalsIgnoreCase("canada"))
        {
            Converter c = new Converter(amount, 1.36535);
            System.out.println(c.toString()+ " Canadian Dollars");
        }
       
        
    } // end of main
    
    
} // end of CurrencyCal
