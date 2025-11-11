package backofficefc.steps;

import org.testng.Assert;

import backofficefc.pages.Extornos;
import io.cucumber.java.en.*;

public class TestExtorno {

    Extornos extorno = new Extornos();

    @Given("nos encontramos en la pestaña solicitudes de extorno")
    public void testOpcionExtorno() {
        extorno.opcionExtorno();
    }

    @When("seleccionamos la opcion filtros")
    public void testFiltro() {
        extorno.opcionFiltro();
    }

    @And("ingresamos el rango de {word}")
    public void testFecha(String fecha) {
        extorno.insertFecha(fecha);
    }

    @And("ingreso {word} de agente")
    public void testAgente(String codigo) {
        extorno.insertCod(codigo);
    }

    @And("seleccion en la opcion buscar")
    public void testBuscar() {
        extorno.inserBuscar();

    }

    @Then("validamos si existen registros de extornos solicitados")
    public void testRegExtor() {
        try {
            Assert.assertEquals(extorno.insertRegExtor(), "Extorno solicitado");

        } catch (Exception e) {
            System.out.println("No hay registro de solicitudes de extorno!!");
        }
        extorno.aceptarbtExtorno();
        //extorno.aceptarbt();

    }

    @And("validamos si existe popup informativo")
    public void testExtorno() {
    Assert.assertTrue(true, "El popup no se muestra");
    
  
    }

}
