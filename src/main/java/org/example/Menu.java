package org.example;

import org.example.Elemento1.Elemento1factory;
import org.example.Elemento2.Elemento2factory;
import org.example.Elemeto.Elemento;
import org.example.Factory.ElementoFactory;
import org.example.Kit.Kit;

public class Menu {
    public static void Menu() {

        ElementoFactory fabricaelemento1 = new Elemento1factory();
        Elemento elemento1 = fabricaelemento1.createElemento(10, 1);
        ElementoFactory fabricaelemento2 = new Elemento2factory();
        Elemento elemento2 = fabricaelemento2.createElemento(20, 2);
        Kit kit = new Kit(1);
        kit.add(elemento1);
        kit.add(elemento2);
        System.out.println("El precio del kit es: " + kit.getPrecio());

    }

}
