package giftCards;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qsp.genericutility.BaseClass;
import com.qsp.objrctrepository.Homepage;

public class TC_004_Test extends BaseClass {
@Test
public void loginToGifts () {
	ExtentTest test = extreport.createTest("clickOnGifts");
	hp=new Homepage(driver);
	hp.getGiftlink().click();
	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards","gift page not displayed");
	test.log(Status.PASS, "gift page displayed");
}
}
