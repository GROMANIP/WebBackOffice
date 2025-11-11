package backofficefc.steps;

import backofficefc.pages.Usuarios;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUsuario {

    Usuarios user = new Usuarios();

    // PRUEBA DE BUSQUEDA DE USUARIOS:

    @Given("vamos en la alternativa {word}")
    public void clickUser(String agente) {
        user.selectUsusario();
    }

    @When("escribimos el nombre de {word}")
    public void digitoNombreUsuario(String id) {
        user.escribirNombre(id);
    }

    @Then("validamos seleccionamos el usuario")
    public void clickName() {
        user.clickUserAgente();
        System.out.println("ejecutado QA");

    }

}
