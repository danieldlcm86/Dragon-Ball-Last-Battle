package java.com.dragolBallLastBattle.game;

public interface Atacable {

    // Ataque de golpe
    public void golpear(Jugador jugador);

    // Ataque de patada
    public void patear(Jugador jugador);

    // Técnica frecuente
    public void tecnicaFrecuente(Jugador jugador);

    // Técnica especial
    public void tecnicaEspecial(Jugador jugador);

    // Defensa de golpe
    public void defenderGolpe();

    // Defensa de patada
    public void defenderPatada();

    // Defensa de técnica frecuente
    public void defenderTecnicaFrecuente();

    // Defensa de técnica especial
    public void defenderTecnicaEspecial();
}
