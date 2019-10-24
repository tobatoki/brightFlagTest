package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Exam;
import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.repository.ExamRepository;

@Service
public class ExamService {
	
	@Autowired
	ExamRepository examRepository;

	public List<Exam> getExams() {
		// TODO Auto-generated method stub
		return examRepository.getExams();
	}

	public int assignExamToStudent(int exam, int student) {
		// TODO Auto-generated method stub
		return examRepository.assignExamToStudent(exam, student);
	}

}