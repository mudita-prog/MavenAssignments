package Maven_Assignments.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList_Page {

	WebDriver driver;
	
	@FindBy (xpath="(//a[@data-csa-c-action='pab:list_c_wl_lv_ov_lig_pab_add-to-cart'])[1]")
	WebElement AddToCart;
	
	public void Add_To_Cart()
	{
		AddToCart.click();
	}
	
	
	
	public WishList_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
