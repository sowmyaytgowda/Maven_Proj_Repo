package electronics;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qsp.genericutility.BaseClass;
import com.qsp.objrctrepository.Homepage;

public class TC_003_Test extends BaseClass {
@Test
public void clickOnElectronics() {
	ExtentTest test = extreport.createTest("ClickonElectronics");
	hp=new Homepage(driver);
	hp.getElectronicslink().click();
	
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronics page not displayed");
	test.log(Status.PASS, "Electronics page not displayed");
}
}
