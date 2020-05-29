package main.java;

public class Uniforme {

    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calsado;

    public Uniforme (Prenda prendaSuperior, Prenda prendaInferior, Prenda calsado){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calsado = calsado;
    }

    static void fabricar(Sastre sastre){
        new Uniforme(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
    }
}