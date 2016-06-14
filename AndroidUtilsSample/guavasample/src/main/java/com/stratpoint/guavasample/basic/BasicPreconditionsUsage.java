package com.stratpoint.guavasample.basic;

import static com.google.common.base.Preconditions.*;

/**
 * Created by raymondsarmiento on 6/14/16.
 */
public class BasicPreconditionsUsage {

    public BasicPreconditionsUsage() { }

    public boolean guavaCheckArgument(boolean condition) {
        try {
            checkArgument(condition, "Condition failed!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean guavaCheckNotNull(Object o) {
        try {
            checkNotNull(o, "The object is null");
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean guavaCheckState(boolean state) {
        try {
            checkState(state);
            return true;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean guavaCheckElementIndex(int index, int size) {
        try {
            checkElementIndex(index, size);
            return true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean guavaCheckPositionIndex(int index, int size) {
        try {
            checkPositionIndex(index, size);
            return true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean guavaCheckPositionIndexes(int start, int end, int size) {
        try {
            checkPositionIndexes(start, end, size);
            return true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return false;
    }
}
