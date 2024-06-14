package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPeliculaLista implements IServicioPelicula{

    private final List<Pelicula> peliculas;

    public ServicioPeliculaLista() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPelicula() {
        if(!peliculas.isEmpty()){
            System.out.println("|----LISTADO DE PELÍCULA----|");
            peliculas.forEach(System.out::println);
        }else{
            System.out.println("|----LISTADO DE PELÍCULA VACÍA DEBE REGISTRAR PRIMERO----|");
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    @Override
    public void buscarPelicula(Scanner consola) {

        if(!peliculas.isEmpty()){
            System.out.print("| Ingrese la película a buscar: ");
            var buscarPelicula = consola.nextLine();
            var indice = peliculas.indexOf(new Pelicula(buscarPelicula));
            if(indice == -1){
                System.out.println("| No se encontró la película: "+buscarPelicula);
            }else{
                System.out.println("|--------Película se encontró------|");
                System.out.println("| Localizada en el indice: ["+indice+"]");
            }
        }else{
            System.out.println("|----LISTADO DE PELÍCULA VACÍA DEBE REGISTRAR PRIMERO----|");
        }
    }
}
