package com.java_sandbox.sandbox;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StringSandbox {
    public static String reverseString(String initialString) {
        byte[] strAsByte = initialString.getBytes();
        byte[] result = new byte[initialString.length()];

        for (var x = 0; x < initialString.length(); x++) {
            result[x] = strAsByte[strAsByte.length - x - 1];
        }

        return new String(result);
    }

    public static String reverseString2(String initialString) {
        var result = new StringBuilder();

        result.append(initialString);
        result.reverse();

        return result.toString();
    }

    /*
        In this Kata, we are going to reverse a string while maintaining the spaces (if any) in their original place.

        For example:

        solve("our code") = "edo cruo"
        -- Normal reversal without spaces is "edocruo".
        -- However, there is a space at index 3, so the string becomes "edo cruo"

        solve("your code rocks") = "skco redo cruoy".
        solve("codewars") = "srawedoc"
        More examples in the test cases. All input will be lower case letters and in some cases spaces.
     */
    public static String reverseKeepSpace(String initialString) {
        var filteredResult = initialString.replaceAll(" ", "");
        var resultStringBuilder = new StringBuilder(filteredResult).reverse();
        var initialStringAsByte = initialString.getBytes();

        for (var x = 0; x < initialString.length(); x++) {
            if (initialStringAsByte[x] == (byte) ' ') {
                resultStringBuilder.insert(x, ' ');
            }
        }

        return resultStringBuilder.toString();
    }

    // Given a string, if one letter makes it a palindrome return true else false
    public static void PanagramTest (String initialString) {
        var splitString = initialString.split("");
        var alphabet = "abcdefghijklmnopqrstuvwxyz";
        var listAlpha = new LinkedList<String>(Arrays.asList(alphabet.split("")));

        for (var character : splitString) {
            character = character.toLowerCase();
            if (listAlpha.contains(character)) {
                var alphaLocation = listAlpha.indexOf(character);
                listAlpha.remove(alphaLocation);
            }
        }

        if (listAlpha.size() > 0) {
            listAlpha.forEach(System.out::println);
        } else {
            System.out.println("null");
        }
    }

    public static String StringCount(String initialString) {
        var response = new StringBuilder();
        var stringArr = initialString.split("");
        var stringList = Arrays.asList(stringArr);
        var sortedStringList = stringList.stream().map(letter -> letter.toLowerCase()).filter(letter -> !letter.equals(" ")).sorted().collect(Collectors.toList());

        var currentLetter = "";
        var currentCount = 1;
        for (var x = 0; x <= sortedStringList.size() - 1; x++) {
            if (sortedStringList.get(x)
                    .equalsIgnoreCase(currentLetter)
            ) {
                currentCount++;
                if (x == sortedStringList.size() - 1) {
                    response.append(sortedStringList.get(x))
                            .append(currentCount);
                }

            } else {
                if (x == sortedStringList.size() - 1) {
                    response.append(sortedStringList.get(x))
                            .append(1);
                }
                if (!currentLetter.equals("")) {
                    response.append(currentLetter.toLowerCase())
                            .append(currentCount);
                }
                currentCount = 1;
                currentLetter = sortedStringList.get(x);
            }
        }

        return response.toString();
    }
}
