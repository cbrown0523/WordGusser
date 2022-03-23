package com.careerdevs;

import com.careerdevs.userInput.UserInput;

import java.util.ArrayList;
import java.util.Collections;

public class Word {
    public static int index;
    public static String wordToGuess = "" ;
    public static int getSizeOfRandomWord;
    static int numOfGuesses = 0;

    public static ArrayList<String> wordList = new ArrayList<>();
    public static ArrayList<String> characters = new ArrayList<>(100);
    public static ArrayList<String> rightLetterChoice = new ArrayList<>();
    public static ArrayList<String> wrongLetterChoice = new ArrayList<>();


    public static void words() {
        wordList.add("Rose");
        wordList.add("Daisy");
        wordList.add("Sunflower");
        wordList.add("Orchid");
   System.out.println("wordlist " + wordList.get(index).length());
       // return wordList;


    }

    public static int getRandomWord() {
        words();
        for (int i = 0; i < wordList.size(); i++) {
             index = (int) (Math.random() * wordList.size());

            System.out.println("the random word is  at index " + "" + index);
            return index;
        }
        return 0;
    }
    @Override
    public boolean equals(Object o){
        if(this == o ){
            System.out.println("You won!");
           // return true;
        }
        return true;
    }
    public static void numGuess(){
        wordToGuess = wordList.get(index);
        getSizeOfRandomWord = (wordToGuess).length();

        System.out.println("num " + wordToGuess.length());
        System.out.println("the size of random word " + getSizeOfRandomWord);
        System.out.println("num  of length i want to set to guess " + "" + wordToGuess);


       for(int i = 100 ; i > wordToGuess.length() ; i-- ){
           UserInput.letterGuess();
            if(!wordToGuess.contains(UserInput.ULetterChoice))    {
                System.out.println("The letter you have chosen is not in the random word. Try again");
                wrongLetterChoice.add(UserInput.ULetterChoice);
                Collections.sort(wrongLetterChoice);
                characters.add(UserInput.ULetterChoice);
                Collections.sort(characters);
                System.out.println("wrong guess " +  wrongLetterChoice);
                System.out.println("right guess " + rightLetterChoice);
                System.out.println("characters chosen: " + "" + characters);

                numOfGuesses ++;
                System.out.println("Guesses : " + numOfGuesses);
            }else {
                System.out.println("Great ! That letter is in the random word");
                rightLetterChoice.add(UserInput.ULetterChoice);
                Collections.sort(rightLetterChoice);
                characters.add(UserInput.ULetterChoice);
                Collections.sort(characters);
                System.out.println("wrong " +  wrongLetterChoice);
                System.out.println("right guess " + rightLetterChoice);
                System.out.println("characters chosen: " + "" + characters);
                numOfGuesses ++;
                System.out.println("Guesses : " + numOfGuesses);
                if(rightLetterChoice.equals(getSizeOfRandomWord) ){
                    System.out.println("You won!");
                    break;
                   // System.out.println();
                }
            }
            //System.out.println(letterChoice);

        }





            //System.out.println(wordList.get(index));
        /*while(!wordToGuess.contains(UserInput.ULetterChoice)){
            System.out.println("The letter you have chosen is not in the random word");
            wrongLetterChoice.add(UserInput.ULetterChoice);
            System.out.println("wrong " +  wrongLetterChoice);
        }
          /*  System.out.println("Great! That letter is in the random word");
            rightLetterChoice.add(UserInput.ULetterChoice);
            System.out.println("right " + rightLetterChoice);


*/






        }
}




//public static String randomWord(){
    //String guessWord = words();
//}
//public static ArrayList<Character> guessedLetter(){


//}

