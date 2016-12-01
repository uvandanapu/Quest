package com.quest.questDiagnosticsEJB.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class PatientAddress {

	private String fLine;
	private String secondLine;
	
	
	/**
	 * @return the fLine
	 */
	public String getfLine() {
		return fLine;
	}

	/**
	 * @param fLine
	 *            the fLine to set
	 */
	public void setfLine(String fLine) {
		this.fLine = fLine;
	}

	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * @param secondLine
	 *            the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
}
