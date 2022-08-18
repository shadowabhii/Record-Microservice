package com.record.microservice.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.microservice.model.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	
	//Dummy list of records
	
	List<Record> list = List.of(
			new Record(1L,"TataMotors@email.com","Tata Motors",1313L),
			new Record(2L,"Tcs@email.com","TCS",1313L),
			new Record(3L,"Cts@email.com","COGNIZANT",1314L),
			new Record(4L,"Lti@email.com","LTI",1314L),
			new Record(5L,"TechMahindras@email.com","Tech Mahindra",1315L),
			new Record(6L,"infy@email.com","infosys",1316L),
			new Record(7L,"mindt@email.com","Mind Tree",1316L),
			new Record(8L,"merben@email.com","Mercedes Benz",1317L),
			new Record(7L,"suzu@email.com","suzuki",1318L),
			new Record(8L,"aulto@email.com","Aulto Car",1319L)
			);

	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		
		
		
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
