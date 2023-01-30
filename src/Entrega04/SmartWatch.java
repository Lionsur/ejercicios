
package Entrega04;

public final class SmartWatch extends SmartDevice{
    
    private String sistemaOperativo;
    private String color;

    public SmartWatch() {
    }

    public SmartWatch(String sistemaOperativo, String color) {
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
    }

    public SmartWatch(String sistemaOperativo, String color, String marca, String modelo, int numeroSerie, int anio, String paisFabricacion) {
        super(marca, modelo, numeroSerie, anio, paisFabricacion);
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return super.toString() + "SmartWatch{" + "sistemaOperativo=" + sistemaOperativo + ", color=" + color + '}';
    }

    

    
    
    
}
