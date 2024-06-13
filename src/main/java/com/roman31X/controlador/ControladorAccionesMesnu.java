package com.roman31X.controlador;

import com.roman31X.modelo.Pelicula;
import com.roman31X.servicio.IServicioPelicula;

import java.util.Scanner;

public class ControladorAccionesMesnu {

    public static boolean ejecutarOpciones(Scanner consola, IServicioPelicula iServicioPelicula){

        var opcion = Integer.parseInt(consola.nextLine());

        switch (opcion){
            case 1 -> {
                System.out.print("| Ingrese el nombre de la película: ");
                var nombrePelicula = consola.nextLine();
                iServicioPelicula.agregarPelicula(new Pelicula(nombrePelicula));
            }
            case 2 -> {
                iServicioPelicula.listarPelicula();
            }
            case 3 -> {
                System.out.print("| Ingrese la película a buscar: ");
                var buscarPelicula = consola.nextLine();
                iServicioPelicula.buscarPelicula(new Pelicula(buscarPelicula));
            }
            case 4 -> {
                System.out.println("""
                        |-----------------------------------|
                        |        HASTA PRONTO! 😁👍        |
                        |-----------------------------------|
                        """);
                return true;
            }
            default -> {
                System.out.println("""
                        |-----------------------------------|
                        |  La opción ingresa no es validad  |
                        |         vuelva intentarlo 🤷‍♂️      |
                        |-----------------------------------|""");
            }
        }
        return false;
    }
}
