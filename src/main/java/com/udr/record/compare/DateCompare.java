package com.udr.record.compare;

import java.io.Serializable;
import java.util.Comparator;

import com.udr.record.domain.Record;

public class DateCompare implements Comparator<Record>, Serializable {
            @Override
            public int compare(Record one, Record two) {
                return one.getdate_of_release().compareTo(two.getdate_of_release());
            }
        }
