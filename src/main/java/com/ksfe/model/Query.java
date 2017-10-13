package com.ksfe.model;

/**
 * This is a Java Bean based class,used to hold the DB Details of KSFE
 *
 * @author RNarendran
 * @since 1.0,
 */

public class Query {
	
	private Integer queryID;
	private Integer questionnaireID;
	private String queryDescription;
	private Integer branchID;
	private String queryStatus;
	public Integer getQueryID() {
		return queryID;
	}
	public void setQueryID(Integer queryID) {
		this.queryID = queryID;
	}
	public Integer getQuestionnaireID() {
		return questionnaireID;
	}
	public void setQuestionnaireID(Integer questionnaireID) {
		this.questionnaireID = questionnaireID;
	}
	public String getQueryDescription() {
		return queryDescription;
	}
	public void setQueryDescription(String queryDescription) {
		this.queryDescription = queryDescription;
	}
	public Integer getBranchID() {
		return branchID;
	}
	public void setBranchID(Integer branchID) {
		this.branchID = branchID;
	}
	public String getQueryStatus() {
		return queryStatus;
	}
	public void setQueryStatus(String queryStatus) {
		this.queryStatus = queryStatus;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Query [queryID=" + queryID + ", questionnaireID=" + questionnaireID + ", queryDescription="
				+ queryDescription + ", branchID=" + branchID + ", queryStatus=" + queryStatus + "]";
	}
	
	

}
