package com.newDemo.pages;

import com.newDemo.util.PropertyLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mike on 1/31/16.
 */

public abstract class Page {

	int timeout = 15;
	protected WebDriver driver;
	protected boolean DEBUG;
	protected WebDriverWait wait;

	public Page(WebDriver webDriver) {
		this.driver = webDriver;

		wait = new WebDriverWait(this.driver,timeout);

		if(PropertyLoader.loadProperty("site.DEBUG").equals("true")){
			DEBUG = true;
		}
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void println(String message){
		if(DEBUG){
			System.out.println(message);
		}
	}
}
