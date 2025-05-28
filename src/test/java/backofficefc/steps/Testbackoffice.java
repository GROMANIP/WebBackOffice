package backofficefc.steps;


import backofficefc.pages.Corresponsal;
import backofficefc.pages.ImplementacionBackOffice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testbackoffice {

    ImplementacionBackOffice login = new ImplementacionBackOffice();
    Corresponsal agente = new Corresponsal();


    @Given("navego a la pagina de www.backoffice.com")
    public void testPagina() {
        login.webBackoffice();
    }

    @And("ingresamos el {word}")
    public void buscarUsuario(String credenciales){
        login.ingresaUsuario(credenciales);
    }

    @And("ingresamos la {word}")
    public void buscarClave(String password){
        login.ingresaClave(password);
    }

    @Then("hacemos click en ingresar")
    public void clickIngresar(){
        login.ingresarBo();
    }
    @When("navegamos y selecciono la opcion de {word}")
    public void correSource(String corres){
        agente.clickCorresponsal(corres);

    }
    @And("click en busqueda")
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
    @Then("seleccionamos la opcion buscar")
    public void buscamosCorre(){
        agente.sourcePunto();
    }




}
