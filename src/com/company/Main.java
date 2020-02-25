package com.company;

// Mubarik Abdi 2/24/20
// I did not enjoy this because I was solving things randomly, Kinda randomly.
// Like I understood what I was doing but the logic was not hitting me.
import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // my three methods
        foodie();
        integerInput();
        doubleInput();



    }

    public static void doubleInput(){
        System.out.println("Enter a double: ");
        String number = input.nextLine();

        boolean pass = false;
        double userDouble;

        while (!pass){

            try{
                userDouble = Double.parseDouble(number);
                pass = true;
            }catch (NumberFormatException e){
                System.out.println(number + " Incorrect Input, Try Again Harder");
                number = input.nextLine();
            }
        }
        System.out.println("------------");
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

                System.out.println(number +" Incorrect Input, Try Again Harder");
                number = input.nextLine();
            }

        }
        System.out.println("------------");
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
        System.out.println("----------------------------");
    }

}
