package com.stratpoint.guavasample.basic;

import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
public class BasicObjectUtilitiesUsage {

    public boolean guavaEquals(String a, String b) {
        return Objects.equal(a, b);
    }

    public int guavaHashCode(Object a, Object b) {
        return Objects.hashCode(a, b);
    }

    public String guavaToString(String a, String b) {
        return MoreObjects.toStringHelper("BasicObjectUtilitiesUsage")
                            .add(a, b)
                            .toString();
    }
}
