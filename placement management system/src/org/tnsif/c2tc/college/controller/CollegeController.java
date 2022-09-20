package org.tnsif.c2tc.College.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.tnsif.c2tc.College.Controller.springboot.model.College;
import org.tnsif.c2tc.College.Controller springboot.repository.CollegeRepository;

@RestController
@RequestMapping("/api/v1/")
public class CollegeController<CollegeRespository> {

	@Autowired
	private CollegeRepository CollegeRepository;
	
	//get all college
	@GetMapping("/College")
	public List<College> getAllCollege(){
		return CollegeRepository.findAll();
	}	
}

