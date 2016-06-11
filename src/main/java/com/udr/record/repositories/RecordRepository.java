package com.udr.record.repositories;

import org.springframework.data.repository.CrudRepository;

import com.udr.record.domain.Record;

import java.util.Collection;

/**
 * Created by udr013 on 23-4-2016.
 * define a Spring Data JPA repository, simply extend The JPA CrudRepository and asign the domain class and it's ID parameter
 */
public interface RecordRepository extends CrudRepository<Record,Integer > {


    Collection<Record> findByArtistContainingIgnoreCaseAndIdusers(String name, int id);
    public Collection<Record> getAllRecordsByIdusers(int id);
}