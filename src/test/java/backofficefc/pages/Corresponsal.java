package backofficefc.pages;


public class Corresponsal extends BasePageFc {
    public Corresponsal() {
        super(driver);
    }
    String opcionCorresponsal= "//*[@class='bm-icon icon-corresponsales']";
    String opcionBusqueda= "//*[contains(@class, 'ng-binding') and contains(normalize-space(text()), 'Busqueda')]";
    String opcionFiltros= "//div[normalize-space()='Filtros']";
    String ingresoPunto= "//*[contains(@class, 'form-control-small')]";
    String buscamos= "//*[contains(@class, 'ok-button') and normalize-space(text())='Buscar']";

    public void clickCorresponsal(String corres){
            // Reemplaza el marcador de posicion en recursoClick con nombre
        try {
            String XpathOpcion = String.format(opcionCorresponsal, corres);
            clickElemento(XpathOpcion);

        } catch (Exception e) {
            System.out.println("No encuentra el LOCATOR ********");
            e.printStackTrace();

        }

        // TODO: handle exception
    }

    public void busear(){
    clickElemento(opcionBusqueda);
    }

    public void filtrar(){
    clickElemento(opcionFiltros);

    }
    public void digitoPunto(String punto){
    escribir(ingresoPunto,punto);

    }
     public void sourcePunto(){
    clickElemento(buscamos);

    }

}



