package org.example.Kit;

import org.example.Elemeto.Elemento;
import org.example.Elemeto.ElementoCompuesto;

import java.util.ArrayList;
import java.util.List;

public class Kit implements ElementoCompuesto {
    private int codigo;
    List<Elemento> elementos = new ArrayList<Elemento>();
    public Kit(int codigo){
        this.codigo = codigo;
    }

    public void add(Elemento elemento){
        elementos.add(elemento);
    }
    public void remove(Elemento elemento){
        elementos.remove(elemento);
    }
    @Override
    public double getPrecio(){
        double precio = 0;
        for(Elemento elemento : elementos){
            precio += elemento.getPrecio();
        }
        return precio;
    }
}
