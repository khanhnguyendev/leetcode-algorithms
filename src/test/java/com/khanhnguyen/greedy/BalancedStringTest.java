package com.khanhnguyen.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nguyen K. Ngo
 * @since 29-Sep-2024
 */
class BalancedStringTest {
    
    @Test
    public void testExample1() {
        int A = 5;
        int B = 3;
        String result = BalancedString.solution(A, B);
        assertFalse(result.contains("aaa"));
        assertFalse(result.contains("bbb"));
        assertEquals(8, result.length());
    }

    @Test
    public void testExample2() {
        int A = 3;
        int B = 3;
        String result = BalancedString.solution(A, B);
        assertFalse(result.contains("aaa"));
        assertFalse(result.contains("bbb"));
        assertEquals(6, result.length());
    }

    @Test
    public void testExample3() {
        int A = 1;
        int B = 4;
        String result = BalancedString.solution(A, B);
        assertFalse(result.contains("aaa"));
        assertFalse(result.contains("bbb"));
        assertEquals(5, result.length());
    }

    @Test
    public void testEdgeCase1() {
        int A = 0;
        int B = 2;
        String result = BalancedString.solution(A, B);
        assertEquals("bb", result);
    }

    @Test
    public void testEdgeCase2() {
        int A = 2;
        int B = 0;
        String result = BalancedString.solution(A, B);
        assertEquals("aa", result);
    }

    @Test
    public void testEdgeCase3() {
        int A = 0;
        int B = 0;
        String result = BalancedString.solution(A, B);
        assertEquals("", result);
    }
}