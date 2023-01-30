
package Entrega04;

public abstract class SmartDevice {
    
    protected String marca;
    protected String modelo;
    protected int numeroSerie;
    protected int anio;
    protected String paisFabricacion;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, int numeroSerie, int anio, String paisFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.anio = anio;
        this.paisFabricacion = paisFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPaisFabricacion() {
        return paisFabricacion;
    }

    public void setPaisFabricacion(String paisFabricacion) {
        this.paisFabricacion = paisFabricacion;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", anio=" + anio + ", paisFabricacion=" + paisFabricacion + '}';
    }
    
    
}
