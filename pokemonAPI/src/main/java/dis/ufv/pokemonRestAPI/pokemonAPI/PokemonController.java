package dis.ufv.pokemonRestAPI.pokemonAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
@RestController
public class PokemonController {
    @GetMapping("/pokemon/porNombre/{nombre}")
    public ResponseEntity<Pokemon> getPorNombre(@PathVariable String nombre){
        ArrayList<Pokemon> listaPokemons = new LectorJSON().leeFicheroJSON("./src/main/java/resources/pokemonConId.json");
        Pokemon encontrado = null;
        for (Pokemon pokemon: listaPokemons) {
            if (pokemon.getName().equalsIgnoreCase(nombre)){
                encontrado = pokemon;
            }
        }
        return new ResponseEntity<>(encontrado, HttpStatus.OK);
    }
    @GetMapping("/pokemon/porTipo/{tipo}")
    public ArrayList<Pokemon> getPorTipo(@PathVariable String tipo){
        ArrayList<Pokemon> listaPokemons = new LectorJSON().leeFicheroJSON("./src/main/java/resources/pokemonConId.json");
        ArrayList<Pokemon> encontrados = new ArrayList<>();
        for (Pokemon pokemon: listaPokemons) {
            if (pokemon.getTipo1().equalsIgnoreCase(tipo) || pokemon.getTipo2().equalsIgnoreCase(tipo)){
                encontrados.add(pokemon);
            }
        }
        return encontrados;
    }
}
