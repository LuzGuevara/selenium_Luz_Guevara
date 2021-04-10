package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium {
    //EJERCICIO #14
    @Test
    public void ejercicio14(){
        WebDriver driver = getDriver("https://www.netflix.com/uy/");
        System.out.println("****TITULOS H1****");
        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        for (WebElement listatitulo1 : listaH1){
            System.out.println(listatitulo1.getText());
        }
        System.out.println("\n****TITULOS H2****");
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        for (WebElement listatitulo2 : listaH2){
            System.out.println(listatitulo2.getText());
        }

        driver.navigate().refresh();

        System.out.println("\n****BOTONES****");
        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));
        for (WebElement botones : listaBotones){
            System.out.println(botones.getText());
        }

        System.out.println("\n****ELEMENTOS DIVS****");
        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));
        System.out.println("Hay "+ listaDiv.size() + " elementos tipos div");

        System.out.println("\n****TITULO****");
        System.out.println(driver.getTitle());

        System.out.println("\n****ELEMENTOS LINK****");
        List<WebElement> listaLink = driver.findElements(By.tagName("a"));
        System.out.println("Hay " + listaLink.size() + " link");

        driver.close();

    }

    /**
     * Metodo para conectarme con cualquier url
     * @param URL
     * @return
     */
    WebDriver getDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

}
