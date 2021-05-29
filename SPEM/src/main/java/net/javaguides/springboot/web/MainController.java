package net.javaguides.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.model.TimeTable;
import net.javaguides.springboot.service.TimeTableService;

@Controller
public class MainController {
	
	@Autowired
	private TimeTableService timeTableService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/timetable")
	public String getTimetable(Model model) {
		List<TimeTable> timeTableObjectArray = timeTableService.getTimetable();
		model.addAttribute("timeTableObjectArray",timeTableObjectArray);
		return "timetable";
	}
}
