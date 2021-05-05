package clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {
    //Metodos
    WebDriver getSpotif() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/signup/");
        return driver;
    }
    @Test
    public void spotifyByPlaceHolderTest(){
        WebDriver driver = getSpotif();

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("andluz@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("andluz@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("test123");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("luzan");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("27");
        Select mes = new Select(driver.findElement(By.cssSelector("select[name='month']")));
        mes.selectByValue("04");
        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1984");
        driver.findElement(By.xpath("//*[contains(text(),'Mujer')]")).click();
        driver.findElement(By.cssSelector("span[class = 'Indicator-sc-11vkltc-0 ioJObh']")).click();
        driver.findElement(By.cssSelector("label[for = 'third-party-checkbox']")).click();




    }


}
