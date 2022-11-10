package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWithLogin {
    public WebDriver driver;
    public AmazonWithLogin(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='nav-link-accountList']")@CacheLookup WebElement signIn;
    @FindBy(xpath = "//input[@type='email']")@CacheLookup WebElement email;
    @FindBy(xpath = "//input[@id='continue']")@CacheLookup WebElement continueBtn;
    @FindBy(xpath = "//input[@id='ap_password']")@CacheLookup WebElement password;
    @FindBy(xpath = "//input[@id='signInSubmit']")@CacheLookup WebElement loginBtn;
    @FindBy(xpath = "//a[text()='Baby']")@CacheLookup WebElement babyBtn;
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[3]")@CacheLookup WebElement primeBtn;
    @FindBy(xpath = "//div[@class='sg-col-inner']//div[@data-index='1']//div[@class='a-row s-align-children-center']//span[2]")@CacheLookup WebElement deliveryStatus;
    @FindBy(xpath = "//a[@id='nav-orders']") @CacheLookup WebElement orderBtn;
    @FindBy(xpath = "//span[@role='button']")@CacheLookup WebElement dropDown;
    @FindBy(xpath = "//a[@id='time-filter_3']")@CacheLookup WebElement pastYear;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")@CacheLookup WebElement account;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")@CacheLookup WebElement order;
    @FindBy(xpath = "(//div[@class='a-box ya-card--rich'])[5]")@CacheLookup WebElement payment;
    @FindBy(xpath = "//div[@id='walletTitleRow']")@CacheLookup WebElement paymentPage;
    @FindBy(xpath = "(//div[@class='a-row'])[4]")@CacheLookup WebElement address;
    @FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")@CacheLookup WebElement addAddress;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")@CacheLookup WebElement fullName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")@CacheLookup WebElement phonenumber;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")@CacheLookup WebElement pincode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")@CacheLookup WebElement firstLine;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")@CacheLookup WebElement secondLine;
    @FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")@CacheLookup WebElement landmark;
    @FindBy(xpath = "(//input[@class='a-button-input'])[3]")@CacheLookup WebElement addBtn;
    @FindBy(xpath = "(//div[@class='a-box-inner a-alert-container'])[1]")@CacheLookup WebElement addresspage;
    public void clickOnSignIn()
    {
        signIn.click();
    }
    public void enterEmail(String uname)
    {
        email.clear();
        email.sendKeys(uname);
    }
    public void clickContinueBtn(){
        continueBtn.click();
    }
    public void enterPassword(String pwd)
    {
        password.clear();
        password.sendKeys(pwd);
    }
    public void ClickOnLoginBtn()
    {
        loginBtn.click();
    }
    public void ClickOnBabyBtn()
    {
        babyBtn.click();
    }
    public void clickOnPrimeBtn()
    {
        primeBtn.click();
    }
    public void checkDeliveryStatus()
    {
       String status= deliveryStatus.getText();
       System.out.println(status);
    }
    public void clickOnOrderBtn()
    {
        orderBtn.click();
    }
    public void clickOnDropDown()
    {
        dropDown.click();
    }
    public void selectLastYear()
    {
        pastYear.click();
    }
    public void clickOnAccount()
    {
        account.click();
    }
    public void addPayment()
    {
        payment.click();
    }
    public void verifyPaymentPage()
    {
        String actual= paymentPage.getText();
        System.out.println("Page contain = " +actual);
        Assert.assertEquals( "Your Payment Options",actual);
    }
    public void clickOnOrder()
    {
        order.click();
    }
    public void addAddress() throws InterruptedException {
        address.click();
        Thread.sleep(2000);
        addAddress.click();
    }
    public void enterFullName(String name)
    {
        fullName.clear();
        fullName.sendKeys(name);
    }
    public void enterPhone(String phone)
    {
        phonenumber.clear();
        phonenumber.sendKeys(phone);
    }
    public void enterPincode(String pin)
    {
        pincode.clear();
        pincode.sendKeys(pin);
    }
    public void enterHouse(String home)
    {
        firstLine.clear();
        firstLine.sendKeys(home);
    }
    public void enterStreet(String street)
    {
        secondLine.clear();
        secondLine.sendKeys(street);
    }
    public void enterLandmark(String land)
    {
        landmark.clear();
        landmark.sendKeys(land);
    }
    public void clickOnAddBtn()
    {
        addBtn.click();
    }
    public void verifyAddressPage()
    {
        String actual= addresspage.getText();
        System.out.println("Page contain = " +actual);
        Assert.assertEquals( "Address saved",actual);
    }



}
