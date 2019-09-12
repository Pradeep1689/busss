package Script;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Generic_libraries.Generic_ReadFrmExecl;
import Generic_libraries.Generic_Test;
import Pom.Inbox;
import Pom.gmail;
import Pom.home;

public class GmailLogin extends Generic_Test{
	
	
	@Test 
	public void testLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException  
	{
		String mail = Generic_ReadFrmExecl.getCellValue("Sheet1", 0, 0);
		String pass = Generic_ReadFrmExecl.getCellValue("Sheet1", 0, 1);
		
	

	gmail g1=new gmail(driver);
	g1.email(mail);
	Thread.sleep(5000);
	g1.next();
	
	Thread.sleep(3000);
	
	home g2=new home(driver);
	g2.password(pass);
	Thread.sleep(3000);
	g2.next1();
	
	Thread.sleep(10000);
	
	Inbox i=new Inbox(driver);
	i.compose();
	Thread.sleep(5000);
	i.to("rashmip2890@gmail.com");
	Thread.sleep(5000);
	i.sub("hi");
	Thread.sleep(5000);
	i.send();
	
		
	}

}
