package com.udr.record.compare;

import java.io.Serializable;
import java.util.Comparator;

import com.udr.record.domain.Record;

/**
 * Created by udr013 on 4-5-2016.
 */
public class PriceCompare implements Comparator<Record> , Serializable {
    @Override
    public int compare(Record one, Record two) {
        return Double.compare(one.getPrice(), two.getPrice());
    }
}