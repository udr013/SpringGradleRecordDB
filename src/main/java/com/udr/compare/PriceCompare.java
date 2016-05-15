package com.udr.compare;

import com.udr.models.Record;

import java.util.Comparator;

/**
 * Created by udr013 on 4-5-2016.
 */
public class PriceCompare implements Comparator<Record> {
    @Override
    public int compare(Record one, Record two) {
        if ((one.getPrice() <= two.getPrice())) {
            return -1;
        } else if (one.getPrice() == two.getPrice()) {
            return 0;
        }else{
        return 1;}
    }
}