package backofficefc.steps;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import backofficefc.pages.Terminales;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTerminal {

    Terminales terminal = new Terminales();

    @When("click en el menu de corresponsales")
    public void clickEnCorresponsal() {
        terminal.clickCorresponsal();
    }

    @And("click en la opcion {word}")
    public void clickDeviceTerminal(String udid) {
        terminal.selectTerminal();
    }

    @And("escribimos el codigo de {word}")
    public void digitarUdid(String cod) {
        terminal.escribirCodigo(cod);
    }

    @And("seleccionamos el terminalfc")
    public void clickCodigoUdid() {
        terminal.clickTerminal();

    }

    @Then("comparamos el estado del terminal")
    public void compararEstadoUdid() {
        assertEquals("Vinculado", terminal.estadoTerminal());
        terminal.selectTerminal();

    }

    // Test creacion de nuevo dispositivo
    @Given("click en la opcion nuevo dispositivo")
    public void ingresarNuevoDispositivo() {
        terminal.clickNewDispositivo();

    }

    @When("ingresamos los valores del {word}")
    public void ingresoValoresDispositivo(String dispositivo) {
        List<String> valores = Arrays.asList(dispositivo.split(","));

        terminal.saltarValoresDispositivo(valores);

    }
    @Then("selecionamos boton guardar")
    public void ejecucionGuardarTerminal(){
        terminal.guardaValoresTerminal();
    }
    @And("mostrarme la popup exitoso y cerrar")
    public void validacionPopup(){
        //assertEquals("Debe rellenar todos los campos para continuar", terminal.retornarLocator());
        //assertEquals(" Ya existe un dispositivo con el mismo udid", terminal.retornarLocator());
        assertEquals("El udid del dispositivo debe contener 16 carácteres", terminal.retornarLocator());
        terminal.btAcepto(); //cerramos el popup



    }

}
