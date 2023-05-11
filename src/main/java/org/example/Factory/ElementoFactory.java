package org.example.Factory;

import org.example.Elemeto.Elemento;

public interface ElementoFactory {
    Elemento createElemento(double precio, int codigo);

}
