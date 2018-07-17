import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    public MainPage (WebDriver driver){
        this.driver=driver;
    }

    By registryButtonLocator = By.xpath("//a[@class='login-link s-btn s-btn__primary py8 btn-topbar-primary']");
    By loginEnterButtonLocator = By.xpath("//a[@class='login-link s-btn py8']");
    By searchTextFieldLocator = By.xpath("//div[@class='ps-relative']//input[@name='q']");
    By dropMenuLocator = By.xpath("//li//a[@class='-link js-site-switcher-button js-gps-track topbar-icon-on icon-site-switcher-on']");

    public boolean  existElementLoginEnterButtonLocator (){
        try {
            driver.findElement(loginEnterButtonLocator);
        }catch (NoSuchElementException e){
            System.out.println("Element is not found");
            e.printStackTrace();
            return false;
        }
        System.out.println("Element is found");
        clickLoginEnterButtonLocator();
        return true;
    }


    public LoginPage clickLoginEnterButtonLocator (){
        WebElement loginButton = driver.findElement(loginEnterButtonLocator);
        loginButton.click();
        return new LoginPage(driver);
    }

    //    public RegistryPage registryButtonClick(){
//        WebElement registryButton = driver.findElement(registryButtonLocator);
//        System.out.println("Registration staring");
//        registryButton.click();
//        return new RegistryPage(driver);
//    }


    public void clickSearchTextField(String userEmail) {
        WebElement searchTextField = driver.findElement(searchTextFieldLocator);
        searchTextField.click();
        searchTextField.clear();
        searchTextField.sendKeys(userEmail);
    }

    public void clickDropMenu () throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropMenu = driver.findElement(dropMenuLocator);
        dropMenu.click();
        System.out.println("Drop menu OK");
    }
}
