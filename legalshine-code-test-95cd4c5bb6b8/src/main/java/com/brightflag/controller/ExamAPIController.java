package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Exam;
import com.brightflag.service.ExamService;


@RestController
public class ExamAPIController {

	@Autowired
	ExamService examService;

	@RequestMapping("api/getExams")
	public List<Exam> getExams() {
		// TODO populate students subjects list
		return examService.getExams();
	}

	/*Assigns one or more exams to particular student*/
	@RequestMapping("api/assignExamToStudent")
	public int assignExamToStudent(
			@RequestParam("examID") int exam,
			@RequestParam("studentID") int student){
		return examService.assignExamToStudent(exam, student);
	}

}
