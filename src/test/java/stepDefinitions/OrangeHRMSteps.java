//package stepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class OrangeHRMSteps {
//    WebDriver driver;
//
//    @Given("I launch chrome browser")
//    public void i_launch_chrome_browser() {
//        System.setProperty("webdriver.chrome.driver","/home/mayuk/IdeaProjects/BDD/chromedriver_linux64 (1)/chromedriver");
//        driver= new ChromeDriver(); //launch chrome browser
//    }
//    @When("I open orangeHRM home page")
//    public void i_open_orange_hrm_home_page() {
//        driver.get("https://training.orangehrm.com/");
//    }
//    @Then("I verify that the logo present on home page")
//    public void i_verify_that_the_logo_present_on_home_page() {
//       boolean status= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
//        Assert.assertEquals(true, status);
//    }
//    @And("Close browser")
//    public void close_browser() {
//        driver.close();
//    }
//
//
//
//}
