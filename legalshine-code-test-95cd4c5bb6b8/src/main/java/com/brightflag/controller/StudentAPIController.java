package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Subject;
import com.brightflag.domain.Exam;
import com.brightflag.domain.Student;
import com.brightflag.service.StudentService;

@RestController
public class StudentAPIController {

	@Autowired
	StudentService studentService;

	@RequestMapping("api/getStudents")
	public List<Student> getStudents() {
		// TODO populate students subjects list
		return studentService.getStudents();
	}
	
	/*Displays list of subjects for a particular student*/	
	@RequestMapping("api/getStudentsSubjects")
	public List<Subject> getStudentsSubjects(
			@RequestParam("studentID") int student){
		return studentService.getStudentsSubjects(student);
	}
	
	/*Displays list of exams for a particular student*/	
	@RequestMapping("api/getStudentsExams")
	public List<Exam> getStudentsExams(
			@RequestParam("studentID") int student){
		return studentService.getStudentsExams(student);
	}

}
