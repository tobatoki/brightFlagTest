package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Exam;
import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> getStudents() {
		return jdbcTemplate.query("SELECT studentID, firstName, lastName FROM student;",
				new BeanPropertyRowMapper<Student>(Student.class));
	}
	

	public List<Subject> getStudentsSubjects(int student) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT studsubj.subjectID as subjectID, subjnam.subjectName as subjectName FROM studentSubjects as studsubj, subject as subjnam WHERE studsubj.studentID="+ student +" AND studsubj.subjectID = subjnam.subjectID",
						new BeanPropertyRowMapper<Subject>(Subject.class));
	}

	public List<Exam> getStudentsExams(int student) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT studex.examID as examID, "
				+ "exanam.examName as examName "
				+ "FROM studentExams as studex, "
				+ "exam as exanam "
				+ "where studex.studentID="+ student +""
				+ " and"
				+ " studex.examID = exanam.examID",
						new BeanPropertyRowMapper<Exam>(Exam.class));
	}
	

}
