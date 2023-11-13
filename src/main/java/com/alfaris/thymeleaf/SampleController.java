package com.alfaris.thymeleaf;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@Controller
@RestController
@RequestMapping
public class SampleController {

	
	@GetMapping("/")
	String getDet() throws IOException {
		
		
		return "Hello";
	}
	
	@GetMapping("/date")
	String getDete() throws IOException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date =  new Date();
		String dateStr = format.format(date);
		return dateStr;
	}
	@GetMapping("/name")
	String getName() {
		
		return "Musk";
	}

}
