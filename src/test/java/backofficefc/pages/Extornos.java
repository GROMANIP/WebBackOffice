package backofficefc.pages;

public class Extornos extends BasePageFc {

    public Extornos() {
        super(driver);
    }

    private String extor = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[1]/div[2]/div[5]";
    private String filt = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[1]/div[1]/div[2]";
    private String fech = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    private String cod = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/angucomplete-alt[1]/div[1]/input[1]";
    private String busc = "/html/body/ion-nav-view/div/div[2]/ion-nav-view/ion-view/ion-content/div/div[1]/form/div/div/div[2]/div[4]/div/button";
    private String regisExtor = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[2]/div[2]/div[1]/div[5]";
    private String btAceptar = "/html/body/ion-nav-view/div/div[2]/ion-nav-view/ion-view/ion-content/div/div[2]/div[2]/div[2]/div[2]/button[1]";
    private String tituloPopup= "/html[1]/body[1]/div[4]/div[1]/div[1]/h3[1]";
    public void opcionExtorno() {
        clickElemento(extor);
    }

    public void opcionFiltro() {
        clickElemento(filt);
    }

    public void insertFecha(String fecha) {
        escribir(fech, fecha);
    }

    public void insertCod(String codigo) {
        escribir(cod, codigo);
    }

    public void inserBuscar() {
        clickElemento(busc);
    }

    public String insertRegExtor() {
        return comparar(regisExtor);

    }

    public void aceptarbtExtorno() {
        clickElemento(regisExtor);
    }

    public void aceptarbt() {
        clickElemento(btAceptar);
    }
    public String alertBo(){
    return comparar(tituloPopup);
    
    }

}
