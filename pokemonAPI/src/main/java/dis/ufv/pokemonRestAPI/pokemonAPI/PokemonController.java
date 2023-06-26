package dis.ufv.pokemonRestAPI.pokemonAPI;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
@RestController
public class PokemonController {
    @GetMapping("/pokemons")
    public  ArrayList<Pokemon> pokemons(){
        ArrayList<Pokemon> listaPokemons = new LectorJSON().leeFicheroJSON();
        return  listaPokemons;
    }
}
