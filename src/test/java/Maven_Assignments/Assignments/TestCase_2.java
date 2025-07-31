package Maven_Assignments.Assignments;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCase_2 extends _Launch_Quit {
	

@Test
	
	public void SearchingProduct() throws IOException
	{
	        Amazon_HomePage hp = new Amazon_HomePage(driver);
		    hp.HoverOverOnAccounts_Lists(driver);
		    hp.SignInButton();
		    
		    Amazon_DDT ddt = new Amazon_DDT();
		    ddt.AmazonLoginData();  
		    
		   Amazon_LoginPage lp = new Amazon_LoginPage(driver);
		   lp.valid_username();
		   lp.Continue_Button();
		   lp.valid_password();
		   lp.submit_buton();
		   
		   hp.SearchProduct();
		   hp.HoverOverOnAccounts_Lists(driver);
		   hp.SignOutButton();
		 
		

}}
