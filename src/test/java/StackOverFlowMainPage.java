import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StackOverFlowMainPage {
    private WebDriver driver;
    public StackOverFlowMainPage(WebDriver driver) {this.driver=driver;}

    By allSitesDropMenuLocator = By.xpath("/html/body/header/div/ol/li[6]");
    //By dropMenuAskUbuntuLocator = By.xpath("//ul[@class='other-sites js-other-sites']//li[13]//a[1]");

    public TagsSearchTestsPage cycleMenu () throws InterruptedException {
        int i = 2;
        for (int j = 1; j <i; j++){
            Thread.sleep(1000);
            clickAllSitesDropMenuLocator();
            cycleDropMenuClick(j);
            System.out.print(j+" ");
          }
          return new TagsSearchTestsPage(driver);
    }
    private void cycleDropMenuClick(int j) throws InterruptedException {
        By dropMenuPoint3DPrintLocator = By.xpath("//ul[@class='other-sites js-other-sites']//li["+j+"]//a[1]");
        WebElement clickPointMenu = driver.findElement(dropMenuPoint3DPrintLocator);
        clickPointMenu.click();
        Thread.sleep(1000);
        driver.navigate().back();
        }
    public void clickAllSitesDropMenuLocator() throws InterruptedException {
        Thread.sleep(1000);
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
