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
        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1984");
        Select mes = new Select(driver.findElement(By.cssSelector("select[name='month']")));
        mes.selectByValue("04");

        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/form/fieldset/div/div[2]/label/span[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/form/div[6]/div/label/span[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/form/div[7]/div/label")).click();

    }


}
