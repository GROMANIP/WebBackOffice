package backofficefc.pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

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

    public void clickElemento(String locator) {
        int reintentos = 2;
        for (int i = 0; i < reintentos; i++) {
            try {
                WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
                el.click(); // clic incluso si no es "clickeable", prueba
                return;

            } catch (Exception e) {
                System.out.println("Reintento clickElemento(): " + (i + 1) + " -> " + e.getMessage());
            }
        }
        throw new RuntimeException("No se pudo hacer clic en el elemento: " + locator);
    }

    public WebElement encontrar(String locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    // Método estático para cerrar la instancia del driver.
    public static void cerrarNavegador() {
        driver.quit();
    }
    // se crea nueva funcion:

    // escribir texto en un campo de texto
    public void escribir(String locator, String keysToSend) {
        encontrar(locator).clear(); // limpiar el campo si esta yeno
        encontrar(locator).sendKeys(keysToSend); // escribir un string en el campo vacio
    }

    // obtener el texto del locator
    public String comparar(String locator) {
        return encontrar(locator).getText();
    }

    // Uso de Select para dropdown
    public void selectDropdownValue(String locator, String dropdownValue) {
        Select value = new Select(encontrar(locator));
        value.selectByValue(dropdownValue);
    }

    public void selectDropdownIndex(String locator, int dropdownIndex) {
        Select index = new Select(encontrar(locator));
        index.selectByIndex(dropdownIndex);
    }

    public void selectDropdownText(String locator, String dropdownText) {
        Select text = new Select(encontrar(locator));
        text.selectByVisibleText(dropdownText);

    }

    // Alertas, iFrame, popup
    // uso metodo alert porque maneja metodos propios los demas no, son del driver
    public void popupCerrar() {
        driver.switchTo().alert().dismiss();
    }

    public void popupTex() {
        driver.switchTo().alert().getText();
    }

    public ArrayList<String> listaElementos(String locator) {

        ArrayList<String> nombre = new ArrayList<>();
        nombre.add(comparar(locator));
        return nombre;

    }

}
