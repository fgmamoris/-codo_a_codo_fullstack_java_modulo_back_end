/*
 * Crear un programa en java en el cual se pida al usuario ingresar su nombre, 
 * apellido, edad, hobbie, editor de código preferido, sistema operativo que
 * utiliza, luego deberá mostrarse por consola los datos ingresados.
 */
package com.fullstackjava.actividad_obligatoria_unidad_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class ActividadObligatoriaUnidad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "", apellido = "", hobbie = "", editorDeTexto = "", sistemaOperativo = "";
        int opcion = 0, edad = 0;
        String editoresDeTexto[] = {"Notepad++",
            "Sublime Text",
            "Atom",
            "Ultraedit",
            "Vim",
            "CoffeeCup",
            "Komodo Edit",
            "TextMate",
            "Visual Studio Code",
            "BBEdit",
            "Otro"
        };
        String sistemasOperativos[] = {"Windows",
            "Mac OS",
            "Unix",
            "Solaris",
            "FreeBSD",
            "OpenBSD",
            "Chrome OS (GNU/Linux)",
            "Ubuntu",
            "Otro"
        };

        //Scan nombre
        do {
            System.out.println("Por favor ingresar nombre:");
            nombre = sc.nextLine();
            if (nombre.length() < 3) {
                System.out.println("Debe ingresar un nombre con al menos 3 caracteres");
            }
        } while (nombre.length() < 3);
        //Scan apellido
        do {
            System.out.println("Por favor ingresar apellido:");
            apellido = sc.nextLine();
            if (apellido.length() < 3) {
                System.out.println("Debe ingresar un apellido con al menos 3 caracteres");
            }
        } while (apellido.length() < 3);
//Scan edad
        do {
            System.out.println("Por favor ingresar edad:");
            try {
                edad = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException exception) {
                sc.nextLine();
                System.out.println("Debe ingresar una edad válida");
            }
            if (edad <= 0) {
                System.out.println("La edad ingresada debe ser positiva y mayor a cero\n");
            }
        } while (edad <= 0);
        /*
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
            } else {
                System.out.println("Debe ingresar una edad válida");  
                sc.nextLine();
            }
         */

        //Scan Hobbie
        do {
            System.out.println("Por favor ingresar un hobbie:");
            hobbie = sc.nextLine();
            if (hobbie.isEmpty()) {
                System.out.println("Debe ingresar al menos un caracter");
            }
        } while (hobbie.isEmpty());
        //Scan editor de texto
        do {
            System.out.println("Por favor seleccione el editor de texto utilizado:");
            for (int i = 0; i < editoresDeTexto.length; i++) {
                System.out.println((i + 1) + " - " + editoresDeTexto[i]);
            }
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion > 0 && opcion < 12) {
                    editorDeTexto = editoresDeTexto[opcion - 1];
                } else {
                    System.out.println("Debe ingresar una opcion v\u00e1lida!!!!\nOpciones disponibles del 1 al 11");
                }
            } else {
                sc.nextLine();
                System.out.println("Debe ingresar una opcion v\u00e1lida!!!!\nOpciones disponibles del 1 al 11");
            }
        } while (editorDeTexto.isEmpty());
        opcion = 0;
        //Scan sistema operativo
        do {
            System.out.println("Por favor seleccione un sistema operativo utilizado:");
            for (int i = 0; i < sistemasOperativos.length; i++) {
                System.out.println((i + 1) + " - " + sistemasOperativos[i]);
            }
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion > 0 && opcion < 10) {
                    sistemaOperativo = sistemasOperativos[opcion - 1];
                } else {
                    System.out.println("Debe ingresar una opcion v\u00e1lida!!!!.\nOpciones disponibles del 1 al 9");
                }
            } else {
                sc.nextLine();
                System.out.println("Debe ingresar una opcion v\u00e1lida!!!!.\nOpciones disponibles del 1 al 9");
            }
        } while (sistemaOperativo.isEmpty());

        System.out.println("=============================================");
        System.out.println("============= Ficha personal =============");
        System.out.println("==== Nombre: " + nombre);
        System.out.println("==== Apellido: " + apellido);
        System.out.println("==== Edad: " + edad);
        System.out.println("==== Hobbie: " + hobbie);
        System.out.println("==== Editor de texto preferido: " + editorDeTexto);
        System.out.println("==== Sistema operativo preferido: " + sistemaOperativo);
        System.out.println("=============================================");
    }

}
