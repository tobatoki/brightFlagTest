package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Exam;
import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}

	public List<Subject> getStudentsSubjects(int student) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentsSubjects(student);
	}

	public List<Exam> getStudentsExams(int student) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentsExams(student);
	}

}
