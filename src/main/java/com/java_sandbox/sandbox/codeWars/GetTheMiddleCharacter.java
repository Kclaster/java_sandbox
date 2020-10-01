package com.java_sandbox.sandbox.codeWars;

public class GetTheMiddleCharacter {
   /* You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

            Kata.getMiddle("test") should return "es"

            Kata.getMiddle("testing") should return "t"

            Kata.getMiddle("middle") should return "dd"

            Kata.getMiddle("A") should return "A"
    */

    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;

        if (length % 2 == 0) {

            s = word.substring(half - 1, half + 1);

        } else {

            s = word.substring(half, half + 1);

        }

        return s;
    }
}
