
package Entrega04;

public final class SmartPhone extends SmartDevice{
       
    private String color;
    private String fichaCargador;

    public SmartPhone() {
    }

    public SmartPhone(String color, String fichaCargador) {
        this.color = color;
        this.fichaCargador = fichaCargador;
    }

    public SmartPhone(String color, String fichaCargador, String marca, String modelo, int numeroSerie, int anio, String paisFabricacion) {
        super(marca, modelo, numeroSerie, anio, paisFabricacion);
        this.color = color;
        this.fichaCargador = fichaCargador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFichaCargador() {
        return fichaCargador;
    }

    public void setFichaCargador(String fichaCargador) {
        this.fichaCargador = fichaCargador;
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
        return super.toString() + "SmartPhone{" + "color=" + color + ", fichaCargador=" + fichaCargador + '}';
    }
    
    
        
}
