package backofficefc.pages;

public class Usuarios extends BasePageFc {

    public Usuarios() {
        super(driver);
    }

    private String opcionCorresponsal = "//*[@class='bm-icon icon-corresponsales']";
    private String nombreUsuario = "//li[normalize-space()='· Usuarios']";
    private String digitoNombre = "//input[@placeholder='Buscar por nombres de usuario']";
    private String clickAgente = "//div[@ng-click='users.goUser(item.id)' and contains(.,'Activo')]";

    public void clickCorresponsal() {
        // Reemplaza el marcador de posicion en recursoClick con nombre
        clickElemento(opcionCorresponsal);

        // TODO: handle exception
    }

    public void selectUsusario() {
        clickElemento(nombreUsuario);
    }

    public void escribirNombre(String id) {
        escribir(digitoNombre, id);
    }
    public void clickUserAgente(){
        clickElemento(clickAgente);
    }

}
