package com.roman31X.servicio;

import com.roman31X.modelo.Pelicula;

import java.io.*;
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

        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            //abrimos el archivo y lo preparamos para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            //variable para capturar la información de la línea
            String linea;

            //inicializamos la primera lectura y capturaos su contenido
            linea = entrada.readLine();

            if(linea != null){
                System.out.println("|  Datos recuperados del archivo   |");
                //ciclo para leer todas las líneas del archivo
                while (linea != null){
                    var pelicula = new Pelicula(linea);
                    System.out.println(pelicula);

                    //lectura de línea de archivo para verificar si no hay más información
                    linea = entrada.readLine();
                }
            }else{
                System.out.println("""
                        |----------------------------------|
                        |  El archivo se encuentra vacío   |
                        |    Debe de registrar primero     |
                        |----------------------------------|
                        """);
            }
            //cerrar el archivo al término de lectura
            entrada.close();
        }catch (Exception e){
            System.out.println("| Ocurrió un problema con el archivo!! "+e.getMessage());
        }


    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        // Abrimos el archivo para concatenar información y
        // no e suna nueva escritura

        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

        try{

            // Revisamos si existe el archivo
            anexar = archivo.exists();

            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            // Agregar la película con el método (toString)
            salida.println(pelicula);

            // Cerramos el archivo
            salida.close();

            System.out.println("| Se agrego la película: ["+pelicula+"] al archivo |");

        }catch (Exception e){
            System.out.println("| Ocurrió un error con el archivo!! "+e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(Scanner consola) {

    }
}
