import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TagsSearchTestsPage {
    private WebDriver driver;

    public TagsSearchTestsPage (WebDriver driver){
        this.driver=driver;
    }
    //By tagsLocator = By.xpath("//a[contains(text(),'javascript')]");
    By tagsLocator = By.xpath("//a[@class='post-tag']");

    public void clickTagsLocator() throws InterruptedException {
        List<WebElement> allTags = driver.findElements(tagsLocator);

        for (WebElement element : allTags) {
            System.out.print(element.getText());
            System.out.println(" "+element.getSize());
            //System.out.println(" "+element.getAttribute());

        }
    }
}
