package Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyingloginIn {
	
	 private WebDriver driver;

	    public VerifyingloginIn(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToLoginPage(String baseUrl) {
	        driver.get(baseUrl);
	    }

	    public void clickLoginLink() {
	        driver.findElement(By.cssSelector("#login")).click();
	    }

	    public void enterUsername(String username) {
	        WebElement usernameInput = driver.findElement(By.cssSelector("#logonId"));
	        usernameInput.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordInput = driver.findElement(By.cssSelector("#logonPassword"));
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        WebElement loginButton = driver.findElement(By.cssSelector("#logonButton"));
	        loginButton.click();
	    }
}
