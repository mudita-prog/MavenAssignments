package Maven_Assignments.Assignments;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCase_5 extends _Launch_Quit {

	@Test
	
	public void AddtoRemoveFromwishlist() throws IOException
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
	   
	   Product_Page pg = new Product_Page(driver);
       pg.Select_Product();
       
       pg.Wishlist();
       
       WishList_Page wl = new WishList_Page(driver);
       wl.Add_To_Cart();
    	
       hp.Cart_Button();
       
       ShoppingCart_Page sp = new ShoppingCart_Page(driver);
       sp.Delete_Button();
       
       hp.LogOut();
       

}
}
