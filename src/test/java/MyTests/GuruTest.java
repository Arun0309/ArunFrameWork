package MyTests;

import org.testng.annotations.Test;

public class GuruTest extends BaseTest  {
	//kannaiah
	@Test
	
	void Login() {
	//	LP.Login();
		LP2.LoginDetails();
		
	}

	@Test(priority=1)
	
	void Newcustomer() {
		NC.Newcustomer();
		
		
	}
	
	
	}
