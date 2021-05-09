package com.sg.poc.c2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sg.poc.c2.pojo.Student;


@FeignClient("EUREKA-CLIENT-1")
public interface ClientOne {

	@GetMapping(path = "/v1/student/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudentById(@PathVariable("studentId") long studentId);
}
