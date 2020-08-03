import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage{

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[id=\"registration-form-button\"]")
    private WebElement buttonSingIn;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[id = \"cour-link\"][href = \"#cour-new\"]")
    private WebElement buttoncourses2;

    @FindBy(xpath = "//*[@id=\"filter-0\"]")
    private WebElement freecourses;


    @FindBy(xpath = "//*[@id=\"filter-9\"]")
    private WebElement freecoursestesting;

    @FindBy(xpath = ".//*[text()='Тестирование ПО. Уровень 1']")
    private WebElement testing1;

    @FindBy(xpath = ".//*[text()='Тестирование ПО. Уровень 2']")
    private WebElement testing2;








    public WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContentPage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);

        buttonSingIn.click();



        return new ContentPage(driver);
    }

    public void coursessearch() {

        buttonCourses.click();
        buttoncourses2.click();
        freecourses.click();
        freecoursestesting.click();
    }

    public void testingcheck(String expected1, String expected2){
        Assertions.assertEquals(expected1, testing1.getText());
        Assertions.assertEquals(expected2, testing2.getText());


    }














    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSingIn() {
        return buttonSingIn;
    }
}