package com.java_sandbox.sandbox.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversStringKeepSpaceTest {
    @Test
    public void shouldReverseKeepSpace(){
        assertEquals("srawedoc", ReverseStringKeepSpace.reverseKeepSpace("codewars"));
        assertEquals("edoc ruoy", ReverseStringKeepSpace.reverseKeepSpace("your code"));
        assertEquals("skco redo cruoy",ReverseStringKeepSpace.reverseKeepSpace("your code rocks"));
    }
}
