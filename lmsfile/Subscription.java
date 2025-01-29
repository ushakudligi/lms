package me.lms.bean;

import java.util.Date;

public class Subscription {

	private int id;
	private int studentId;
	private Date startDate;
	private Date endDate;
	private int penaltyAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(int penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

}
