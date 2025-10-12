package backofficefc.pages;

public class Transacciones extends BasePageFc {

    public Transacciones() {
        super(driver);
    }

    private String transaccion = "/html/body/ion-nav-view/div/div[1]/div[2]/div[4]";
    private String filtros = "/html/body/ion-nav-view/div/div[2]/ion-nav-view/ion-view/ion-content/div/div[1]/div/div[2]";
    private String fecha = "//input[@placeholder='Fecha Inicio']";
    private String punto = "//input[@id='ex1_value']";
    private String status = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]";
    private String selectStatus = "/html/body/ion-nav-view/div/div[2]/ion-nav-view/ion-view/ion-content/div/div[1]/form/div/div/div[1]/div[3]/div[1]/div/div/div/div[1]";
    private String buscar = "/html/body/ion-nav-view/div/div[2]/ion-nav-view/ion-view/ion-content/div/div[1]/form/div/div/div[2]/div[5]/div/button";
    private String tx= "//div[contains(text(),'Recargas')]";


    public void clickTx() {
        clickElemento(transaccion);
    }

    public void clickfiltro() {
        clickElemento(filtros);
    }

    public void insertFecha(String date) {
        escribir(fecha, date);

    }

    public void insertPunto(String codigo) {
        escribir(punto, codigo);

    }

    public void insertEstado() {
        clickElemento(status);

    }

    public void selectStatus() {
        clickElemento(selectStatus);

    }

    public void source() {
        clickElemento(buscar);

    }
    //public String obtenerTx(){
      //  return tx;
    //}

       public String obtenerTx() {
        return comparar(tx);

    }

}
