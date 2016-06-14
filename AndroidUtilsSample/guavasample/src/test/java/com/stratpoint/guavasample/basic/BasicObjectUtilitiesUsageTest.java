package com.stratpoint.guavasample.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

import static org.junit.Assert.*;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BasicObjectUtilitiesUsageTest {
    @Spy private BasicObjectUtilitiesUsage basicObjectUtilitiesUsage;

    @Test
    public void objects_isEqual() throws Exception {
        String a = "a";
        String b = "a";

        assertTrue(basicObjectUtilitiesUsage.guavaEquals(a, b));
    }

    @Test
    public void objects_hash_isNotEqualToZero() throws Exception {
        String a = "a";
        String b = "b";

        assertNotEquals(0, basicObjectUtilitiesUsage.guavaHashCode(a, b));
    }

    @Test
    public void objects_toString_isEqual() throws Exception {
        String a = "a";
        String b = "b";

        assertEquals("BasicObjectUtilitiesUsage{a=b}", basicObjectUtilitiesUsage.guavaToString(a, b));
    }
}
