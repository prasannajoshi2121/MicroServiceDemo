package com.demo.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.model.SampleModel;
import com.demo.microservice.service.SampleService;


@RestController
public class HomeController {
	
	@Autowired
	SampleService sampleService;	
	
	@RequestMapping("/")
	public String home()
	{
		return "Spring boooooooooot is working ";
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SampleModel getSampleData(@RequestParam("id") int id){
		System.out.println("inside controller ->getAll data ->calling getAllData");
		return sampleService.getSampleData(id);
	}
	
	@RequestMapping(value="/readAll", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<SampleModel> getAllData(){
			System.out.println("inside controller ->getAll data ->calling getAllData");
			return sampleService.getAllSampleData();
	}
	
	
}
