import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class StackoverflowTestSettings {
    protected WebDriver driver;
    protected String userName = "CostaCore";
    protected String userPassword = "4838960Q";
    protected String userEmail = "konstantin.koresh@gmail.com";

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ru.stackoverflow.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void browserDown(){
        System.out.println("Testing end");
        //driver.close();
    }
}
