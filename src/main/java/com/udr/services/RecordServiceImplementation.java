package com.udr.services;


import com.udr.models.Record;
import com.udr.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class RecordServiceImplementation implements RecordServiceInterface {

	@Autowired
	public void setRecordRepository(RecordRepository recordRepository) {
		this.recordRepository = recordRepository;
	}

	protected RecordRepository recordRepository;



	@Override
	public Record saveRecord(Record record) {

		return recordRepository.save(record);
	}

	@Override
	public Boolean deleteRecord(Integer id) {

		Record temp = recordRepository.findOne(id);
		if(temp!=null){
			 recordRepository.delete(temp);
			 return true;
		}
		return false;
	}

	@Override
	public Record editRecord(Record record) {

		return recordRepository.save(record);
	}

	@Override
	public Record findRecord(Integer id) {

		return recordRepository.findOne(id);
	}



	@Override
	public Collection<Record> getAllRecords() {
		Iterable<Record> itr = recordRepository.findAll();
		return (Collection<Record>)itr;
	}


}
