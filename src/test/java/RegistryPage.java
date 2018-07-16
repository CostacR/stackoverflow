import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistryPage  {
    private WebDriver driver;

    public RegistryPage(WebDriver driver) {
        this.driver = driver;
    }
    By crossButtonClickLocator  =By.xpath("//button[@class='s-btn s-btn__inverted fc-white bg-black-700 baw0 p16 js-notice-close']");
    By userNameFieldLocator = By.xpath("//*[@id='display-name']");
    By userEmailFieldLocator = By.xpath("//input[@id='email']");
    By userPasswordLocator = By.xpath("//input[@id='password']");
    By submitButtonLocator = By.xpath("//button[@id='submit-button']");

    public void crossButtonClick(){
    WebElement buttonCross =driver.findElement(crossButtonClickLocator);
    buttonCross.click();
        System.out.println("Button cross click OK");
    }
    public void fillUserNameField (String userName){
        WebElement userNameField = driver.findElement(userNameFieldLocator);
        userNameField.click();
        userNameField.clear();
        userNameField.sendKeys(userName);
        System.out.println("username OK");
    }
    public void fillUserEmailField (String userEmail) throws InterruptedException {
        Thread.sleep(1000);
        WebElement userEmailField = driver.findElement(userEmailFieldLocator);
        userEmailField.click();
        userEmailField.clear();
        userEmailField.sendKeys(userEmail);
        System.out.println("user Email OK");
    }
    public void fillUserPassword (String userPassword){
        WebElement userPasswordField = driver.findElement(userPasswordLocator);
        userPasswordField.click();
        userPasswordField.clear();
        userPasswordField.sendKeys(userPassword);
    }
    public void submitButtonClick (){
        WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();
        System.out.println("Button submit OK");
    }
    public void registration (String userName, String userEmail, String userPassword) throws InterruptedException {
        fillUserNameField(userName);
        fillUserEmailField(userEmail);
        fillUserPassword(userPassword);
        submitButtonClick();
    }
}
