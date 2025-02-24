package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qsp.genericutility.BaseClass;
import com.qsp.genericutility.ListenerUtility;
import com.qsp.objrctrepository.Homepage;



@Listeners(ListenerUtility.class)
public class TC_001_Test extends BaseClass {
	
@Test
public void clickOnBooks() {
	
	hp=new Homepage(driver);
	hp.getBookslink().click();
	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","books page is not displayed");
	test.log(Status.PASS, "Books page is displayed");
	
}
}
