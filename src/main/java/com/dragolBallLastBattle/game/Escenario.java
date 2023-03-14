package java.com.dragolBallLastBattle.game;

import java.awt.image.BufferedImage;

public class Escenario {
    private String nombre;
    private BufferedImage imagen;
    private int ancho;
    private int alto;

    public Escenario(String nombre, BufferedImage imagen, int ancho, int alto) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
