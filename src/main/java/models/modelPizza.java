package models;

import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class modelPizza {
    String nombrePizza;
    ArrayList<modelTopping> listaIngredientes = new ArrayList<>();
    String tamañoPizza;
    double precio;

    public modelPizza(String nombrePizza, String tamañoPizza, double precio) {
        this.nombrePizza = nombrePizza;
        this.tamañoPizza = tamañoPizza;
        this.precio = precio;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public ArrayList<modelTopping> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<modelTopping> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public String getTamañoPizza() {
        return tamañoPizza;
    }

    public void setTamañoPizza(String tamañoPizza) {
        this.tamañoPizza = tamañoPizza;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
