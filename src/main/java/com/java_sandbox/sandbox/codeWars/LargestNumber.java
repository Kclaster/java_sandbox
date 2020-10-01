package com.java_sandbox.sandbox.codeWars;

public class LargestNumber {
    /*
    In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number groupings and return the largest number.

For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.

Good luck!
     */

    public static Integer getLargestNumber(String initialString) {
        var stringAsBytes = initialString.getBytes();
        var highestNumber = 0;
        var currentNumberStringBuilder = new StringBuilder("0");

        for (var letter : stringAsBytes) {
            try {
                // Test if number
                Integer.parseInt(String.valueOf((char) letter));

                currentNumberStringBuilder.append(String.valueOf((char) letter));
                var currentNumber = Integer.parseInt(currentNumberStringBuilder.toString());
                if (currentNumber > highestNumber) {
                    highestNumber = currentNumber;
                }
            } catch (NumberFormatException e) {
                var currentNumber = Integer.parseInt(currentNumberStringBuilder.toString());
                if (currentNumber > highestNumber) {
                    highestNumber = currentNumber;
                }
                currentNumberStringBuilder = new StringBuilder("0");
            }

        }

        return highestNumber;
    };
}
