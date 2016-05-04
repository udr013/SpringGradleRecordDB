package com.udr.services;

import com.udr.models.Record;

import java.util.Comparator;

public class FormatCompare implements Comparator<Record> {
    @Override
    public int compare(Record one, Record two) {
        return one.getFormat().compareTo(two.getFormat());
    }
}
