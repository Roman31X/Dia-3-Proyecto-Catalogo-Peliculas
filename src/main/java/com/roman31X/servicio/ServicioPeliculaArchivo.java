package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ServicioPeliculaArchivo implements IServicioPelicula{

    private final String NOMBRE_ARCHIVO = "DatosPelicula.txt";

    public ServicioPeliculaArchivo() {
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            if(archivo.exists()){
                System.out.println("| Existe un Archivo con Datos de Película |");
            }else{
                var crear = new PrintWriter(new FileWriter(archivo));
                crear.close();
                System.out.println("| Se a creado un Archivo con Datos de Película |");
            }
        }catch (Exception e){
            System.out.println("| Ocurrio un error al abrir el archivo!! "+e.getMessage());
        }
    }

    @Override
    public void listarPelicula() {

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {

    }

    @Override
    public void buscarPelicula(Scanner consola) {

    }
}
