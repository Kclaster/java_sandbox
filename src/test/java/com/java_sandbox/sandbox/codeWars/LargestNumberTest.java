package com.java_sandbox.sandbox.codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {
    // solve("gh12cdy695m1") = 695
    @Test
    void largestNumberTest() {
        assertEquals(695, LargestNumber.getLargestNumber("gh12cdy695m1"));
        assertEquals(85, LargestNumber.getLargestNumber("lu1j8qbbb85"));
    }
}
