package com.udr.compare;

import com.udr.models.Record;

import java.io.Serializable;
import java.util.Comparator;

public class DateCompare implements Comparator<Record>, Serializable {
            @Override
            public int compare(Record one, Record two) {
                return one.getdate_of_release().compareTo(two.getdate_of_release());
            }
        }
