package Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {
    private WebDriver driver;
    private final String baseUrl = "https://devwcs.ballarddesigns.com/";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testLogin() {
    	VerifyingloginIn loginPage = new VerifyingloginIn(driver);
        loginPage.navigateToLoginPage(baseUrl);
        loginPage.clickLoginLink();
        loginPage.enterUsername("hs@hs.com");
        loginPage.enterPassword("123456he");
        loginPage.clickLoginButton();

        // Add assertions or verifications as needed
    }

    // Other test methods here

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
