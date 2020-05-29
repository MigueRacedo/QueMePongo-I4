package main.java;
import static java.util.Objects.requireNonNull;

public class Color {

    int nivelRojo;
    int nivelVerde;
    int nivelAzul;

    public Color(int nivelRojo, int nivelVerde, int nivelAzul){
        this.nivelRojo = requireNonNull(nivelRojo, "el nivel de rojo es obligatorio");
        this.nivelVerde = requireNonNull(nivelVerde, "el nivel de verde es obligatorio");
        this.nivelAzul = requireNonNull(nivelAzul, "elnivel de azul es obligatorio");
    }
}
