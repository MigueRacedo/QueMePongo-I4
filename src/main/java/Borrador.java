package main.java;
import java.util.Objects;

public class Borrador {

    TipoDePrenda tipoDePrenda;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama;

    public void especificarTipo(TipoDePrenda tipoDePrenda){
        this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda, "El tipo de prenda es obligatorio");
    }

    public void especificarMaterial(Material material){
        this.material = Objects.requireNonNull(material, "El material es obligatorio");
    }

    public void especificarColorPrincipal(Color colorPrincipal){
        this.colorPrincipal = Objects.requireNonNull(colorPrincipal, "El color principal es obligatorio");
    }

    public void especificarColorSecundario(Color colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    public void especificarTrama(Trama trama){
        if (trama == null){
            this.trama = Trama.LISA;
        }
        else this.trama = trama;
    }

    public Prenda crearPrenda(){
        return new Prenda(tipoDePrenda, material, colorPrincipal, colorSecundario, trama);
    }
}
