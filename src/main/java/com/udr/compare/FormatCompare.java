package com.udr.compare;

import com.udr.models.Record;

import java.io.Serializable;
import java.util.Comparator;

public class FormatCompare implements Comparator<Record> , Serializable {
    @Override
    public int compare(Record one, Record two) {
        return one.getFormat().compareTo(two.getFormat());
    }
}
