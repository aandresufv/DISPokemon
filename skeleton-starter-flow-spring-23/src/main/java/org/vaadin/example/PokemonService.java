package org.vaadin.example;
import java.io.Serializable;
import org.springframework.stereotype.Service;
@Service
public class PokemonService implements Serializable {
    public String leePokemon(String tipoPeticion) {
        return "Hello " + tipoPeticion;
    }
}