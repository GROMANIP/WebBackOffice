package backofficefc.steps;

import backofficefc.pages.Corresponsal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCorresponsal {

    Corresponsal agente = new Corresponsal();

    @Given("navegamos y selecciono la opcion de {word}")
    public void correSource(String corres){
        agente.clickCorresponsal(corres);

    }
    @When("estemos en busqueda")
    public void buscarBusqueda(){
        agente.busear();
    }
    @And("click en filtrar")
    public void buscarFiltro(){
        agente.filtrar();
    }

    @And("digitamos el punto {word}")
    public void buspunto(String punto){
        agente.digitoPunto(punto);
    }
    @Then("validamos la opcion buscar")
    public void buscamosCorre(){
        agente.sourcePunto();
    }
    
}
