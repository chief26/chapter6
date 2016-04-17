package com.example.shaunmesias.assignment6.ValueObjects;

import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class CellNumber implements Serializable {
    private final String value;

    public CellNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CellNumber)) return false;

        CellNumber that = (CellNumber) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
