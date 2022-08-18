package com.record.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.record.microservice.model.Record;
import com.record.microservice.services.IRecordService;

@RestController
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	private IRecordService recordService;
	
	@GetMapping("/emp/{eId}")
	public List<Record> getRecord(@PathVariable("eId") Long eId) {
		
		return this.recordService.getRecordOfEmployee(eId);
		
		
	}

}
