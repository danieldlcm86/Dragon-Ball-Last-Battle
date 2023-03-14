package java.com.dragolBallLastBattle.Person;

import java.com.dragolBallLastBattle.game.Jugador;
import java.com.dragolBallLastBattle.game.Personaje;

public class Goku extends Jugador {
    private String nombreTecnica = "Kame Hame Ha";
    private String nombreTecnicaEspecial = "Kaio Ken";

    public Goku(String nombre, Personaje personaje, String nombreTecnica, String nombreTecnicaEspecial) {
        super(nombre, personaje);
        this.nombreTecnica = nombreTecnica;
        this.nombreTecnicaEspecial = nombreTecnicaEspecial;
    }

    public void lanzarTecnica(){

    }

    public void lanzarTecnicaEspecial(){

    }

    @Override
    public void recibirGolpe() {
        super.recibirGolpe();
    }

    @Override
    public void recibirPatada() {
        super.recibirPatada();
    }

    @Override
    public void recibirTecnicaFrecuente() {
        super.recibirTecnicaFrecuente();
    }

    @Override
    public void recibirTecnicaEspecial() {
        super.recibirTecnicaEspecial();
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void defenderTecnicaFrecuente() {
        super.defenderTecnicaFrecuente();
    }

    @Override
    public void defenderTecnicaEspecial() {
        super.defenderTecnicaEspecial();
    }
}
