package backofficefc.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePageFc {
    
    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus
     * subclases
     */
    protected static WebDriver driver;
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando
     * el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    /*
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el
     * driver del navegador
     */
    static {
        WebDriverManager.chromedriver().setup();

        // Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }


    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento.
     */
    public BasePageFc(WebDriver driver) {
        BasePageFc.driver = driver;
    }

    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

        private WebElement encontrar(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

    }

    // click cuando encuentre al localizador
    public void clickElemento(String locator) {
        encontrar(locator).click();

    }

        // escribir texto en un campo de texto
    public void escribir(String locator, String keysToSend) {
        encontrar(locator).clear(); // limpiar el campo si esta yeno
        encontrar(locator).sendKeys(keysToSend); // escribir un string en el campo vacio
    }
    
}
