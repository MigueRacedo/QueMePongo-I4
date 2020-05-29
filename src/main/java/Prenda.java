package main.java;
import static java.util.Objects.requireNonNull;

public class Prenda {

    TipoDePrenda tipoDePrenda;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama;
    int nivelDeAbrigo;

    public Prenda (TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario, Trama trama) {
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "el tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "el material es obligatorio");
        this.colorPrincipal = requireNonNull(colorPrincipal, "el color principal es obligatorio");
        this.colorSecundario = colorSecundario;
        this.trama = requireNonNull(trama, "la trama es obligatorio");
    }

    public Categoria categoria(){
        return tipoDePrenda.categoria();
    }
}
