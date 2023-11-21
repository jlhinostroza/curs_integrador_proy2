
package Modelo;

public class PaqueteInfo {
    private String paqID, remitenteNombre, remitenteCiudad, destinatarioCiudad, envID, envFechaSalida, envFechaLlegada, estDescripcion;
    private double paqPeso, paqVolumen;

    public String getPaqID() {
        return paqID;
    }

    public void setPaqID(String paqID) {
        this.paqID = paqID;
    }

    public String getRemitenteNombre() {
        return remitenteNombre;
    }

    public void setRemitenteNombre(String remitenteNombre) {
        this.remitenteNombre = remitenteNombre;
    }

    public String getRemitenteCiudad() {
        return remitenteCiudad;
    }

    public void setRemitenteCiudad(String remitenteCiudad) {
        this.remitenteCiudad = remitenteCiudad;
    }

    public String getDestinatarioCiudad() {
        return destinatarioCiudad;
    }

    public void setDestinatarioCiudad(String destinatarioCiudad) {
        this.destinatarioCiudad = destinatarioCiudad;
    }

    public String getEnvID() {
        return envID;
    }

    public void setEnvID(String envID) {
        this.envID = envID;
    }

    public String getEnvFechaSalida() {
        return envFechaSalida;
    }

    public void setEnvFechaSalida(String envFechaSalida) {
        this.envFechaSalida = envFechaSalida;
    }

    public String getEnvFechaLlegada() {
        return envFechaLlegada;
    }

    public void setEnvFechaLlegada(String envFechaLlegada) {
        this.envFechaLlegada = envFechaLlegada;
    }

    public String getEstDescripcion() {
        return estDescripcion;
    }

    public void setEstDescripcion(String estDescripcion) {
        this.estDescripcion = estDescripcion;
    }

    public double getPaqPeso() {
        return paqPeso;
    }

    public void setPaqPeso(double paqPeso) {
        this.paqPeso = paqPeso;
    }

    public double getPaqVolumen() {
        return paqVolumen;
    }

    public void setPaqVolumen(double paqVolumen) {
        this.paqVolumen = paqVolumen;
    }
    
    
}
