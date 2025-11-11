package backofficefc.steps;

import backofficefc.pages.UsuarioAdministracion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUsuarioAdmin {

    UsuarioAdministracion useradmin = new UsuarioAdministracion();

    @Given("configuracion del backoffice")
    public void testConfiguracion() {
        useradmin.opcionConfig();
    }

    @When("ingresamos a la opcion Usuario Admin")
    public void testUsuarioAdmin() {
        useradmin.opcionUsuarioAdmin();
    }

    @And("click en el boton añadir usuario")

    public void testBtAddUser() {
        useradmin.btAddUsuario();
    }

    @Then("validamos escritura en los campos vacios del usuario a agregar")
    public void testCamposText() {
        useradmin.espacioParametros();
    }

}
