package com.quest.questDiagnosticsEJB.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class PatientDetails  {

	
	private String fName;
	private String lName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String eMail;
	private int pNum;
	private Date dob;

	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}

	/**
	 * @param eMail
	 *            the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @return the pNum
	 */
	public int getpNum() {
		return pNum;
	}

	/**
	 * @param pNum
	 *            the pNum to set
	 */
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	

	

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	
	public String toString(){
		return fName+":"+lName+":"+eMail+":"+pNum+":"+dob;
		
		
	}
}
