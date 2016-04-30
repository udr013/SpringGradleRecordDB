package com.udr.services;

import com.udr.models.Record;

import java.util.Collection;

public interface RecordServiceInterface {

	public Record saveRecord(Record record);
	public Boolean deleteRecord(Integer id);
	public Record editRecord(Record record);
	public Record findRecord(Integer id);
	public Collection<Record> getAllRecords();
}