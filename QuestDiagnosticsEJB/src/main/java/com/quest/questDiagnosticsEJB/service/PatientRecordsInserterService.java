package com.quest.questDiagnosticsEJB.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quest.questDiagnosticsEJB.dao.PatientRecordsInserterDAO;
import com.quest.questDiagnosticsEJB.model.PatientDetails;


@Service
public class PatientRecordsInserterService {

	@Autowired
	PatientRecordsInserterDAO patientRecordsInserterDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(PatientRecordsInserterService.class);

	
	@Transactional
	public void splitString(String text) throws ParseException {
		// TODO Auto-generated method stub
		
		PatientDetails patientDetails = new PatientDetails();
		
		
		String msg = new String(text);
		
		String splittedMsg[] = msg.split(":");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = dateFormat.parse(splittedMsg[4]); 
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		
		patientDetails.setfName(splittedMsg[0]);
		patientDetails.setlName(splittedMsg[1]);
		patientDetails.seteMail(splittedMsg[2]);
		patientDetails.setpNum(Integer.parseInt(splittedMsg[3]));
		patientDetails.setDob(sqlStartDate);
		
		logger.info("Service Layer");
		patientRecordsInserterDAO.saveDetails(patientDetails);
		
	}

	
	
}
