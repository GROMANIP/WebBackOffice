package backofficefc.steps;

import backofficefc.pages.ImplementacionBackOffice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Testbackoffice {

    ImplementacionBackOffice login = new ImplementacionBackOffice();

    // INGRESAMOS AL BACKOFFICE

    @Given("navego a la pagina de www.backoffice.com")
    public void testPagina() {
        login.webBackoffice();
    }

    @And("ingresamos el {word}")
    public void buscarUsuario(String credenciales) {
        login.ingresaUsuario(credenciales);
    }

    @And("ingresamos la {word}")
    public void buscarClave(String password) {
        login.ingresaClave(password);
    }

    @Then("hacemos click en ingresar")
    public void clickIngresar() {
        login.ingresarBo();
    }

}
