package backofficefc.steps;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import backofficefc.pages.Configuracion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestConfiguracion {
    Configuracion conf = new Configuracion();

    @Given("estamos en la configuracion de agentes")
    public void testConfiguracion() {
        conf.opcionConfig();
    }

    @When("ingresemos a la opcion de alta de corresponsales")
    public void testAltaCorresponsales() {
        conf.opcionAltaAgente();
    }

    @And("ingresemos el codigo del {word}")
    public void testInsertPunto(String punto) {
        conf.ingresarCodigo(punto);
    }

    @And("click en el boton buscar")
    public void testBuscar() {
        conf.botonBuscar();
    }

    @Then("validamos si se almacena los resultados en la lista")
    public void testAlmacenamiento() {
        conf.listaAgentes().iterator();
        System.out.println("Almacenamos al agente:"
                + conf.listaAgentes());

    }

    @Then("validamos el alta del agente corresponsal")
    public void testAltaAgente() {
        SoftAssert soft = new SoftAssert();
        conf.botonAceptar();

        soft.assertEquals(conf.popupAlta(),
                "Se ha agregado el corresponsal: " + conf.nameAgente(), "No se pudo registrar AGENTE: ");

        soft.assertAll();
        conf.closeAlerta();

    }

}
