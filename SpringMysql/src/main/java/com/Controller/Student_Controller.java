package com.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student_Model;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class Student_Controller {
	

//	@GetMapping("/tutorials")
	  @PostMapping("api/students")
			public void saveStudent(@RequestBody Student_Model student) {
	          System.out.println(student);
			
		    
		    }

}
