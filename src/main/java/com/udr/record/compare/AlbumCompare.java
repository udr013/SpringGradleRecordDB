package com.udr.record.compare;

import java.io.Serializable;
import java.util.Comparator;

import com.udr.record.domain.Record;

public class AlbumCompare implements Comparator<Record>, Serializable {
	
	// created number to not get into troubles with different Serialized class versions (not so exciting this)
	private static final long serialVersionUID = -6163265655567121439L;

		@Override
        public int compare(Record one, Record two) {
            return one.getAlbum().compareTo(two.getAlbum());
        }
    }
