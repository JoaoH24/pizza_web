package models;

/**
 *
 * @author joao
 */
public class modelTopping {
    String nombreTopping;
    String tipoTopping;
    int cantidadTopping;
    double precioTopping;

    public modelTopping(String nombreTopping, String tipoTopping, int cantidadTopping, double precioTopping) {
        this.nombreTopping = nombreTopping;
        this.tipoTopping = tipoTopping;
        this.cantidadTopping = cantidadTopping;
        this.precioTopping = precioTopping;
    }

    public String getNombreTopping() {
        return nombreTopping;
    }

    public void setNombreTopping(String nombreTopping) {
        this.nombreTopping = nombreTopping;
    }

    public String getTipoTopping() {
        return tipoTopping;
    }

    public void setTipoTopping(String tipoTopping) {
        this.tipoTopping = tipoTopping;
    }

    public int getCantidadTopping() {
        return cantidadTopping;
    }

    public void setCantidadTopping(int cantidadTopping) {
        this.cantidadTopping = cantidadTopping;
    }

    public double getPrecioTopping() {
        return precioTopping;
    }

    public void setPrecioTopping(double precioTopping) {
        this.precioTopping = precioTopping;
    }
    
    
}
