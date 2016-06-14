package com.stratpoint.guavasample.basic;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Spy;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BasicPreconditionsUsageTest {
    @Spy  private BasicPreconditionsUsage basicPreconditionsUsage;

    @Test
    public void checkArgument() throws Exception {
        int a = 1;
        int b = 2;

        assertTrue(basicPreconditionsUsage.guavaCheckArgument(a == b));
    }

    @Test
    public void checkNotNull() throws Exception {
        Object o = new Object();

        assertTrue(basicPreconditionsUsage.guavaCheckNotNull(o));
    }

    @Test
    public void checkState() throws Exception {
        ArrayList<String> arr = spy(ArrayList.class);
        arr.add("a");
        assertTrue(basicPreconditionsUsage.guavaCheckState(arr.iterator().hasNext()));
    }

    @Test
    public void checkElementIndex() throws Exception {
        ArrayList<String> arr = spy(ArrayList.class);
        arr.add("a");
        assertTrue(basicPreconditionsUsage.guavaCheckElementIndex(0, arr.size()));
    }

    @Test
    public void checkPositionIndex() throws Exception {
        ArrayList<String> arr = spy(ArrayList.class);
        arr.add("a");
        assertTrue(basicPreconditionsUsage.guavaCheckPositionIndex(1, arr.size()));
    }

    @Test
    public void checkPositionIndexes() throws Exception {
        ArrayList<String> arr = spy(ArrayList.class);
        arr.add("a");
        arr.add("b");
        assertTrue(basicPreconditionsUsage.guavaCheckPositionIndexes(1, 2, arr.size()));
    }
}
