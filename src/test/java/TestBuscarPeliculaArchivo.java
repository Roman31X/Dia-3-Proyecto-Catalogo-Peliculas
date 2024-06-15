import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBuscarPeliculaArchivo {

    private final String NOMBRE_ARCHIVO = "DatosPelicula.txt";

    @Test
    public void buscarPeliculaArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);
        try{

            //Abrimos el archivo para lectura linea a linea
            var lectura = new BufferedReader(new FileReader(archivo));
            String lineaTexto;

            //Primera lectura para ingresar en el bucle
            lineaTexto = lectura.readLine();
            var indice = 1;
            var encontrada = false;

            if(lineaTexto != null){
                var peliculaBuscar = "Batman";
                while (lineaTexto != null){
                    //Buscamos sin importar mayúscula ni minúsculas
                    if(peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                        encontrada = true;
                        break;
                    }

                    //Leemos la siguiente línea antes de la siguiente iteración
                    lineaTexto = lectura.readLine();
                    indice++;
                }
                if(encontrada){
                    System.out.println("| Se encontró la película: ["+lineaTexto+"] en el indice: ["+indice+"]");
                }else{
                    System.out.println("| No se encontró la película: ["+peliculaBuscar+"]");
                }
            }else{
                System.out.println("""
                        |----------------------------------|
                        |  El archivo se encuentra vacío   |
                        |    Debe de registrar primero     |
                        |----------------------------------|
                        """);
            }

            //Cerramos la lectura del archivo
            lectura.close();

        }catch (Exception e){
            System.out.println("| Ocurrió un error al buscar en el archivo!! "+e.getMessage());
        }
    }
}
