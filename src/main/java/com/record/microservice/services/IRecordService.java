package com.record.microservice.services;

import java.util.List;

import com.record.microservice.model.Record;

public interface IRecordService {
	
	public List<Record> getRecordOfEmployee(Long eId);

}
