package com.sol.pojo;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("employee")
public class Employee {
	private int id;
	private String realname;
	private Enum<SexEnum> sex;
	private Date birthday;
	private String mobile;
	private String position;
	private String note;
	private WorkCard workCard;
	private List<EmployeTask> TaskList;
	private HealthForm healthForm;
	
	public List<EmployeTask> getTaskList() {
		return TaskList;
	}
	public void setTaskList(List<EmployeTask> taskList) {
		TaskList = taskList;
	}
	public WorkCard getWorkCard() {
		return workCard;
	}
	public void setWorkCard(WorkCard workCard) {
		this.workCard = workCard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Enum<SexEnum> getSex() {
		return sex;
	}
	public void setSex(Enum <SexEnum> sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public HealthForm getHealthForm() {
		return healthForm;
	}
	public void setHealthForm(HealthForm healthForm) {
		this.healthForm = healthForm;
	}
	
	

}
