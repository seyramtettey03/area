package com.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// TODO DECLARE VARIABLES
    int base;
    int height;
    int area;
    String answer;
    Scanner lighthouse;
        //TODO  initialize variables
        lighthouse = new Scanner(System.in);
        //todo prompt the user
        System.out.println("welcome to thr area caculater");
         System.out.println("do you want to find the are of a \"square\" or \"rectangle\"?");
        //todo build variables for equation
       answer = lighthouse.nextLine();
        if (answer.equals("square")){
           System.out.println("what is the length of one side?");
           base = lighthouse.nextInt();
            area = base * base;

        }

        else{
            System.out.println("what is the length of the base?" );
            base = lighthouse.nextInt();
            System.out.println("what is the length of the height?" );
            height = lighthouse.nextInt();
            area = base *height;
        }
        //todo calculate

        // todo print results
        System.out.println("The area of the " + answer + " is "+ area);


    }
}
