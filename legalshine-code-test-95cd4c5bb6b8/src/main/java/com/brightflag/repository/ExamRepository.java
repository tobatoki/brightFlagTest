package com.brightflag.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Exam;


@Repository
public class ExamRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Exam> getExams() {
		// TODO Auto-generated method stub
		/*returns exam ID and  exam name from exam table in the DB*/
		return jdbcTemplate.query("SELECT examID, examName FROM exam;",
				new BeanPropertyRowMapper<Exam>(Exam.class));
	}

	public int assignExamToStudent(int exam, int student) {
		// TODO Auto-generated method stub
		/*Insert new row in studentExams table containing a new exam assigned to a student*/
		return jdbcTemplate.update("INSERT INTO studentExams VALUES(null, ?, ?);",exam, student);
	}

}
