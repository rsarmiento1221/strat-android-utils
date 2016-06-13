package com.stratpoint.guavasample;

import com.stratpoint.guavasample.basic.BasicNullUsage;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by raymondsarmiento on 6/13/16.
 */
public class BasicNullUsageTest {
    private BasicNullUsage basicNullUsage;

    @Before
    public void before() {
        basicNullUsage = mock(BasicNullUsage.class);
    }

    @Test
    public void checkNullValue() throws Exception {

    }

    @After
    public void after() {
        basicNullUsage = null;
    }
}
