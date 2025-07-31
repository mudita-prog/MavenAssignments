package Maven_Assignments.Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_LoginPage extends Amazon_DDT {

	WebDriver driver;
	
	@FindBy (xpath = "//input[@name='email']")
	WebElement Username_field;
	
	@FindBy (xpath="//input[@class='a-button-input']")
	WebElement Continue_Button;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement Password_Field;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	WebElement Submit;
	
	public void valid_username()
	{
		Username_field.click();
		Username_field.sendKeys(ValidUsername);
	}
	
	public void valid_un()
	{
		Username_field.click();
		Username_field.sendKeys(ValidUn);
	}
	
	public void Continue_Button()
	{
		Continue_Button.click();
	}
	
	public void Invalid_username()
	{
		Username_field.click();
		Username_field.sendKeys(InvalidUserName);
	}
	
	public void valid_password()
	{
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));  
	    wait.until(ExpectedConditions.visibilityOf(Password_Field));
	    Password_Field.click();
	    Password_Field.sendKeys(ValidPassword);
	}
	
	public void valid_pw()
	{
		Password_Field.click();
		Password_Field.sendKeys(ValidPw);
	}
	public void Invalid_password()
	{
		Password_Field.click();
		Password_Field.sendKeys(InvalidPassword);
	}
	
	public void submit_buton()
	{
		Submit.click();
	}
	
	public Amazon_LoginPage(WebDriver driver) 
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

}
