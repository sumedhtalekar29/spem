package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.PointsTable;
import net.javaguides.springboot.repository.PointsTableRepository;

@Service
public class PointsTableServiceImpl implements PointsTableService{

	@Autowired
	PointsTableRepository pointsTablerepository;
	
	@Override
	public List<PointsTable> getAllTimeTable() {
		List<PointsTable> pointsTableList = pointsTablerepository.findAll();
		return pointsTableList;
	}

}
