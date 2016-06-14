package com.stratpoint.guavasample.basic;

import com.stratpoint.guavasample.basic.BasicNullUsage;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by raymondsarmiento on 6/13/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BasicNullUsageTest {
    @Spy private BasicNullUsage basicNullUsage;

    @Test
    public void check_optional_isNotNull() throws Exception {
        basicNullUsage.addValue(5);
        assertTrue(basicNullUsage.allValueAreNotNull());
    }
}
