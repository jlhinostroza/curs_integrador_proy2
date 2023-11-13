/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        costo=(ancho*largo*alto)*(1/100);
        costo+=peso*(1/4);
        return costo;
    }
}
