package org.example.Elemeto;

import org.example.Elemeto.Elemento;

public class ElementoSimple implements Elemento {
    private double precio;
    private int codigo;

    public ElementoSimple(double precio, int codigo){
        this.precio = precio;
        this.codigo = codigo;
    }
    @Override
    public double getPrecio(){
        return precio;
    }
}
