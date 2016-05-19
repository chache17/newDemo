package newDemo.pages;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mike on 1/31/16.
 */


public class newTest extends TestBase {


	@Before
	public void testInit() {
		webDriver.get(websiteUrl);
		//homepage = PageFactory.initElements(webDriver, MercuryHomePage.class);
	}

	@Test
	public void testH1Existing() throws Exception {
		//Assert.fail();
	}
}
