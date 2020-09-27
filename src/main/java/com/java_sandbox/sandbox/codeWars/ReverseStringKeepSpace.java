package com.java_sandbox.sandbox.codeWars;

public class ReverseStringKeepSpace {
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
}
