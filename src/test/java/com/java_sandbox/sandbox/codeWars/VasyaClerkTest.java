package com.java_sandbox.sandbox.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VasyaClerkTest {
    @Test
    public void shouldReverseKeepSpace(){
        assertEquals("NO", VasyaClerk.shouldFillAllOrders(new int []{25, 100}));
        assertEquals("YES", VasyaClerk.shouldFillAllOrders(new int []{25, 25, 50}));
        assertEquals("NO", VasyaClerk.shouldFillAllOrders(new int[] {25, 25, 50, 50, 100})); // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)

    }
}
