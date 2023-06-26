package dis.ufv.pokemonRestAPI.pokemonAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class LectorJSON {
    public ArrayList<Pokemon> leeFicheroJSON(String fichero){
        try {
            //lee el fichero que le pasemos y lo carga en un reader
            Reader reader = Files.newBufferedReader(Paths.get(fichero));
            //convierte el array JSON a un arraylist de users
            ArrayList<Pokemon> listaPokemon =
                    new Gson().fromJson(reader, new TypeToken<ArrayList<Pokemon>>(){}.getType());
            reader.close(); //cerramos el reader
            return listaPokemon; //devolvemos el arraylist

        }catch (Exception ex){
            ex.printStackTrace();
            return new ArrayList<>(); //devolvemos un arraylist vacio
        }
    }
}
