package newDemo.Tests;

import newDemo.pages.storeTQAHomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mike on 1/31/16.
 */


public class testStoreHomePage extends TestBase {

	storeTQAHomePage storeHomePage;

	@Before
	public void testInit() {
		webDriver.get(websiteUrl);
		storeHomePage = PageFactory.initElements(webDriver, storeTQAHomePage.class);
	}

	@Test
	public void testOnlineStorePageTitle() throws Exception {
		Assert.assertTrue( storeHomePage.getTitle().equals("ONLINE STORE | Toolsqa Dummy Test site"));
	}
}
