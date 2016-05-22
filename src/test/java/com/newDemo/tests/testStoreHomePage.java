package com.newDemo.tests;

import com.newDemo.pages.storeTQAHomePage;
import jdk.nashorn.internal.runtime.ECMAException;
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

	@Test
	public void testWireframeFooterSection() throws Exception{
		Assert.assertTrue((storeHomePage.footerblogTitle("Latest Blog Post:")));
	}

	@Test
	public  void testWireFrameBrowsing() throws Exception{
		Assert.assertTrue(storeHomePage.wireframeBrowse());
	}

	@Test
	public void testNoResultMessage() throws Exception{
		Assert.assertFalse(storeHomePage.search("noposibleresult"));
	}

	@Test
	public void testSearchResult() throws Exception{
		Assert.assertTrue(storeHomePage.search("iphone"));
	}

	@Test
	public void testRegisterNegative() throws Exception{
		Assert.assertFalse(storeHomePage.register());
	}
}
