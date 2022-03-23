package com.careerdevs;

import java.util.ArrayList;

public class WordGuess {
    ArrayList<Character> userLetterSelection = new ArrayList<>();
    public static void letterGuess(){
        Word.getRandomWord();

        //for(int i = 0 ; i < Word.wordList.get(Word.index).size(); i++ )
     // String numOfuGuesses = Word.wordList.size(Word.index);
        System.out.println(Word.wordList.get(Word.index));

    }

}
