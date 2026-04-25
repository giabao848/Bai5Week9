package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    private MathUtils math;
    @BeforeEach
    void setUp(){
        math = new MathUtils();
    }
    @Test
    void test(){
        assertEquals(11, math.add(5,6));
    }
}
