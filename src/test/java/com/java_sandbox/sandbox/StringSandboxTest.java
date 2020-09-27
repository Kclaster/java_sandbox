package com.java_sandbox.sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSandboxTest {
    @Test
    void shouldReverseString() {
        var initialString = "hakuna matata";
        var expectedResult = "atatam anukah";

        assertEquals(expectedResult, StringSandbox.reverseString(initialString));
        assertEquals(expectedResult, StringSandbox.reverseString2(initialString));
    }

    @Test
    public void shouldReverseKeepSpace(){
        assertEquals("srawedoc",StringSandbox.reverseKeepSpace("codewars"));
        assertEquals("edoc ruoy",StringSandbox.reverseKeepSpace("your code"));
        assertEquals("skco redo cruoy",StringSandbox.reverseKeepSpace("your code rocks"));
    }

    @Test
    void shouldCountLettersInString() {
        var initialString = "hello";
        var expectedResult = "e1h1l2";

        assertEquals(expectedResult, StringSandbox.StringCount(initialString));
    }

    @Test
    void shouldCountComplexLettersInString() {
        var initialString = "hakuna matATa";
        var expectedResult = "a5h1k1m1n1u1t2";

        assertEquals(expectedResult, StringSandbox.StringCount(initialString));
    }
}
