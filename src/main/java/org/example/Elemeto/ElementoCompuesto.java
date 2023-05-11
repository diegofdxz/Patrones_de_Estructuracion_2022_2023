package org.example.Elemeto;

import org.example.Elemeto.Elemento;

public interface ElementoCompuesto extends Elemento {
    void add(Elemento elemento);
    void remove(Elemento elemento);
}
