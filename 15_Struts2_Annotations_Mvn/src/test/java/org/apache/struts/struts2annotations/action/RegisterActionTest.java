package org.apache.struts.struts2annotations.action;

import org.apache.log4j.Logger;
import org.apache.struts.struts2annotations.model.Person;
import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionProxy;




public class RegisterActionTest extends StrutsTestCase {
	
	private static final Logger logger = Logger.getLogger( RegisterActionTest.class.getCanonicalName() ) ;

	public void testInput() throws Exception {
		
		logger.debug ("In RegisterActionTest method testInput.");
		
		ActionProxy proxy = getActionProxy("/register-input.action");
        assertNotNull(proxy);
        
        //proxy.setExecuteResult(false);
        
        String result = proxy.execute();
        
        assertEquals("Result of calling RegisterAction input method is not input but it should be.", "input", result);
        
        logger.debug("Result of calling RegisterAction input method is " + result);
		
		
	}

	public void testExecute() throws Exception {
	
		
		logger.debug ("In RegisterActionTest method testExecute.");
		
		 //set parameters before calling getActionProxy
        request.setParameter("personBean.firstName", "Bruce");
        request.setParameter("personBean.lastName", "Phillips");
        request.setParameter("personBean.email", "Bruce@email.com");
        request.setParameter("personBean.age", "30");

		
		ActionProxy proxy = getActionProxy("/register.action");
        assertNotNull(proxy);
        
        RegisterAction action = (RegisterAction) proxy.getAction();
        assertNotNull(action);
        
        proxy.setExecuteResult(false);
        
        String result = proxy.execute();
        
        assertEquals("Result of calling RegisterAction execute method is not success but it should be.", "success", result);
        
        logger.debug("Result of calling RegisterAction execute method is " + result);
        
        Person person = action.getPersonBean() ;
        
        assertEquals("Person object available from RegisterAction does not have a first name of Bruce but should.", "Bruce", person.getFirstName() );
        
        logger.debug("Person object available from RegisterAction is  " + person);
		
		
	}

}
