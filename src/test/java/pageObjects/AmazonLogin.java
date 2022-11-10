package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
    public WebDriver driver;
    public AmazonLogin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]") @CacheLookup WebElement todayDeals;
    @FindBy(xpath = "//div[@id='slot-15']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]") @CacheLookup WebElement thirdDeal;
    @FindBy(xpath = "//div[@id='octopus-dlp-asin-stream']/ul[1]/li[1]") @CacheLookup WebElement firstItem;
    @FindBy(xpath = "//select[@id='quantity']") @CacheLookup WebElement quantity;
    @FindBy(xpath = "//input[@id='add-to-cart-button']") @CacheLookup WebElement addTocardBtn;
    @FindBy(xpath = "//div[@id='nav-cart-count-container']") @CacheLookup WebElement cartBtn;
    @FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']")@CacheLookup WebElement cart1Btn;
    @FindBy(xpath = "//span[@class='a-button-inner']//span[2]") @CacheLookup WebElement qty;
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']") @CacheLookup WebElement searchbar;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']") @CacheLookup WebElement submitBtn;
    @FindBy(xpath = "(//div[@class='a-section']//div[@class='sg-row'])[25]") @CacheLookup WebElement lastMobile;

    public void clickOnTodaysDeal()
    {
        if (todayDeals.isDisplayed()){
        todayDeals.click();}
    }
    public void clickOnThirdDeal()
    {
        thirdDeal.click();
    }
    public void clickOnFirstItem()
    {
        firstItem.click();
    }
    public void selectQauntity()
    {
        quantity.isDisplayed();
    }
    public void setAddTocardBtn() throws InterruptedException {
        if (addTocardBtn.isDisplayed())
        {addTocardBtn.click();}
        else {
            Thread.sleep(3000);
            addTocardBtn.click();
        }
    }
    public void clickOnCartBtn()
    {
        cart1Btn.click();
    }
    public void verifyQty()
    {
        String actualQTY= qty.getText();
        System.out.println("Actual Qty of item is = " +actualQTY);
        Assert.assertEquals(actualQTY, "1");
    }
    public void searchMobile(String item)
    {
        searchbar.clear();
        searchbar.sendKeys(item);
        submitBtn.click();
    }
    public void getLastMobile()
    {
        String details=lastMobile.getText();
        System.out.println(details);
    }
}
