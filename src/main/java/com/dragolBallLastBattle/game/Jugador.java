package java.com.dragolBallLastBattle.game;

public class Jugador {
    private String nombre;
    private Personaje personaje;
    private int puntosVida;

    public Jugador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.puntosVida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public boolean estaDerrotado(){
        return puntosVida <= 0;
    }

    //Métodos
    public void recibirGolpe() {
        this.puntosVida -= 1;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public void recibirPatada() {
        this.puntosVida -= 1;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public void recibirTecnicaFrecuente() {
        this.puntosVida -= 3;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public void recibirTecnicaEspecial() {
        this.puntosVida -= 10;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public void defender() {
        // No se resta vida al recibir golpe si se defiende
    }

    public void defenderTecnicaFrecuente() {
        this.puntosVida -= 1;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public void defenderTecnicaEspecial() {
        this.puntosVida -= 2;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }
    }

    public boolean getHaUsadoTecnicaEspecial() {
        return getHaUsadoTecnicaEspecial();
    }
}