package net.javaguides.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.model.PointsTable;
import net.javaguides.springboot.service.PointsTableService;

@Controller
public class PointsTableController {

	@Autowired
	PointsTableService pointsTableService;
	
	@GetMapping("/pointstable")
	public String getTimetable(Model model) {
		List<PointsTable> pointsTableObjectArray = pointsTableService.getAllTimeTable();
		model.addAttribute("pointsTableObjectArray",pointsTableObjectArray);
		return "pointstable";
	}
}
