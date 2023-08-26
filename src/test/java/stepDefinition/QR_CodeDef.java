package stepDefinition;

import static org.testng.Assert.assertTrue;

import config.Drivers;
import io.cucumber.java.en.*;
import pages.QR_CodePage;

public class QR_CodeDef extends Drivers {
	
	
	QR_CodePage qrPage;
	@When("Click on pay user")
	public void click_on_pay_user() throws Exception {
	    qrPage=new QR_CodePage(d);
	    qrPage.lnkPayUser.click();
	    Thread.sleep(3000);
	}
	@When("Click on receive qr code")
	public void click_on_receive_qr_code() throws Exception {
	    qrPage.lnkReceiveCode.click();
	    Thread.sleep(3000);
	}
	@When("Enter amount {string}")
	public void enter_amount(String string) {
	    qrPage.enterAmount(string);
	}
	@When("Click on generate qr button")
	public void click_on_generate_qr_button() throws Exception {
	    qrPage.btnQRCode.click();
	    Thread.sleep(3000);
	}
	@Then("verify QR code")
	public void verify_qr_code() throws Exception {
	    assertTrue(qrPage.QRCode.isDisplayed());
	    Thread.sleep(3000);
	}


}
