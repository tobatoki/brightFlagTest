package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Grade;

@Repository
public class GradeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Grade> getGrades() {
		// TODO Auto-generated method stub
		/*Selects grade from studentGrade table
		and student ID, first name, lastname from students table
		exam name and exam ID from exam table
		where the student IDs are the same between the student and studentGrades table
		and exam IDs are the same between the student and studentGrade table
		*/
		return jdbcTemplate.query("SELECT studgrad.studentGrade, stud.studentID, stud.firstName, stud.lastName, exanam.examName, exanam.examID
		FROM studentGrades AS studgrad,
		student AS stud,
		exam AS exanam
		WHERE stud.studentID = studgrad.studentID AND exanam.examID = studgrad.examID",
				new BeanPropertyRowMapper<Grade>(Grade.class));
	}

	public int assignGrade(int student, int exam, int studentGrade) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO studentGrades VALUES(?, ?, ?);", student, exam, studentGrade);
	}

}
