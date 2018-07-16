import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StackOverFlowMainPage {
    private WebDriver driver;
    public StackOverFlowMainPage(WebDriver driver) {this.driver=driver;}

    By allSitesDropMenuLocator = By.xpath("/html/body/header/div/ol/li[6]");

    //By dropMenuAskUbuntuLocator = By.xpath("//ul[@class='other-sites js-other-sites']//li[13]//a[1]");




    public void cycleMenu () throws InterruptedException {
        Thread.sleep(3000);
        for (int i=1; i>=3; i++){
            By dropMenuPoint3DPrintLocator = By.xpath("//ul[@class='other-sites js-other-sites']//li["+i+"]//a[1]");
            WebElement clickPointMenu = driver.findElement(dropMenuPoint3DPrintLocator);
            clickPointMenu.click();
            System.out.println("Munu #"+i+" is open");

            By mainMenuReturnLocator = By.xpath("//ul[@class='my-sites']//span[@class='grid--cell fl1'][contains(text(),'Stack Overflow на русском')]");
            WebElement mainMenu = driver.findElement(mainMenuReturnLocator);
            mainMenu.click();
            System.out.println("Main menu return OK");
        }
    }

    public void clickAllSitesDropMenuLocator() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dropMenu = driver.findElement(allSitesDropMenuLocator);
        dropMenu.click();
        System.out.println("drop menu OK");
    }

//    public void clickDropMenuPoint3DPrintLocator() {
//        WebElement point3DPrint = driver.findElement(dropMenuPoint3DPrintLocator);
//        point3DPrint.click();
//        System.out.println("click poitn OK");
//    }
}
