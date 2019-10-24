package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Subject;
import com.brightflag.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	SubjectRepository subjectRepository;

	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return subjectRepository.getSubjects();
	}

	public int updateSubjects(String subject) {
		// TODO Auto-generated method stub
		return subjectRepository.updateSubjects(subject);
	}

	public int assignSubjectToStudent(int subject, int student) {
		// TODO Auto-generated method stub
		return subjectRepository.assignSubjectToStudent(subject, student);
	}
	

}
