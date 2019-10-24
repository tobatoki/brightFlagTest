package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Subject;
import com.brightflag.service.SubjectService;

@RestController
public class SubjectAPIController {

	@Autowired
	SubjectService subjectService;

	@RequestMapping("api/getSubjects")
	public List<Subject> getSubjects(){
		return subjectService.getSubjects();
	}

	/*Adds a subject to the current list of subjects*/
	@RequestMapping("api/updateSubjects")
	public int updateSubjects(@RequestParam("subject") String subject) {
		return subjectService.updateSubjects(subject);
	}

	/*Assigns a subject to a student. Can assign more than one*/
	@RequestMapping("api/assignSubjectToStudent")
	public int assignSubjectToStudent(
			@RequestParam("subjectID") int subject,
			@RequestParam("studentID") int student){
		return subjectService.assignSubjectToStudent(subject, student);
			}


}
