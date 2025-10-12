package backofficefc.pages;


public class ImplementacionBackOffice extends BasePageFc {

    // String botonLogin =
    // "https://movil-noprod.confianza.net.pe:2020/boffice/login#!/login";
    String usuario = "//input[@placeholder='Usuario']";
    String clave = "//input[@placeholder='clave']";
    String acceso = "//button[@ng-click='login.doLogin()']";

    public ImplementacionBackOffice() {
        super(driver);
    }
    public void webBackoffice() {
        navigateTo("https://movil-noprod.confianza.net.pe:2020/boffice/login#!/login");
        driver.manage().window().maximize();
    }

    public void ingresaUsuario(String credenciales) {
        escribir(usuario, credenciales);
    }

    public void ingresaClave(String password) {
        escribir(clave, password);
    }

    public void ingresarBo() {
        clickElemento(acceso);
    }

}
