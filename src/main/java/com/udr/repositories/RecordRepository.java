package com.udr.repositories;

import com.udr.models.Record;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by udr013 on 23-4-2016.
 * define a Spring Data JPA repository, simply extend The JPA CrudRepository and asign the domain class and it's ID parameter
 */
public interface RecordRepository extends CrudRepository<Record,Integer > {
}
