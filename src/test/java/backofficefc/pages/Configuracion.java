package backofficefc.pages;

import java.util.ArrayList;

public class Configuracion extends BasePageFc {

    public Configuracion() {
        super(driver);
    }

    private String config = "//div[contains(@class,'item-deploy') and contains(.,'Configuración')]";
    private String altaAgente = "//li[@ng-click=\"menu.doNavigate('menu.cb')\"]";
    private String codigo = "//input[@placeholder='Código']";
    private String buscar = "//button[contains(@class,'buscar-button') and contains(.,'Buscar')]";
    private String elemento = "/html[1]/body[1]/ion-nav-view[1]/div[1]/div[2]/ion-nav-view[1]/ion-view[1]/ion-content[1]/div[1]/div[2]/div[1]/div[2]";
    private String btaceptar = "//button[contains(@class,'aceptar-button') and @ng-click='cb.doSave()']";
    private String popupAltaAgente = "/html/body/div[4]/div/div[2]";
    private String btCerrarAlerta ="/html/body/div[4]/div/div[3]/button";


    public void opcionConfig() {
        clickElemento(config);
    }

    public void opcionAltaAgente() {
        clickElemento(altaAgente);
    }

    public void ingresarCodigo(String punto) {
        escribir(codigo, punto);
    }

    public void botonBuscar() {
        clickElemento(buscar);
    }

    public ArrayList<String> listaAgentes() {
        return listaElementos(elemento);
        
    }
    public void botonAceptar(){
        clickElemento(btaceptar);
    }
    public String popupAlta(){
         return comparar(popupAltaAgente);
    }

    public String nameAgente(){
        return comparar(elemento);
    }
     public void closeAlerta(){
        clickElemento(btCerrarAlerta);
    }
}
