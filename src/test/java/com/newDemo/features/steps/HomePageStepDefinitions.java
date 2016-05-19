package com.newDemo.features.steps;

/**
 * Created by miguel.coca on 5/19/2016.
 */

import com.newDemo.tests.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import newDemo.pages.storeTQAHomePage;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

public class HomePageStepDefinitions extends TestBase implements En{

    storeTQAHomePage storeHomePage;

    @Before
    public void testInit() {
        storeHomePage = PageFactory.initElements(webDriver, storeTQAHomePage.class);
    }

    public HomePageStepDefinitions(){

        Given("^I'm in the ToolsQA Home Page$", () -> {
            webDriver.get(websiteUrl);
        });

        When("^I click on  \"([^\"]*)\" link$", (String arg1) -> {
            if(arg1.equals("My Account")) {
                storeHomePage.clickAccountmyAccountLink();
            }
        });

        Then("^I should see \"([^\"]*)\" tittled form page$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

    }
}
