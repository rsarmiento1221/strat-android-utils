package com.stratpoint.guavasample.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
public class BasicOrderingUsage {

    public BasicOrderingUsage() { }

    public List<String> guavaReverse(List<String> list) {
        ArrayList<String> arr = new ArrayList<>(list);
        Collections.sort(arr, Ordering.<String>natural().nullsLast().reverse());
        return arr;
    }
}
