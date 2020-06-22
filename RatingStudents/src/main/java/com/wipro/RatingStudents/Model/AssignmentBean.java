package com.wipro.RatingStudents.Model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Assignments")
public class AssignmentBean {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SerialNo")
	private int serialNo;
	
	@Column(name="StudentName")
	private String studentName;
	
	@Column(name="Subject")
	private String subject;
	
	@Column(name="AssignmentCategory")
	private String assignmentCategory;
	
	@Column(name="DateOfSubmission")
	private LocalDate dos;
	
	@Column(name="Points")
	private int points;

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignmentCategory() {
		return assignmentCategory;
	}

	public void setAssignmentCategory(String assignmentCategory) {
		this.assignmentCategory = assignmentCategory;
	}

	public LocalDate getDos() {
		return dos;
	}

	public void setDos(LocalDate dos) {
		this.dos = dos;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "AssignmentsBean [serialNo=" + serialNo + ", studentName=" + studentName + ", subject=" + subject
				+ ", assignmentCategory=" + assignmentCategory + ", dos=" + dos + ", points=" + points + "]";
	}
	
	

}
