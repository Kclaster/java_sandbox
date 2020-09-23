package com.java_sandbox.sandbox;

public class FizzBuzz {
    private FizzBuzz() {}
    public static void doFizzBuzzFirstAttempt() {
        for (var x = 1; x<=100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("fizzBuz");
            }
            else if (x % 3 == 0) {
                System.out.println("fizz");
            }
            else if (x % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(x);
            }
        }
    }

    public static void doFizzBuzzSecondAttempt() {
        for (var x = 1; x<=100; x++) {
            if (x % 15 == 0) {
                System.out.println("fizzBuz");
            }
            else if (x % 3 == 0) {
                System.out.println("fizz");
            }
            else if (x % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(x);
            }
        }
    }

}
