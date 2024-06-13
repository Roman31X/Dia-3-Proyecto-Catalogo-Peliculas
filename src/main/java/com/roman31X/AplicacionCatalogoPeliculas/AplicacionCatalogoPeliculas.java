package com.roman31X.AplicacionCatalogoPeliculas;

import com.roman31X.servicio.IServicioPelicula;
import com.roman31X.servicio.ServicioPeliculaArchivo;
import com.roman31X.servicio.ServicioPeliculaLista;
import java.util.Scanner;

import static com.roman31X.controlador.ControladorAccionesMesnu.ejecutarOpciones;
import static com.roman31X.vista.OpcionesMenuMensajes.mostarMenu;

public class AplicacionCatalogoPeliculas {
    public static void main(String[] args) {

        var salir = false;
        var consola = new Scanner(System.in);

        // Línea para prueba de acción de REGISTRAR - LISTAR - BUSCAR
        //IServicioPelicula servicioPelicula = new ServicioPeliculaLista();

        // Línea para implementar funcionalidad con archivo.txt
        IServicioPelicula servicioPelicula = new ServicioPeliculaArchivo();

        while (!salir){

            try {

                mostarMenu();
                salir = ejecutarOpciones(consola, servicioPelicula);

            }catch (Exception e){
                System.out.println("| Ocurrió un error: "+e.getMessage());
            }
            System.out.println();
        }

    }
}
