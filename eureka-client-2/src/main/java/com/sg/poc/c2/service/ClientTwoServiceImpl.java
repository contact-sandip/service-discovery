package com.sg.poc.c2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sg.poc.c2.client.ClientOne;
import com.sg.poc.c2.pojo.Student;
import com.sg.poc.commonutility.errorhandling.model.CustomInternalException;

@Component
public class ClientTwoServiceImpl implements ClientTwoService {
	
	@Autowired
	ClientOne clientOne;

	@Override
	public Student getStudentById(long studentId) throws CustomInternalException {
		try {
			Student student =  this.clientOne.getStudentById(studentId);
			return student;
		} catch (Exception e) {
			throw new CustomInternalException("", "", e);
		}
	}

}
