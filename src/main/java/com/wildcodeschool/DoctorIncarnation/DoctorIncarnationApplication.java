package com.wildcodeschool.DoctorIncarnation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class DoctorIncarnationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorIncarnationApplication.class, args);
	}
	
	
	@RequestMapping("/doctor/{id}")
	@ResponseBody
	public String getdoctor(@PathVariable int id) {
		
		
	    if(id == 9) {
	    	return "{\"number\": 9, \"name\": \"Christopher Eccleston\"}";
	    }
	    if(id == 10) {
	    	return "{\"number\": 10, \"name\": \"David Tennant\"}";
	    }
	    if(id == 11) {
	    	return "{\"number\": 11, \"name\": \"Matt Smith\"}";
	    }
	    if(id == 12) {
	    	return "{\"number\": 12, \"name\": \"Peter Capaldi\"}";
	    }
	    if(id == 13) {
	    	return "{\"number\": 13, \"name\": \"Jodie Whittaker\"}";
	    }
	    if(id < 9 && id > 0) {
	    	throw new ResponseStatusException(HttpStatus.SEE_OTHER);
	    
	    }	
	else {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrieve the incarnation <incarnation number>");
	    }
	}
}
