package kr.co.project3.pages.alarm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thresholdController {
	
	@RequestMapping(value="threshold_check")
	public String thresholdChecking() {
		
		return "alarm/threshold_check.tiles";
	}

}
