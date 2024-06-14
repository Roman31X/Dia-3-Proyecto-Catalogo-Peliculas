package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

import java.util.Scanner;

public interface IServicioPelicula {

    public void listarPelicula();

    public void agregarPelicula(Pelicula pelicula);

    public void buscarPelicula(Scanner consola, Pelicula pelicula);

}
