import org.junit.Test;

public class StackOverFlowTest extends StackoverflowTestSettings{
    public StackOverFlowTest(){
    }

    @Test //login in account
    public void loginInAccountTest() throws InterruptedException {
        MainPage mainPage = new MainPage(this.driver);
        mainPage.existElementLoginEnterButtonLocator();
       // mainPage.clickLoginEnterButtonLocator();
       LoginPage loginPage = mainPage.clickLoginEnterButtonLocator();

        loginPage.login(this.userEmail, this.userPassword);
        StackOverFlowMainPage stackOverFlowMainPage = loginPage.clickButtonLoginLocator();
        //stackOverFlowMainPage.clickAllSitesDropMenuLocator();
        //stackOverFlowMainPage.clickDropMenuPoint3DPrintLocator();
        stackOverFlowMainPage.cycleMenu();

    }

//    @Test // create new account test
//    public void createAccountStackOF() throws InterruptedException {
//        MainPage mainPage = new MainPage(this.driver);
//        mainPage.registryButtonClick();
//        RegistryPage registryPage = mainPage.registryButtonClick();
//        registryPage.crossButtonClick();
//        registryPage.registration(this.userName, this.userEmail, this.userPassword);
//    }

//    @Test //test drop-menu
//    public void testDropMenu() throws InterruptedException {
//        MainPage mainPage = new MainPage(this.driver);
//        mainPage.clickSearchTextField(this.userEmail);
//        mainPage.clickDropMenu();
//    }
}
