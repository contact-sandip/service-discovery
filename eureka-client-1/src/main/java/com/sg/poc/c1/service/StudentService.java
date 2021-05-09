package com.sg.poc.c1.service;

import org.springframework.stereotype.Service;

import com.sg.poc.c1.pojo.Student;
import com.sg.poc.commonutility.errorhandling.model.CustomDataException;
import com.sg.poc.commonutility.errorhandling.model.CustomInternalException;

@Service
public interface StudentService {

	Student getStudentById(long studentId) throws CustomDataException, CustomInternalException;
}
