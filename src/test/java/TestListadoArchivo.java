import com.roman31X.modelo.Pelicula;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestListadoArchivo {

    private final String NOMBRE_ARCHIVO = "DatosPelicula.txt";

    @Test
    public void listarPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            //abrimos el archivo y lo preparamos para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            //variable para capturar la información de la línea
            String linea;

            //inicializamos la primera lectura y capturaos su contenido
            linea = entrada.readLine();

            if(linea != null){
                System.out.println("""
                        |----------------------------------|
                        |  Datos recuperados del archivo   |
                        |----------------------------------|""");
                //ciclo para leer todas las líneas del archivo
                while (linea != null){
                    var pelicula = new Pelicula(linea);
                    System.out.println("| "+pelicula);

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
}
