package java.com.dragolBallLastBattle.game;

public abstract class Personaje{
    private String nombre;
    private String raza;
    private int puntosDeVida;
    private int puntosDeDefensa;
    private int puntosDeAtaque;

    public Personaje(String nombre, String raza, int puntosDeVida, int puntosDeDefensa, int puntosDeAtaque) {
        this.nombre = nombre;
        this.raza = raza;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeDefensa = puntosDeDefensa;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeDefensa() {
        return puntosDeDefensa;
    }

    public void setPuntosDeDefensa(int puntosDeDefensa) {
        this.puntosDeDefensa = puntosDeDefensa;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public abstract void tecnicaFrecuente(Personaje oponente);

    public abstract void tecnicaEspecial(Personaje oponente);

    public void golpear(Personaje oponente){
        oponente.setPuntosDeVida(oponente.getPuntosDeVida() - this.puntosDeAtaque);
    }

    public void patear(Personaje oponente){
        oponente.setPuntosDeVida(oponente.getPuntosDeVida() - this.puntosDeAtaque);
    }

    public void defenderGolpe(){
        this.setPuntosDeDefensa(1);
    }

    public void defenderTecnicaFrecuente(){
        this.setPuntosDeDefensa(2);
    }

    public void defenderTecnicaEspecial(){
        this.setPuntosDeDefensa(3);
    }

    public boolean estaDerrotado(){
        return this.getPuntosDeVida() <= 0;
    }

}