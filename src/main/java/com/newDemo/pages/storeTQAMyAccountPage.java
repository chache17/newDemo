package com.newDemo.pages;
import com.newDemo.util.PropertyLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mike on 5/21/16.
 */
public class storeTQAMyAccountPage extends Page{

    public storeTQAMyAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/accessories/']")
    @CacheLookup
    private WebElement accessories;

    @FindBy(css = "a.account_icon")
    @CacheLookup
    private WebElement accountmyAccount;

    @FindBy(css = "#menu-item-72 a")
    @CacheLookup
    private WebElement allProduct;

    @FindBy(css = "a[title='Apple iPod touch 32GB 5th Generation - Black']")
    @CacheLookup
    private WebElement appleIpodTouch32gb5th;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIpodTouch32gb5thGeneration;

    @FindBy(id = "user_login_submit")
    @CacheLookup
    private WebElement getPassword;

    @FindBy(css = "a[title='Checkout our Google Plus Profile']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "#menu-item-15 a")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/imacs/']")
    @CacheLookup
    private WebElement imacs;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipads/']")
    @CacheLookup
    private WebElement ipads;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/iphones/']")
    @CacheLookup
    private WebElement iphones;

    @FindBy(css = "a[title='iPod Nano Blue']")
    @CacheLookup
    private WebElement ipodNanoBlue1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement ipodNanoBlue2;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipods/']")
    @CacheLookup
    private WebElement ipods;

    @FindBy(css = "a.cart_icon")
    @CacheLookup
    private WebElement itemCartcheckout0;

    @FindBy(css = "a[href='http://store.demoqa.com/tools-qa/']")
    @CacheLookup
    private WebElement logIn;

    @FindBy(id = "login")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/macbooks/']")
    @CacheLookup
    private WebElement macbooks;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails2;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails3;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(3)")
    @CacheLookup
    private WebElement moreDetails4;

    private final String pageLoadedText = "Please use the form below to login to your account";

    private final String pageUrl = "/products-page/your-account/";

    @FindBy(id = "pwd")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "a[title='Follow our Pins']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(css = "#menu-item-33 a")
    @CacheLookup
    private WebElement productCategory;

    @FindBy(css = "a[href='http://store.demoqa.com/tools-qa/?action=register']")
    @CacheLookup
    private WebElement register;

    @FindBy(id = "rememberme")
    @CacheLookup
    private WebElement rememberMe;

    @FindBy(css = "a[title='Get Fed on our Feeds']")
    @CacheLookup
    private WebElement rss;

    @FindBy(css = "a[href='http://store.demoqa.com/sample-page/']")
    @CacheLookup
    private WebElement samplePage;

    @FindBy(css = "a[title='Sennheiser RS 120']")
    @CacheLookup
    private WebElement sennheiserRs1201;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sennheiserRs1202;

    @FindBy(css = "a[title='Skullcandy PLYR 1 - Black']")
    @CacheLookup
    private WebElement skullcandyPlyr1Black1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement skullcandyPlyr1Black2;

    @FindBy(css = "#menu-item-53 a")
    @CacheLookup
    private WebElement spHome;

    @FindBy(id = "log")
    @CacheLookup
    private WebElement username;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement usernameOrEmail1;

    @FindBy(id = "user_login")
    @CacheLookup
    private WebElement usernameOrEmail2;

    @FindBy(css = "#menu-item-55 a")
    @CacheLookup
    private WebElement yourAccount;

    public storeTQAMyAccountPage clickAccessoriesLink() {
        accessories.click();
        return this;
    }

    public storeTQAMyAccountPage clickAccountmyAccountLink() {
        accountmyAccount.click();
        return this;
    }

    public storeTQAMyAccountPage clickAllProductLink() {
        allProduct.click();
        return this;
    }

    public storeTQAMyAccountPage clickAppleIpodTouch32gb5thGenerationLink() {
        appleIpodTouch32gb5thGeneration.click();
        return this;
    }

    public storeTQAMyAccountPage clickAppleIpodTouch32gb5thLink() {
        appleIpodTouch32gb5th.click();
        return this;
    }

    public storeTQAMyAccountPage clickGetPasswordButton() {
        getPassword.click();
        return this;
    }

    public storeTQAMyAccountPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    public storeTQAMyAccountPage clickHomeLink() {
        home.click();
        return this;
    }

    public storeTQAMyAccountPage clickImacsLink() {
        imacs.click();
        return this;
    }

    public storeTQAMyAccountPage clickIpadsLink() {
        ipads.click();
        return this;
    }

    public storeTQAMyAccountPage clickIphonesLink() {
        iphones.click();
        return this;
    }

    public storeTQAMyAccountPage clickIpodNanoBlue1Link() {
        ipodNanoBlue1.click();
        return this;
    }

    public storeTQAMyAccountPage clickIpodNanoBlue2Link() {
        ipodNanoBlue2.click();
        return this;
    }

    public storeTQAMyAccountPage clickIpodsLink() {
        ipods.click();
        return this;
    }

    public storeTQAMyAccountPage clickItemCartcheckoutLink0() {
        itemCartcheckout0.click();
        return this;
    }

    public storeTQAMyAccountPage clickLogInLink() {
        logIn.click();
        return this;
    }

    public storeTQAMyAccountPage clickLoginButton() {
        login.click();
        return this;
    }

    public storeTQAMyAccountPage clickMacbooksLink() {
        macbooks.click();
        return this;
    }

    public storeTQAMyAccountPage clickMoreDetails1Link() {
        moreDetails1.click();
        return this;
    }

    public storeTQAMyAccountPage clickMoreDetails2Link() {
        moreDetails2.click();
        return this;
    }

    public storeTQAMyAccountPage clickMoreDetails3Link() {
        moreDetails3.click();
        return this;
    }

    public storeTQAMyAccountPage clickMoreDetails4Link() {
        moreDetails4.click();
        return this;
    }

    public storeTQAMyAccountPage clickPinterestLink() {
        pinterest.click();
        return this;
    }

    public storeTQAMyAccountPage clickProductCategoryLink() {
        productCategory.click();
        return this;
    }

    public storeTQAMyAccountPage clickRegisterLink() {
        register.click();
        return this;
    }

    public storeTQAMyAccountPage clickRssLink() {
        rss.click();
        return this;
    }

    public storeTQAMyAccountPage clickSamplePageLink() {
        samplePage.click();
        return this;
    }

    public storeTQAMyAccountPage clickSennheiserRs1201Link() {
        sennheiserRs1201.click();
        return this;
    }

    public storeTQAMyAccountPage clickSennheiserRs1202Link() {
        sennheiserRs1202.click();
        return this;
    }

    public storeTQAMyAccountPage clickSkullcandyPlyr1Black1Link() {
        skullcandyPlyr1Black1.click();
        return this;
    }

    public storeTQAMyAccountPage clickSkullcandyPlyr1Black2Link() {
        skullcandyPlyr1Black2.click();
        return this;
    }

    public storeTQAMyAccountPage clickSpHomeLink() {
        spHome.click();
        return this;
    }

    public storeTQAMyAccountPage clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    public storeTQAMyAccountPage fillAndSubmit() {
        fill();
        return submit();
    }

    public void fill() {
    }

    public storeTQAMyAccountPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    public storeTQAMyAccountPage setRememberMeCheckboxField() {
        if (!rememberMe.isSelected()) {
            rememberMe.click();
        }
        return this;
    }

    public storeTQAMyAccountPage setUsernameOrEmail1TextField(String usernameOrEmail1Value) {
        usernameOrEmail1.sendKeys(usernameOrEmail1Value);
        return this;
    }

    public storeTQAMyAccountPage setUsernameOrEmail2TextField(String usernameOrEmail2Value) {
        usernameOrEmail2.sendKeys(usernameOrEmail2Value);
        return this;
    }

    public storeTQAMyAccountPage setUsernameTextField(String usernameValue) {
        username.sendKeys(usernameValue);
        return this;
    }

    public storeTQAMyAccountPage submit() {
        clickGetPasswordButton();
        return this;
    }

    public storeTQAMyAccountPage unsetRememberMeCheckboxField() {
        if (rememberMe.isSelected()) {
            rememberMe.click();
        }
        return this;
    }

    public storeTQAMyAccountPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    public storeTQAMyAccountPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

    public void fillRegisterForm(String username, String useremail, String captcha){
        clickRegisterLink();
        usernameOrEmail2.sendKeys(PropertyLoader.loadProperty(username));
        driver.findElement(By.id("user_email")).sendKeys(PropertyLoader.loadProperty(useremail));
        driver.findElement(By.id("aiowps-captcha-answer")).sendKeys(PropertyLoader.loadProperty(captcha));
        driver.findElement(By.id("wp-submit")).click();
    }
}
