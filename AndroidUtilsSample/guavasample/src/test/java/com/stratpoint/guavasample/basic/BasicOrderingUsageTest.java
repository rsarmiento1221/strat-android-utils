package com.stratpoint.guavasample.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Spy;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BasicOrderingUsageTest {
    @Spy private BasicOrderingUsage basicOrderingUsage;

    @Test
    public void ordering_isThat() throws Exception {
        ArrayList<String> arr = spy(ArrayList.class);
        arr.add("a");
        arr.add(null);
        arr.add("b");
        arr.add("c");

        assertThat(basicOrderingUsage.guavaReverse(arr).get(0), nullValue());
    }
}
