package org.example.Elemento2;

import org.example.Factory.ElementoFactory;
import org.example.Elemeto.Elemento;
import org.example.Elemeto.ElementoSimple;

public class Elemento2factory implements ElementoFactory {
    public Elemento createElemento(double precio, int codigo) {
        return new ElementoSimple(precio, codigo);
    }
}
