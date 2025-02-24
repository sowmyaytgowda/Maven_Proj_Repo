package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qsp.genericutility.BaseClass;
import com.qsp.objrctrepository.Homepage;

public class TC_002_Test extends BaseClass {
	@Test
	public void computerLink()
	{
		ExtentTest test = extreport.createTest("clickOnComputer");
	    hp=new Homepage(driver);
	    hp.getComputerLink().click();
	    
	    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
