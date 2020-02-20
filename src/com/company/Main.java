package com.company;

import javax.swing.text.html.parser.Parser;
import javax.xml.bind.ParseConversionEvent;
import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        foodie();

    }

    public static void foodie(){
        boolean pass = false;

        while (pass == false) {
            try {
                System.out.println("what is your favorite food");
                String food = input.nextLine();
                if (Double.parseDouble(food) >= 0 || Double.parseDouble(food) <= 0 || Integer.parseInt(food) >= 0 || Integer.parseInt(food) <= 0) {
                    pass = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getLocalizedMessage());
                pass = true;
            }
        }
    }

}
