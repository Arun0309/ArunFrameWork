package MyTests;

import org.testng.annotations.Test;

public class GuruTest extends BaseTest  {
	
	@Test
	
	void Login() {
	//LP.Login();
		LP2.LoginDetails(prop.getProperty("ID"),prop.getProperty("PW"));
		
	}

	@Test(priority=1)
	
	void Newcustomer() {
		//NC.Newcustomer();
		NC2.Newcustomertwo(prop.getProperty("Customername"),prop.getProperty("DOB"),prop.getProperty("Address"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("pin"),prop.getProperty("Mobilenumber"),prop.getProperty("Email"),prop.getProperty("password"));
		
		
	}
	
	
	}
