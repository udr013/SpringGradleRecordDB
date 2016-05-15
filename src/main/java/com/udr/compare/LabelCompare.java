package com.udr.compare;

import com.udr.models.Record;

import java.util.Comparator;

public class LabelCompare implements Comparator<Record> {
                @Override
                public int compare(Record one, Record two) {
                    return one.getLabel().compareTo(two.getLabel());
                }
           }
