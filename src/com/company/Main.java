package com.company;

import javax.swing.text.html.parser.Parser;
import javax.xml.bind.ParseConversionEvent;
import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //foodie();
        //integerInput();

        System.out.println("Enter a double: ");
        String number = input.nextLine();

        boolean pass = false;
        double userDouble;

        while (!pass){

            try{
                userDouble = Integer.parseInt(number);
                pass = false;
            }catch (NumberFormatException e){
                System.out.println(number + " Incorrect input");
                number = input.nextLine();
            }
        }


    }

    public static void integerInput(){
        System.out.println("Enter an integer: ");
        String number = input.nextLine();


        boolean pass = false;
        int userInt;

        while (!pass){
            try {
                userInt = Integer.parseInt(number);
                pass = true;

            } catch (NumberFormatException e) {

                System.out.println(number +" Incorrect Input");
                number = input.nextLine();
            }

        }
    }

    public static void foodie(){

        boolean pass = false;

        while (pass == false) {
            try {
                System.out.println("What is your favorite food");
                String food = input.nextLine();
                if (Double.parseDouble(food) >= 0 || Double.parseDouble(food) <= 0 || Integer.parseInt(food) >= 0 || Integer.parseInt(food) <= 0) {
                    pass = false;
                    System.out.println("You need to plug in a food name.");
                    System.out.println("---------NEW TRY---------");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getLocalizedMessage());
                pass = true;
            }
        }
    }

}
