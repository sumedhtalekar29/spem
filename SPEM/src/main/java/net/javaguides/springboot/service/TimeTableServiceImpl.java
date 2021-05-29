package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.TimeTable;
import net.javaguides.springboot.repository.TimeTableRepository;

@Service
public class TimeTableServiceImpl implements TimeTableService{

	@Autowired
	TimeTableRepository timeTableRepository;
	
	@Override
	public List<TimeTable> getTimetable() {
		List<TimeTable> timeTableList = timeTableRepository.findAll();
		return timeTableList;
	}

}
