package com.newDemo.pages;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class storeTQAHomePage extends Page{
    private int timeout = 15;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement we1;

    @FindBy(css = "#slide_menu a:nth-of-type(2)")
    @CacheLookup
    private WebElement we2;

    @FindBy(css = "#slide_menu a:nth-of-type(3)")
    @CacheLookup
    private WebElement we3;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/accessories/']")
    @CacheLookup
    private WebElement accessories;

    @FindBy(css = "a.account_icon")
    @CacheLookup
    private WebElement accountmyAccount;

    @FindBy(css = "#menu-item-72 a")
    @CacheLookup
    private WebElement allProduct;

    @FindBy(css = "a[title='Apple 27 inch Thunderbolt Display ']")
    @CacheLookup
    private WebElement apple27InchThunderbolt;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement apple27InchThunderboltDisplay;

    @FindBy(css = "a[title='Apple iPad 6 32GB (White, 3D)']")
    @CacheLookup
    private WebElement appleIpad632gbWhite;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIpad632gbWhite3d;

    @FindBy(css = "a[title='Apple iPod touch Large']")
    @CacheLookup
    private WebElement appleIpodTouchLarge1;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement appleIpodTouchLarge2;

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow1;

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow2;

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(3) div.price a.buynow")
    @CacheLookup
    private WebElement buyNow3;

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

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement iphone5;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/iphones/']")
    @CacheLookup
    private WebElement iphones;

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement ipodNanoBlue;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/ipods/']")
    @CacheLookup
    private WebElement ipods;

    @FindBy(css = "a.cart_icon")
    @CacheLookup
    private WebElement itemCartcheckout0;

    @FindBy(css = "a[href='http://store.demoqa.com/products-page/product-category/macbooks/']")
    @CacheLookup
    private WebElement macbooks;

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement magicMouse;

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

    @FindBy(css = "#slides div:nth-of-type(1) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo1;

    @FindBy(css = "#slides div:nth-of-type(2) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo2;

    @FindBy(css = "#slides div:nth-of-type(3) div:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement moreInfo3;

    private final String pageLoadedText = "We put an amazing amount of care and detail into the design and functionality to ensure that we're creating the best user experience for your customers";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='Follow our Pins']")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(css = "#menu-item-33 a")
    @CacheLookup
    private WebElement productCategory;

    @FindBy(css = "a[title='Get Fed on our Feeds']")
    @CacheLookup
    private WebElement rss;

    @FindBy(css = "a[href='http://store.demoqa.com/sample-page/']")
    @CacheLookup
    private WebElement samplePage;

    @FindBy(css = "a[title='Sennheiser RS 120']")
    @CacheLookup
    private WebElement sennheiserRs1201;

    @FindBy(css = "#footer section:nth-of-type(2) ul.group li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement sennheiserRs1202;

    @FindBy(css = "#menu-item-53 a")
    @CacheLookup
    private WebElement spHome;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement splashingPixelsWordpressEcommerceThemesOffer;

    @FindBy(css = "#menu-item-55 a")
    @CacheLookup
    private WebElement yourAccount;

    public storeTQAHomePage(WebDriver driver) {
        super(driver);
    }

    public storeTQAHomePage clickAccessoriesLink() {
        accessories.click();
        return this;
    }

    public storeTQAHomePage clickAccountmyAccountLink() {
        accountmyAccount.click();
        return this;
    }

    public storeTQAHomePage clickAllProductLink() {
        allProduct.click();
        return this;
    }

    public storeTQAHomePage clickApple27InchThunderboltDisplayLink() {
        apple27InchThunderboltDisplay.click();
        return this;
    }

    public storeTQAHomePage clickApple27InchThunderboltLink() {
        apple27InchThunderbolt.click();
        return this;
    }

    public storeTQAHomePage clickAppleIpad632gbWhite3dLink() {
        appleIpad632gbWhite3d.click();
        return this;
    }

    public storeTQAHomePage clickAppleIpad632gbWhiteLink() {
        appleIpad632gbWhite.click();
        return this;
    }

    public storeTQAHomePage clickAppleIpodTouchLarge1Link() {
        appleIpodTouchLarge1.click();
        return this;
    }

    public storeTQAHomePage clickAppleIpodTouchLarge2Link() {
        appleIpodTouchLarge2.click();
        return this;
    }

    public storeTQAHomePage clickBuyNow1Link() {
        buyNow1.click();
        return this;
    }

    public storeTQAHomePage clickBuyNow2Link() {
        buyNow2.click();
        return this;
    }

    public storeTQAHomePage clickBuyNow3Link() {
        buyNow3.click();
        return this;
    }

    public storeTQAHomePage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    public storeTQAHomePage clickHomeLink() {
        home.click();
        return this;
    }

    public storeTQAHomePage clickImacsLink() {
        imacs.click();
        return this;
    }

    public storeTQAHomePage clickIpadsLink() {
        ipads.click();
        return this;
    }

    public storeTQAHomePage clickIphone5Link() {
        iphone5.click();
        return this;
    }

    public storeTQAHomePage clickIphonesLink() {
        iphones.click();
        return this;
    }

    public storeTQAHomePage clickIpodNanoBlueLink() {
        ipodNanoBlue.click();
        return this;
    }

    public storeTQAHomePage clickIpodsLink() {
        ipods.click();
        return this;
    }

    public storeTQAHomePage clickItemCartcheckoutLink0() {
        itemCartcheckout0.click();
        return this;
    }

    public storeTQAHomePage clickLink1() {
        we1.click();
        return this;
    }

    public storeTQAHomePage clickLink2() {
        we2.click();
        return this;
    }

    public storeTQAHomePage clickLink3() {
        we3.click();
        return this;
    }

    public storeTQAHomePage clickMacbooksLink() {
        macbooks.click();
        return this;
    }

    public storeTQAHomePage clickMagicMouseLink() {
        magicMouse.click();
        return this;
    }

    public storeTQAHomePage clickMoreDetails1Link() {
        moreDetails1.click();
        return this;
    }

    public storeTQAHomePage clickMoreDetails2Link() {
        moreDetails2.click();
        return this;
    }

    public storeTQAHomePage clickMoreDetails3Link() {
        moreDetails3.click();
        return this;
    }

    public storeTQAHomePage clickMoreDetails4Link() {
        moreDetails4.click();
        return this;
    }

    public storeTQAHomePage clickMoreInfo1Link() {
        moreInfo1.click();
        return this;
    }

    public storeTQAHomePage clickMoreInfo2Link() {
        moreInfo2.click();
        return this;
    }

    public storeTQAHomePage clickMoreInfo3Link() {
        moreInfo3.click();
        return this;
    }

    public storeTQAHomePage clickPinterestLink() {
        pinterest.click();
        return this;
    }

    public storeTQAHomePage clickProductCategoryLink() {
        productCategory.click();
        return this;
    }

    public storeTQAHomePage clickRssLink() {
        rss.click();
        return this;
    }

    public storeTQAHomePage clickSamplePageLink() {
        samplePage.click();
        return this;
    }

    public storeTQAHomePage clickSennheiserRs1201Link() {
        sennheiserRs1201.click();
        return this;
    }

    public storeTQAHomePage clickSennheiserRs1202Link() {
        sennheiserRs1202.click();
        return this;
    }

    public storeTQAHomePage clickSpHomeLink() {
        spHome.click();
        return this;
    }

    public storeTQAHomePage clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    public storeTQAHomePage setSplashingPixelsWordpressEcommerceThemesOfferTextField(String splashingPixelsWordpressEcommerceThemesOfferValue) {
        splashingPixelsWordpressEcommerceThemesOffer.sendKeys(splashingPixelsWordpressEcommerceThemesOfferValue);
        return this;
    }

    public storeTQAHomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    public storeTQAHomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
