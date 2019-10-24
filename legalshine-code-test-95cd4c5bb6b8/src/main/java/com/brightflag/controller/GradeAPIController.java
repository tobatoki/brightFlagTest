package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Grade;
import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.service.GradeService;
import com.brightflag.service.StudentService;

@RestController
public class GradeAPIController {

	@Autowired
	GradeService gradeService;

	@RequestMapping("api/getGrades")
	public List<Grade> getGrades() {
		return gradeService.getGrades();
	}

	/*Assigns grade to a student for specific exams*/
	@RequestMapping("api/assignGrade")
	public int assignGrade(
			@RequestParam("studentID") int student,
			@RequestParam("examID") int exam,
			@RequestParam("grade") int studentGrade) {
		return gradeService.assignGrade(student, exam, studentGrade);
	}


}
