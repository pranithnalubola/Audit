package net.javaguides.springboot.h2.model;

public class Details {
 private Long id;
 private String projectName;
 private String projectManager;
 private String applicationOwner;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getProjectManager() {
	return projectManager;
}
public void setProjectManager(String projectManager) {
	this.projectManager = projectManager;
}
public String getApplicationOwner() {
	return applicationOwner;
}
public void setApplicationOwner(String applicationOwner) {
	this.applicationOwner = applicationOwner;
}
}
