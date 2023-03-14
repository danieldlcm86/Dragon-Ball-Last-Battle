package java.com.dragolBallLastBattle.game;

import java.util.Scanner;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Escenario escenario;

    public Juego(Jugador jugador1, Jugador jugador2, Escenario escenario) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.escenario = escenario;
    }

    public void jugar() {
        // Inicializar el juego
        System.out.println("¡Bienvenido a Dragon Ball FighterZ!");
        System.out.println("Jugador 1: " + jugador1.getNombre() + " vs Jugador 2: " + jugador2.getNombre());
        System.out.println("Escenario: " + escenario.getNombre());

        // Ciclo principal del juego
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Turno del jugador 1
            System.out.println(jugador1.getNombre() + ", es tu turno.");
            System.out.println("Selecciona una acción:");
            System.out.println("1. Golpear");
            System.out.println("2. Patear");
            System.out.println("3. Usar técnica frecuente");
            if (!jugador1.getHaUsadoTecnicaEspecial()) {
                System.out.println("4. Usar técnica especial");
            }
            System.out.println("5. Defender");

            int accion = scanner.nextInt();
            switch (accion) {
                case 1:
                    jugador2.recibirGolpe();
                    break;
                case 2:
                    jugador2.recibirPatada();
                    break;
                case 3:
                    jugador2.recibirTecnicaFrecuente();
                    break;
                case 4:
                    jugador2.recibirTecnicaEspecial();
                    break;
                case 5:
                    jugador1.defender();
                    break;
                default:
                    System.out.println("Acción inválida. Pierdes tu turno.");
            }

            // Verificar si el jugador 2 perdió
            if (jugador2.getPuntosVida() == 0) {
                System.out.println(jugador2.getNombre() + " ha sido derrotado. ¡" + jugador1.getNombre() + " es el ganador!");
                break;
            }

            // Turno del jugador 2
            System.out.println(jugador2.getNombre() + ", es tu turno.");
            System.out.println("Selecciona una acción:");
            System.out.println("1. Golpear");
            System.out.println("2. Patear");
            System.out.println("3. Usar técnica frecuente");
            if (!jugador2.getHaUsadoTecnicaEspecial()) {
                System.out.println("4. Usar técnica especial");
            }
            System.out.println("5. Defender");

            accion = scanner.nextInt();
            switch (accion) {
                case 1:
                    jugador1.recibirGolpe();
                    break;
                case 2:
                    jugador1.recibirPatada();
                    break;
                case 3:
                    jugador1.recibirTecnicaFrecuente();
                    break;
                case 4:
                    jugador1.recibirTecnicaEspecial();
                    break;
                case 5:
                    jugador2.defender();
                    break;
                default:
                    System.out.println("Acción inválida. Pierdes tu turno.");
            }

            // verificar si el jugador 1 perdió
            if (jugador1.getPuntosVida() == 0) {
                System.out.println(jugador2.getPersonaje().getNombre() + " ha ganado!");
                return;
            }

            // si llegamos aquí, el juego continúa con el turno del jugador 2
            System.out.println("Turno de " + jugador2.getPersonaje().getNombre());
            System.out.println("Elija su acción:");
            System.out.println("1. Golpear");
            System.out.println("2. Patear");
            System.out.println("3. Usar técnica frecuente");
            System.out.println("4. Usar técnica especial");
            System.out.println("5. Defender");

            // leer la acción del jugador 2 desde la consola
            int accion2 = scanner.nextInt();
            switch (accion2) {
                case 1:
                    jugador1.recibirGolpe();
                    break;
                case 2:
                    jugador1.recibirPatada();
                    break;
                case 3:
                    jugador1.recibirTecnicaFrecuente();
                    break;
                case 4:
                    jugador1.recibirTecnicaEspecial();
                    break;
                case 5:
                    // elegir el tipo de defensa
                    System.out.println("Seleccione el tipo de defensa:");
                    System.out.println("1. Defensa normal");
                    System.out.println("2. Defensa especial");
                    int defensa2 = scanner.nextInt();
                    switch (defensa2) {
                        case 1:
                            jugador2.defenderTecnicaFrecuente();
                            break;
                        case 2:
                            jugador2.defenderTecnicaEspecial();
                            break;
                    }
                    break;
            }

            // verificar si el jugador 2 perdió
            if (jugador2.getPuntosVida() == 0) {
                System.out.println(jugador1.getPersonaje().getNombre() + " ha ganado!");
                return;
            }

            // si llegamos aquí, el juego continúa con el siguiente turno
            jugar(jugador1, jugador2);
        }
    }
}