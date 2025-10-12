package backofficefc.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class Terminales extends BasePageFc {

    public Terminales() {
        super(driver);
    }

    private String opcionCorresponsal = "//*[@class='bm-icon icon-corresponsales']";
    private String opcionTerminal = "//li[normalize-space()='· Terminales']";
    private String escriboCodigo = "//input[@placeholder='Buscar por UDID de terminal']";
    private String clickTerminal = "//div[@ng-click='devices.goDevice(item.id)']";
    private String textEstadoTer = "//div[normalize-space()='Vinculado']";

    private String botonNewDispositivo = "//button[contains(@class, 'ok-button') and contains(text(), 'Nuevo dispositivo')]";
    private String valoresNewDispositivo = "//input[@placeholder='Número de serie']";
    private String guardarDispositivo = "//button[contains(@class, 'ok-button') and contains(text(), 'Guardar')]";
    private String validamosPopup = "/html/body/div[4]/div/div[2]";
    private String botonAceptar= "/html/body/div[4]/div/div[3]/button";

    public void clickCorresponsal() {
        // Reemplaza el marcador de posicion en recursoClick con nombre
        clickElemento(opcionCorresponsal);

    }

    public void selectTerminal() {
        clickElemento(opcionTerminal);
    }

    public void escribirCodigo(String cod) {
        escribir(escriboCodigo, cod);
    }

    public void clickTerminal() {
        clickElemento(clickTerminal);
    }

    // obtener el metodo de base page de tipo string
    public String estadoTerminal() {
        return comparar(textEstadoTer);
    }

    // clase de creacion de nuevos dispositivo:
    public void clickNewDispositivo() {
        clickElemento(botonNewDispositivo);
    }

    //guardamos los valores en cada caja de texto
    public void saltarValoresDispositivo(List<String> valores) {
        clickElemento(valoresNewDispositivo);

        Actions actions = new Actions(driver);

        for (String qa : valores) {
            actions.sendKeys(qa)
            .sendKeys(Keys.TAB)
            .perform();

        }

    }
    //guardamos los valores del nuevo dispositivo
    public void guardaValoresTerminal(){
        clickElemento(guardarDispositivo);
    }   
    public String retornarLocator(){
        return comparar(validamosPopup);
    }

        public void btAcepto(){
        clickElemento(botonAceptar);
    }   
    


}
