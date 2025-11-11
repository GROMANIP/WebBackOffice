package backofficefc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class UsuarioAdministracion extends BasePageFc {

    public UsuarioAdministracion() {
        super(driver);
    }

    private String config = "//div[contains(@class,'item-deploy') and contains(.,'Configuración')]";
    private String usuarioAdmin = "//li[@ng-click=\"menu.doNavigate('menu.userAdmin')\" and contains(.,'Usuarios Administración')]";
    private String addUsuario = "//button[contains(@class,'ok-button') and contains(.,'Añadir usuario')]";
    private String parametros = "//input[@type='text' and @placeholder='Código']";

    public void opcionConfig() {
        clickElemento(config);

    }

    public void opcionUsuarioAdmin() {
        clickElemento(usuarioAdmin);
    }

    public void btAddUsuario() {
        clickElemento(addUsuario);
    }

    public void espacioParametros() {
        Actions actions = new Actions(driver);
        actions.sendKeys(parametros).keyDown(Keys.TAB);

    }

}
