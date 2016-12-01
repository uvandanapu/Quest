package com.quest.questDiagnosticsEJB.service;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author uday
 *
 */

@Service
public class MyListener implements MessageListener, MessageDrivenBean {

	private static final Logger logger = LoggerFactory.getLogger(MyListener.class);

	@Autowired
	private PatientRecordsInserterService patientRecordsInserterService;
	
		 private MessageDrivenContext context = null;
		 private Context jndiContext = null;

		 public void ejbCreate () throws CreateException {}
		 public void ejbRemove() {}

		 public void setMessageDrivenContext(MessageDrivenContext ctxt)
		 {
		  context = ctxt;
		  try
		  {
		   jndiContext = new InitialContext();
		  }
		  catch(NamingException ne)
		  {
		   throw new EJBException(ne);
		  }
		 }
	
	
	@Override
	public void onMessage(Message msg) {
		TextMessage message = (TextMessage) msg;
		try {
			logger.info("message received: " + message.getText());
			
			patientRecordsInserterService.splitString(message.getText());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
