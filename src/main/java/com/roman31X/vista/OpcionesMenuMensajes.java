package com.roman31X.vista;

public class OpcionesMenuMensajes {

    public static void mostarMenu(){
        System.out.println("""
                |--------------------------|
                |  CATALOGO DE PELÍCULAS   |
                |--------------------------|
                |  [1] - Agregar Película  |
                |  [2] - Listar Película   |
                |  [3] - Buscar Película   |
                |  [4] - Salir Película    |
                |--------------------------|
                """);
        System.out.print("| Ingrese una opción: ");
    }
}
