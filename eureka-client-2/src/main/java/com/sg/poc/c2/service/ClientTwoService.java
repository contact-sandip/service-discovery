package com.sg.poc.c2.service;

import org.springframework.stereotype.Service;

import com.sg.poc.c2.pojo.Student;
import com.sg.poc.commonutility.errorhandling.model.CustomInternalException;

@Service
public interface ClientTwoService {

	Student getStudentById(long studentId) throws CustomInternalException;
}
