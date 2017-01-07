package com.demo.microservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.microservice.model.SampleModel;



@Repository
@Transactional
public interface BaseDAO extends CrudRepository<SampleModel, Integer>
{
	//public <T> List<T> readAll(T t);
}
