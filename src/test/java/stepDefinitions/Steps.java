//package stepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pageObjects.LoginPage;
//
//public class Steps {
//    public WebDriver driver;
//    public LoginPage lp;
//
//    @Given("User Launch Chrome browser")
//    public void user_launch_chrome_browser() {
//        System.setProperty("webdriver.chrome.driver","/home/mayuk/IdeaProjects/BDD/chromedriver_linux64 (1)/chromedriver");
//        driver= new ChromeDriver();
//        lp= new LoginPage(driver);
//    }
//    @When("User open URL {string}")
//    public void user_open_url(String url) {
//        driver.get(url);
//    }
//    @When("User enter Email as {string} and Password as {string}")
//    public void user_enter_email_as_and_password_as(String email, String password) {
//        lp.setUserName(email);
//        lp.setPassword(password);
//    }
//    @When("click on Login")
//    public void click_on_login() {
//        lp.clickLogin();
//    }
//    @Then("Page title should be {string}")
//    public void page_title_should_be(String title) {
//        if (driver.getPageSource().contains("Login was unsuccessful.")){
//            driver.close();
//            Assert.assertTrue(false);
//        } else {
//            Assert.assertEquals(title, driver.getTitle());
//        }
//    }
//    @When("User click on log out link")
//    public void user_click_on_log_out_link() throws InterruptedException {
//        lp.clickLogout();
//        Thread.sleep(3000);
//    }
////    @Then("Page title should be {string}")
////    public void page_title_should(String title1) {
////        Assert.assertEquals(title1, driver.getTitle());
////    }
//
//    @Then("close browser")
//    public void close_browser() {
//        driver.close();
//    }
//}
