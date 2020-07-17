/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proveedor_ruedaestefany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estefany Rueda
 */
public class main {

    public static void main(String[] args) {
        //Lista en donde se almacenan los diferentes proveedores
        ArrayList<Proveedor> listaProveedores = new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {

            //menu de opciones
            System.out.println("Por favor, Ingrese una opción: ");
            System.out.println("1. Agregar nuevo proveedor");
            System.out.println("2. Actualizar nombre de la ciudad de un proveedor");
            System.out.println("3. Actualizar número de artículos de un proveedor");
            System.out.println("4. Informe de un proveedor");
            System.out.println("5. Eliminar proveedor");
            System.out.println("6. Salir");
            int entrada = Integer.parseInt(lectura.nextLine());
            //Dependiendo de la opción que se ingrese se ejecutará el caso correspondiente
            switch (entrada) {
                case 1:
                    //agregar nuevo proveedor
                    //Instancia nuevo proveedor
                    Proveedor prov = new Proveedor();
                    //Se pide que ingrese los diferentes datos del proveedor
                    System.out.println("Ingrese el nombre del nuevo proveedor: ");
                    String nNombre = lectura.nextLine();
                    prov.setNombre(nNombre);
                    System.out.println("Ingrese la ciudad del proveedor: ");
                    String nCiudad = lectura.nextLine();
                    prov.setCiudad(nCiudad);
                    System.out.println("Ingrese el número de artículos que posee el proveedor: ");
                    int nNumArt = Integer.parseInt(lectura.nextLine());
                    prov.setNumeroArticulos(nNumArt);
                    //al final se agrega el nuevo proveedor a la lista con sus respectivos datos.
                    listaProveedores.add(prov);

                    System.out.println("---NUEVO PROVEEDOR AGREGADO---");
                    System.out.println("Nombre: " + prov.getNombre());
                    System.out.println("Ciudad: " + prov.getCiudad());
                    System.out.println("Número de Artículos: " + prov.getNumeroArticulos());

                    break;

                case 2:
                    //Actualizar ciudad
                    System.out.println("Ingrese el nombre del proveedor");
                    String n = lectura.nextLine();
                    //nuevamente se realiza la "Busqueda"
                    for (int i = 0; i < listaProveedores.size(); i++) {
                        Proveedor p = listaProveedores.get(i);
                        if (n.equals(p.getNombre())) {
                            System.out.println("Nombre: " + p.getNombre());
                            System.out.println("Ciudad: " + p.getCiudad());
                            //Se recopila la nueva ciudad
                            System.out.println("Ingrese el nombre de la nueva ciudad: ");
                            String nuevaCiudad = lectura.nextLine();
                            //cambio de ciudad
                            p.setCiudad(nuevaCiudad);
                            System.out.println("---Se actualizó la ciudad del proveedor---");
                        }

                    }
                    break;
                case 3:
                    //Actualizar numero Artículos
                    System.out.println("Ingrese el nombre del proveedor");
                    String n2 = lectura.nextLine();
                    for (int i = 0; i < listaProveedores.size(); i++) {
                        Proveedor p2 = listaProveedores.get(i);
                        if (n2.equals(p2.getNombre())) {
                            System.out.println("Nombre: " + p2.getNombre());
                            System.out.println("Número Artículos: " + p2.getNumeroArticulos());
                            //Se recopila la nueva informacion sobre los articulos
                            System.out.println("Ingrese el número de artículos: ");
                            int nArticulos = Integer.parseInt(lectura.nextLine());
                            //cambio de numero artículos segun + o -
                            int disp = p2.getNumeroArticulos();

                            if (nArticulos > 0) {
                                p2.setNumeroArticulos(disp + nArticulos);
                            } else {
                                p2.setNumeroArticulos(nArticulos + disp);

                            }

                            System.out.println("---Se actualizó el número de artículos del proveedor---");
                        }

                    }
                    break;
                case 4:
                    //informe de un proveedor
                    System.out.println("Ingrese el nombre del proveedor: ");
                    String n3 = lectura.nextLine();
                    //Se realiza la "busqueda" en el arrayList en nombre que se ingresó
                    for (int i = 0; i < listaProveedores.size(); i++) {
                        Proveedor p3 = listaProveedores.get(i);
                        if (n3.equals(p3.getNombre())) {
                            System.out.println("---Informe de Proveedor---");
                            System.out.println("Nombre: " + p3.getNombre());
                            System.out.println("Ciudad: " + p3.getCiudad());
                            System.out.println("Número de Artículos: " + p3.getNumeroArticulos());

                        }

                    }
                    break;
                case 5:
                    //Dar de baja a un proveedor
                    System.out.println("Ingrese el nombre del nuevo proveedor: ");
                    String n4 = lectura.nextLine();
                    for (int i = 0; i < listaProveedores.size(); i++) {
                        Proveedor p4 = listaProveedores.get(i);
                        if (n4.equals(p4.getNombre())) {
                            //se elimina de la lista
                            listaProveedores.remove(i);
                            System.out.println("---Se eliminó el Proveedor---");
                        }

                    }
                    break;
                case 6:
                    //salir del programa
                    salir = true;
                    break;
            }
        }
    }

}
