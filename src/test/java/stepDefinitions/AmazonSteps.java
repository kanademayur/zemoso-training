package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AmazonLogin;
import pageObjects.AmazonWithLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class AmazonSteps {
    public WebDriver driver;
    public AmazonLogin alp;
    public AmazonWithLogin awl;

//    public static void dataDriven(String key)throws IOException {
//        FileInputStream file=new FileInputStream("src/test/java/testData/testData.properties");
//        Properties props =new Properties();
//        props.load(file);
//        String info=props.getProperty(key);
//    }
    @Before
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","/home/mayuk/IdeaProjects/BDD/chromedriver_linux64 (1)/chromedriver");
        driver= new ChromeDriver();
        alp= new AmazonLogin(driver);
        awl= new AmazonWithLogin(driver);

    }
    @When("user enter url {string}")
    public void user_enter_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    @When("User click on Todays Deal")
    public void user_click_on_todays_deal() {
        alp.clickOnTodaysDeal();

    }

    @When("User click on Third deal")
    public void user_click_on_third_deal() {
        alp.clickOnThirdDeal();
    }
    @When("click on first Item")
    public void click_on_first_item() {
        alp.clickOnFirstItem();
    }

    @When("Add minimum quantity")
    public void add_minimum_quantity() {
        alp.selectQauntity();
    }

    @When("click on Add to cart button")
    public void click_on_add_to_cart_button() throws InterruptedException {
        alp.setAddTocardBtn();

    }
    @When("click on cart button")
    public void click_on_cart_button() throws InterruptedException {
        Thread.sleep(5000);
        alp.clickOnCartBtn();
    }

    @Then("verify quantity as {string}")
    public void verify_quantity_as(String itemQty) {
        alp.verifyQty();
    }
    @When("search the {string}")
    public void search_the(String string) {
        alp= new AmazonLogin(driver);
        alp.searchMobile(string);
    }

    @Then("mobile page is visible")
    public void mobile_page_is_visible() {
       String title = driver.getTitle();
       System.out.println(title);
    }

    @When("Scroll down the page")
    public void scroll_down_the_page() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");

    }


    @When("Get the last displayed item details.")
    public void get_the_last_displayed_item_details() {
        alp.getLastMobile();
    }

    @When("click on left navigation")
    public void click_on_left_navigation() {
        for(int i=0;i<=5;i++) {
            driver.navigate().back();
        }
    }

    @And("close the browser.")
    public void go_to_home_page() {
        driver.quit();
    }
    @When("click on signup option")
    public void click_on_signup_option() {
        awl.clickOnSignIn();
    }
    @When("User enter Email as {string} and Password as {string}")
    public void user_enter_email_as_and_password_as(String email, String password) {
        awl.enterEmail(email);
        awl.clickContinueBtn();
        awl.enterPassword(password);
    }
    @When("click on Login")
    public void click_on_login() {
        awl.ClickOnLoginBtn();
    }
    @Then("select the prime delivery checkbox")
    public void select_the_prime_delivery_checkbox() {
        awl.ClickOnBabyBtn();
        awl.clickOnPrimeBtn();
    }
    @Then("get the first item delivery date")
    public void get_the_first_item_delivery_date() {
        awl.checkDeliveryStatus();
    }

    @When("click on your order")
    public void click_on_your_order() {
        awl.clickOnOrderBtn();
    }
    @When("select past one year order")
    public void select_past_one_year_order() throws InterruptedException {
        awl.clickOnDropDown();
        awl.selectLastYear();
        Thread.sleep(3000);
    }
    @When("click on Account")
    public void click_on_Account() {
        awl.clickOnAccount();
    }
    @When("click on Add payment option")
    public void click_on_add_payment_option() {
        awl.addPayment();
    }
    @Then("Verify payment option is added")
    public void verify_payment_option_is_added() {
        awl.verifyPaymentPage();
    }
    @When("click on account")
    public void click_on_account() throws InterruptedException {
        Thread.sleep(2000);
        awl.clickOnOrder();
    }
    @When("click on Add address option")
    public void click_on_add_address_option() throws InterruptedException {
        awl.addAddress();
    }
    @When("add the address as {string} ,{string} , {string} ,{string} ,{string} and {string}")
    public void add_the_address_as_and(String Name, String phone, String pinCode, String house, String street, String landMark) {
        awl.enterFullName(Name);
        awl.enterPhone(phone);
        awl.enterPincode(pinCode);
        awl.enterHouse(house);
        awl.enterStreet(street);
        awl.enterLandmark(landMark);
        awl.clickOnAddBtn();

    }
    @Then("verify address is added")
    public void verify_address_is_added() {
        awl.verifyAddressPage();
    }




}
