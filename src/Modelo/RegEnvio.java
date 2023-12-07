
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegEnvio {
    private String remCiudad, remDepartamento, desCiudad, desDepartamento, descripcion, desNombre, desCorreo, envioID, remID, desID, facID;
    private float peso, volumen, valor, costo;
    private int desNumero, desDNI, metPago, estadoEnvio;        

    public String getRemCiudad() {
        return remCiudad;
    }

    public void setRemCiudad(String remCiudad) {
        this.remCiudad = remCiudad;
    }

    public String getRemDepartamento() {
        return remDepartamento;
    }

    public void setRemDepartamento(String remDepartamento) {
        this.remDepartamento = remDepartamento;
    }

    public String getDesCiudad() {
        return desCiudad;
    }

    public void setDesCiudad(String desCiudad) {
        this.desCiudad = desCiudad;
    }

    public String getDesDepartamento() {
        return desDepartamento;
    }

    public void setDesDepartamento(String desDepartamento) {
        this.desDepartamento = desDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesNombre() {
        return desNombre;
    }

    public void setDesNombre(String desNombre) {
        this.desNombre = desNombre;
    }

    public String getDesCorreo() {
        return desCorreo;
    }

    public void setDesCorreo(String desCorreo) {
        this.desCorreo = desCorreo;
    }

    public static String getFecha() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fechaActual);
        
        return fechaFormateada;
    }
    
    public static String getFechaLlegada(){
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date fechaMasTresDias = calendar.getTime();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fechaMasTresDias);

        return fechaFormateada;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float ancho, float largo, float alto) {
        volumen = ancho * largo * alto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCosto(float ancho, float largo, float alto) {
        costo=(float) ((ancho*largo*alto)*(1.0/100.0));
        costo+=peso*(1.0/4.0);
    }
    
    public float getCosto(){
        return costo;
    }

    public int getDesNumero() {
        return desNumero;
    }

    public void setDesNumero(int desNumero) {
        this.desNumero = desNumero;
    }

    public int getDesDNI() {
        return desDNI;
    }

    public void setDesDNI(int desDNI) {
        this.desDNI = desDNI;
    }

    public int getMetPago() {
        return metPago;
    }

    public void setMetPago(int metPago) {
        this.metPago = metPago;
    }

    public int getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(int estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getEnvioID() {
        return envioID;
    }

    public void setEnvioID(String envioID) {
        this.envioID = envioID;
    }

    public String getRemID() {
        return remID;
    }

    public void setRemID(String remID) {
        this.remID = remID;
    }

    public String getDesID() {
        return desID;
    }

    public void setDesID(String desID) {
        this.desID = desID;
    }

    public String getFacID() {
        return facID;
    }

    public void setFacID(String facID) {
        this.facID = facID;
    }
    
    
}
