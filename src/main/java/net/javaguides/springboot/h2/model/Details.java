package net.javaguides.springboot.h2.model;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String projectName;
	private String managerName;
	private String applicationName;
	private String answerOne;
	private String answerTwo;
	private String answerThree;
	private String status;
	private String answerFour;
	private String answerFive;
	private String action;
	public String getAnswerOne() {
		return answerOne;
	}public String getAnswerThree() {
		return answerThree;
	}public String getAnswerTwo() {
		return answerTwo;
	}public void setAnswerOne(String answerOne) {
		this.answerOne = answerOne;
	}public void setAnswerTwo(String answerTwo) {
		this.answerTwo = answerTwo;
	}public void setAnswerThree(String answerThree) {
		this.answerThree = answerThree;
	}public String getApplicationName() {
		return applicationName;
	}public String getManagerName() {
		return managerName;
	}public String getProjectName() {
		return projectName;
	}public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}public void setManagerName(String managerName) {
		this.managerName = managerName;
	}public void setProjectName(String projectName) {
		this.projectName = projectName;
	}public String getStatus() {
		return status;
	}public void setStatus(String status) {
		this.status = status;
	}public String getAnswerFour() {
		return answerFour;
	}public String getAnswerFive() {
		return answerFive;
	}public void setAnswerFive(String answerFive) {
		this.answerFive = answerFive;
	}public void setAnswerFour(String answerFour) {
		this.answerFour = answerFour;
	}public String getAction() {
		return action;
	}public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return answerOne+" "+answerTwo+" "+answerThree+" "+projectName+" "+managerName+" "+applicationName;
	}
}
