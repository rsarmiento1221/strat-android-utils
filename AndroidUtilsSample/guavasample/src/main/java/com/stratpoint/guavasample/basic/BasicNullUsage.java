package com.stratpoint.guavasample.basic;

import com.google.common.base.Optional;
import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raymondsarmiento on 6/13/16.
 */
public class BasicNullUsage {
    private List<Optional> values = new ArrayList<>();

    public BasicNullUsage() { }

    public void addValue(Integer value) {
        values.add(Optional.fromNullable(value));
    }

    public boolean allValueAreNotNull() {

        for (Optional value : values) {
            if (!value.isPresent()) {
                return false;
            }
        }

        return true;
    }
}
