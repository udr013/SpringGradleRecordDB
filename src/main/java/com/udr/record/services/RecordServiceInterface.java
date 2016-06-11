package com.udr.record.services;

import java.util.Collection;

import com.udr.record.domain.Record;

public interface RecordServiceInterface {

	public Record saveRecord(Record record);
	public Boolean deleteRecord(Integer id);
	public Record editRecord(Record record);
	public Record findRecord(Integer id);
	public Collection<Record> getAllRecords();
	public Collection<Record> getAllRecordsByIdusers(int id);
	public Collection<Record> findByArtistAndIdusers(String name, int id);
}