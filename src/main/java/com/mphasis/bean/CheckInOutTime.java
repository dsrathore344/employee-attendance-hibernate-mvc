package com.mphasis.bean;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="checkinouttime")
public class CheckInOutTime {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="empId", length=7, nullable=false)
	private int empId;
	
	@Column(name="date", length=10, nullable=false)
	private String date;
	
	@Column(name="inTime",length=10, nullable=true)
	private String inTime;
	
	@Column(name="outTime", length=8, nullable=true)
	private String outTime;
	
	public CheckInOutTime() {}

	public CheckInOutTime(int empId, String date, String inTime, String outTime) {
		super();
		this.empId = empId;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "CheckInOutTime [id=" + id + ", empId=" + empId + ", date=" + date + ", inTime=" + inTime + ", outTime="
				+ outTime + "]";
	}
	
	
}
