
package Clases;

public class Operaciones {
    float ancho, largo, alto, peso;
    float costo;
    String sancho, slargo, salto, speso;

    public boolean EsNumerico(String sancho,String slargo,String salto,String speso){
        try {
            Float.parseFloat(sancho);
            Float.parseFloat(slargo);
            Float.parseFloat(salto);
            Float.parseFloat(speso);
            this.sancho=sancho;
            this.slargo=slargo;
            this.salto=salto;
            this.speso=speso;
            setConvertir();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void setConvertir(){
        this.ancho=Float.parseFloat(sancho);
        this.largo=Float.parseFloat(slargo);
        this.alto=Float.parseFloat(salto);
        this.peso=Float.parseFloat(speso);
    }
    public float getCotizacion(){
        costo=(float) ((ancho*largo*alto)*(1.0/100.0));
        costo+=peso*(1.0/4.0);
        return costo;
    }
}
