package org.example;

import org.example.Elemento1.Elemento1factory;
import org.example.Elemento2.Elemento2factory;
import org.example.Elemeto.Elemento;
import org.example.Factory.ElementoFactory;
import org.example.Kit.Kit;

import java.util.Scanner;

public class Menu {
    Elemento elemento1 = null;
    Elemento elemento2 = null;
    public void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al menu de kits");
        int opcion = 0;
        while (!(opcion ==3)) {
            System.out.println("1. Crear elemento");
            System.out.println("2. Crear kit");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del elemento (1 o 2)");
                    int codigo = sc.nextInt();

                    switch (codigo) {
                        case 1:
                            System.out.println("Ingrese el precio del elemento");
                            double precio = sc.nextDouble();
                            ElementoFactory fabricaelemento1 = new Elemento1factory();
                            elemento1 = fabricaelemento1.createElemento(precio, 1);
                            break;
                        case 2:
                            System.out.println("Ingrese el precio del elemento");
                            double precio2 = sc.nextDouble();
                            ElementoFactory fabricaelemento2 = new Elemento2factory();
                            elemento2 = fabricaelemento2.createElemento(precio2, 2);
                            break;
                    }
                    ;
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del kit");
                    int codigoKit = sc.nextInt();
                    Kit kit = new Kit(codigoKit);
                    kit.add(elemento1);
                    kit.add(elemento2);
                    System.out.println("El precio del kit es: " + kit.getPrecio());

                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }


    }

}
