package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculaLista implements IServicioPelicula{

    private final List<Pelicula> peliculas;

    public ServicioPeliculaLista(List<Pelicula> peliculas) {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPelicula() {
        System.out.println("|----LISTADO DE PELÍCULA----|");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var indice = peliculas.indexOf(pelicula);
        if(indice == -1){
            System.out.println("| No se encontró la película: "+pelicula);
        }else{
            System.out.println("|----Película encontrada----|");
        }
    }
}
