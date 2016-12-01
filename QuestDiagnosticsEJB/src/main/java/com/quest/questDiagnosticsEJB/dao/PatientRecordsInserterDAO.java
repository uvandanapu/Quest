package com.quest.questDiagnosticsEJB.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.quest.questDiagnosticsEJB.model.PatientDetails;


@Repository
public class PatientRecordsInserterDAO {

	private static final Logger logger = LoggerFactory.getLogger(PatientRecordsInserterDAO.class);

	@PersistenceContext
	  private EntityManager entityManager;
	
	
	public void saveDetails(PatientDetails patientDetails) {
		// TODO Auto-generated method stub
		
		
		logger.info("DAO LAYER :" +patientDetails.getlName());
		
		entityManager.persist(patientDetails);
	}
	
}
