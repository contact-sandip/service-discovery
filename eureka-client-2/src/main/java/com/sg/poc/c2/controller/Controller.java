package com.sg.poc.c2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.poc.c2.pojo.Student;
import com.sg.poc.c2.service.ClientTwoService;
import com.sg.poc.commonutility.errorhandling.model.CustomDataException;
import com.sg.poc.commonutility.errorhandling.model.CustomInternalException;

@RequestMapping("/v1/client2")
@RestController
public class Controller {
	
	@Autowired
	ClientTwoService clientTwoService;
	
	
	@GetMapping(path = "/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId") long studentId) throws CustomDataException, CustomInternalException {
		try {
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(this.clientTwoService.getStudentById(studentId));
		} catch (Exception e) {
			throw new CustomInternalException("C1-210102", "Failed to process your request", e);
		}
		
	}

}
