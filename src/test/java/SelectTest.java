import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    private WebDriver driver;
    private Select select;

    public SelectTest (WebDriver driver) {this.driver=driver;}

    By dropMenuTextLocator = By.xpath("//p[contains(text(),'For academics and those enrolled in higher educati')]");

    public Select getSelect(WebElement element){
        select = new Select(element);
        return select;
    }

    public void selectText() {
        WebElement listText = driver.findElement(dropMenuTextLocator);
        getSelect(listText);
        select.deselectByVisibleText("Academia");
        listText.click();
    }


}
