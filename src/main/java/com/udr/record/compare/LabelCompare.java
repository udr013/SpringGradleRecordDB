package com.udr.record.compare;

import java.io.Serializable;
import java.util.Comparator;

import com.udr.record.domain.Record;

public class LabelCompare implements Comparator<Record>, Serializable {
                @Override
                public int compare(Record one, Record two) {
                    return one.getLabel().compareTo(two.getLabel());
                }
           }
