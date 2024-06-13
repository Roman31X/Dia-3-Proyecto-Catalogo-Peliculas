package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

public interface IServicioPelicula {

    public void listarPelicula();

    public void agregarPelicula(Pelicula pelicula);

    public void buscarPelicula(Pelicula pelicula);

}
