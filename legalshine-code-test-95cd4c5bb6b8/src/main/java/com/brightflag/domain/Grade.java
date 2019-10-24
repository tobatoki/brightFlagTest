package com.brightflag.domain;

public class Grade {

	private Integer examID, studentGrade, studentID;
	private String examName, firstName, lastName;

	public Integer getExamID() {
		return examID;
	}

	public void setExamID(Integer examID) {
		this.examID = examID;
	}
	
	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}
	
	
	public Integer getGrade() {
		return studentGrade;
	}

	public void setGrade(Integer studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	@Override
	public String toString() {
		return "Grade [firstName=" + firstName + ", lastName=" + lastName + ", examID=" + examID + ", examName=" + examName + ", studentID=" + studentID + ", grade=" + studentGrade + "]";
	}

}

