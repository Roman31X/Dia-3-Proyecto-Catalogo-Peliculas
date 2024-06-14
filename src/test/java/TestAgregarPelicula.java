import com.roman31X.modelo.Pelicula;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestAgregarPelicula {

    private final String NOMBRE_ARCHIVO = "DatosPelicula.txt";

    @Test
    public void registrarPeliculaArchivo(){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

        var nombre = new Pelicula("RED");

        try{

            // Revisamos si existe el archivo
            anexar = archivo.exists();

            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            // Agregar la película con el método (toString)
            salida.println(nombre);

            // Cerramos el archivo
            salida.close();

            System.out.println("| Se agrego la película: ["+nombre+"] al archivo |");

        }catch (Exception e){
            System.out.println("| Ocurrió un error con el archivo!! "+e.getMessage());
        }
    }
}
