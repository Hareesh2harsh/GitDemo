package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QR_CodePage {
	
	@FindBy(xpath="//a/div[2]") public WebElement lnkPayUser;
	@FindBy(linkText="Receive QR-code") public WebElement lnkReceiveCode;
	@FindBy(xpath="//input") public WebElement tfAmount;
	@FindBy(xpath="//span[contains(.,'Generate QR code')]") public WebElement btnQRCode;
	@FindBy(xpath="//receive-qr-payment-step-pending/div/img") public WebElement QRCode;
	
	public QR_CodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterAmount(String amt)
	{
		tfAmount.sendKeys(amt);
	}

}
