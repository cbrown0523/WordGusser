package com.careerdevs.userInput;


import com.careerdevs.Word;

import java.util.Scanner;

public class UserInput {
    public static String ULetterChoice;
    public static String letterGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a character");
         ULetterChoice = scan.next();


        return ULetterChoice;
    }

}
