package com.sg.poc.c1.service;

import org.springframework.stereotype.Component;

import com.sg.poc.c1.pojo.Student;
import com.sg.poc.commonutility.errorhandling.model.CustomDataException;
import com.sg.poc.commonutility.errorhandling.model.CustomInternalException;

@Component
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentById(long studentId) throws CustomDataException, CustomInternalException {
		try {
			if(studentId > 50) {
				throw new CustomDataException("C1-210101", "Student not found", null);
			}
			Student student = new Student();
			student.setStudentId(studentId);
			student.setFirstName("FirstName"+studentId);
			student.setMidNamae("");
			student.setLastName("LastName"+studentId);
			student.setDept("ENGG");
			return student;
		} catch (CustomDataException e) {
			throw e;
		} catch (Exception e) {
			throw new CustomInternalException("C1-210102", "Failed to process your request", e);
		}
	}
	
	

}
