package com.newDemo.features.steps;

/**
 * Created by miguel.coca on 5/19/2016.
 */

import com.newDemo.pages.storeTQAHomePage;
import com.newDemo.tests.TestBase;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @Given("^Im in the ToolsQA Home Page$")
    public void im_in_the_ToolsQA_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I type in \"([^\"]*)\" in the Search Box$")
    public void i_type_in_in_the_Search_Box(String arg1) throws Throwable {
        storeHomePage.search(arg1);
    }

    @When("^I press Enter Key$")
    public void i_press_Enter_Key() throws Throwable {
        storeHomePage.search("");
    }

    @Then("^I Should see the result page$")
    public void i_Should_see_the_result_page() throws Throwable {
        Assert.assertTrue(storeHomePage.productPageNotEmpty());
    }

    @Given("^Im in the results page for \"([^\"]*)\"$")
    public void im_in_the_results_page_for(String arg1) throws Throwable {
        webDriver.get(websiteUrl);
        storeHomePage.search(arg1);
    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String arg1) throws Throwable {
        storeHomePage.clickLink(arg1);
    }

    @Then("^I should see the \"([^\"]*)\" product detail page$")
    public void i_should_see_the_product_detail_page(String arg1) throws Throwable {
        Assert.assertTrue(storeHomePage.existsDetailsPageFor(arg1));
    }

    @Given("^I Im in the ToolsQA Home Page$")
    public void i_Im_in_the_ToolsQA_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I hover on the Product category Button$")
    public void i_hover_on_the_Product_category_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a dropdown menu with the next categories$")
    public void i_should_see_a_dropdown_menu_with_the_next_categories(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }
}
