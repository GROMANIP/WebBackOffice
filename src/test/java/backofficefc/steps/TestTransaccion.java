package backofficefc.steps;

import org.testng.Assert;

import backofficefc.pages.Transacciones;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTransaccion {

    Transacciones tx = new Transacciones();

    @Given("seleccionamos la opcion Transacciones")
    public void getclicktrasaccion() {
        tx.clickTx();
    }

    @When("click en filtros")
    public void getclickfiltro() {
        tx.clickfiltro();
    }

    @Then("ingresamos los valores para {word}")
    public void testfecha(String date) {
        tx.insertFecha(date);
    }

    @And("ingresamos el numero de {word}")
    public void testpunto(String codigo) {
        tx.insertPunto(codigo);
    }

    @And("seleccionamos el estado en el desplegable")
    public void testestado() {
        tx.insertEstado();
        tx.selectStatus();
    }

    @And("boton la opcion buscar")
    public void testBuscar() {
        tx.source();

    }

    @And("validamos si existe la nueva operacion")
    public void testCompareTx() {
        // tx.obtenerTx();
        Assert.assertEquals(tx.obtenerTx(), "Recargas");

    }

}
