package com.udr.compare;

import com.udr.models.Record;

import java.io.Serializable;
import java.util.Comparator;

public class ArtistCompare implements Comparator<Record>, Serializable {
    @Override
    public int compare(Record one, Record two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
