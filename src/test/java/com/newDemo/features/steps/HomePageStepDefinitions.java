package com.newDemo.features.steps;

/**
 * Created by miguel.coca on 5/19/2016.
 */

import com.newDemo.tests.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import newDemo.pages.storeTQAHomePage;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePageStepDefinitions extends TestBase{

    storeTQAHomePage storeHomePage;

    @After
    public void AfterScenario(){
        webDriver.close();
    }

    public HomePageStepDefinitions(){
        init();
        storeHomePage = PageFactory.initElements(webDriver, storeTQAHomePage.class);
    }

    @Given("^I'm in the ToolsQA Home Page$")
    public void i_m_in_the_ToolsQA_Home_Page() throws Throwable {
        webDriver.get(websiteUrl);
    }

    @When("^I click on  \"([^\"]*)\" link$")
    public void i_click_on_link(String arg1) throws Throwable {
        storeHomePage.clickAccountmyAccountLink();
    }

    @Then("^I should see \"([^\"]*)\" tittled form page$")
    public void i_should_see_tittled_form_page(String arg1) throws Throwable {
        Assert.assertTrue(webDriver.findElement(By.className("entry-title")).getText().equals(arg1));
    }
}
