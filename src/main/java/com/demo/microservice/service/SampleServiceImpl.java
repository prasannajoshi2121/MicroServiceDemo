package com.demo.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.microservice.dao.BaseDAO;
import com.demo.microservice.model.SampleModel;

@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	BaseDAO baseDAO;	
	SampleModel model;
	public SampleModel getModel() {
		return model;
	}

	public void setModel(SampleModel model) {
		this.model = model;
	}

	public SampleServiceImpl() {
		
		}
	
	@Override
	public List<SampleModel> getAllSampleData() {
	
		return (List<SampleModel>) baseDAO.findAll();
	}
	
	@Override
	public SampleModel getSampleData(int  id){
		
		return baseDAO.findOne(id);
	}

	@Override
	public void addSampleData(SampleModel sampleData) {
		if(sampleData!=null){
			//sampleModelList.add(sampleData);
		}
	}
	

}
