package models;

/**
 *
 * @author joao
 */
public class modelOrden {
    String idOrden;
    modelCliente ordenCliente;
    modelPizza listaPizza;
    String direcciónCliente;
    double montoTotal;

    public modelOrden(String idOrden, modelCliente ordenCliente, modelPizza listaPizza, String direcciónCliente, double montoTotal) {
        this.idOrden = idOrden;
        this.ordenCliente = ordenCliente;
        this.listaPizza = listaPizza;
        this.direcciónCliente = direcciónCliente;
        this.montoTotal = montoTotal;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public modelCliente getOrdenCliente() {
        return ordenCliente;
    }

    public void setOrdenCliente(modelCliente ordenCliente) {
        this.ordenCliente = ordenCliente;
    }

    public modelPizza getListaPizza() {
        return listaPizza;
    }

    public void setListaPizza(modelPizza listaPizza) {
        this.listaPizza = listaPizza;
    }

    public String getDirecciónCliente() {
        return direcciónCliente;
    }

    public void setDirecciónCliente(String direcciónCliente) {
        this.direcciónCliente = direcciónCliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
}
