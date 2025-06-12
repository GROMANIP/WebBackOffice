package backofficefc.pages;


public class Usuarios extends BasePageFc{
    
    public Usuarios() {
        super(driver);
    }
private String nombreUsuario="//*[contains(@class, 'ng-binding') and contains(normalize-space(text()), 'Usuarios')]";
private String digitoNombre= "//input[@placeholder='Buscar por nombres de usuario']";


public void selectUsusario(){
    clickElemento(nombreUsuario);
}
public void escribirNombre(String id){
    escribir(digitoNombre,id);
}
  
}
