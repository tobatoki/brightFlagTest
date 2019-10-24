package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Subject;

@Repository
public class SubjectRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Subject> getSubjects() {
		return jdbcTemplate.query("SELECT subjectID, subjectName FROM subject;",
				new BeanPropertyRowMapper<Subject>(Subject.class));
	}

	public int updateSubjects(String subject) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO subject VALUES(null, ?);", subject);
	}

	public int assignSubjectToStudent(int subject, int student) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO studentSubjects VALUES(null, ?, ?);",
			    subject, student);
	}

}
