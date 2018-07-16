import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {    this.driver=driver;    }
    By userEmailFieldLocator = By.xpath("//input[@id='email']");
    By userPasswordFieldLocator = By.xpath("//input[@id='password']");
    By buttonLoginLocator = By.xpath("//input[@id='submit-button']");
    By crossButtonClickLocator  =By.xpath("//button[@class='s-btn s-btn__inverted fc-white bg-black-700 baw0 p16 js-notice-close']");

    public void crossButtonClick(){
        WebElement buttonCross =driver.findElement(crossButtonClickLocator);
        buttonCross.click();
        System.out.println("Button cross click OK");
    }
    public void clickUserEmailFieldLocator(String userEmail) {
        WebElement useremail = driver.findElement(userEmailFieldLocator);
        useremail.click();
        useremail.clear();
        useremail.sendKeys(userEmail);
        System.out.println("login OK");
    }
    public void clickUserPasswordFieldLocator(String userPassword) {
        WebElement userpassword = driver.findElement(userPasswordFieldLocator);
        userpassword.click();
        userpassword.clear();
        userpassword.sendKeys(userPassword);
        System.out.println("password OK");
    }
    public StackOverFlowMainPage clickButtonLoginLocator() {
        WebElement loginButton  = driver.findElement(buttonLoginLocator);
        loginButton.click();
        System.out.println("Accept button OK");
        return new StackOverFlowMainPage(driver);
    }
    public void login (String userEmail, String userPassword){
        crossButtonClick();
        clickUserEmailFieldLocator(userEmail);
        clickUserPasswordFieldLocator(userPassword);
        clickButtonLoginLocator();
    }


}
