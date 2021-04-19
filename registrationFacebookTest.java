package clase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class registrationFacebookTest {
   //Metodo
    WebDriver getFacebook() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://es-la.facebook.com/");
        return driver;
    }

    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = getFacebook();
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("test@tes.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@tes.com");
        driver.findElement(By.id("password_step_input")).sendKeys("5412");

        WebElement dayNaci = driver.findElement(By.name("birthday_day"));
        Select day = new Select(dayNaci);
        day.selectByIndex(26);

        WebElement mothNaci = driver.findElement(By.name("birthday_month"));
        Select month = new Select(mothNaci);
        month.selectByVisibleText("jun");

        WebElement yearNaci = driver.findElement(By.name("birthday_year"));
        Select year = new Select(yearNaci);
        year.selectByValue("1980");

        List<WebElement> marcarSexo = driver.findElements(By.name("sex"));
        WebElement sexoMale = marcarSexo.get(1);
        sexoMale.click();

    }












}
