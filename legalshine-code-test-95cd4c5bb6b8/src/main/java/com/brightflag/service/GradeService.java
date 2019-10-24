package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Grade;
import com.brightflag.repository.GradeRepository;

@Service
public class GradeService {
	
	@Autowired
	GradeRepository gradeRepository;

	public List<Grade> getGrades() {
		// TODO Auto-generated method stub
		return gradeRepository.getGrades();
	}

	public int assignGrade(int student, int exam, int studentGrade) {
		// TODO Auto-generated method stub
		return gradeRepository.assignGrade(student, exam, studentGrade);
	}

}

