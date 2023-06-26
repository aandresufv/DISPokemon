package dis.ufv.pokemonRestAPI.pokemonAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class LectorJSON {
    public ArrayList<Pokemon> leeFicheroJSON(String fichero){
        try {
            //lee el fichero que le pasemos y lo carga en un reader
            FileReader reader = new FileReader(fichero);
            ArrayList<Pokemon> listaPokemons = new Gson().fromJson(reader, new TypeToken<ArrayList<Pokemon>>(){}.getType());
            System.out.println("Lista de pokemons cargada");
            return listaPokemons;
        }catch (Exception e){
            //print stack trace nos muestra el error
            e.printStackTrace();
            System.out.println("Error al leer el fichero JSON");
            return null;
        }
    }
}
