package com.drools.example;

public class Job {

	String jobName;
	String jobType;
	String jobLocation;
	String jobDateTime;
	long jobCost;
	String jobOwner;
	String jobStatus;
	
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getJobDateTime() {
		return jobDateTime;
	}
	public void setJobDateTime(String jobDateTime) {
		this.jobDateTime = jobDateTime;
	}
	public long getJobCost() {
		return jobCost;
	}
	public void setJobCost(long jobCost) {
		this.jobCost = jobCost;
	}
	public String getJobOwner() {
		return jobOwner;
	}
	public void setJobOwner(String jobOwner) {
		this.jobOwner = jobOwner;
	}

	@Override
	public String toString()
	{
		return "Serialzed Job: " + this.jobName;
	}

}