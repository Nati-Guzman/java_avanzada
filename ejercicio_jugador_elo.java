import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Jugador 1", 2000, 25, 1000));
        jugadores.add(new Jugador("Jugador 2", 1800, 20, 800));
        jugadores.add(new Jugador("Jugador 3", 2200, 30, 1500));
        jugadores.add(new Jugador("Jugador 4", 1900, 22, 1200));
        jugadores.add(new Jugador("Jugador 5", 2100, 28, 1700));
        jugadores.add(new Jugador("Jugador 6", 1950, 24, 1100));
        jugadores.add(new Jugador("Jugador 7", 1850, 26, 900));
        jugadores.add(new Jugador("Jugador 8", 2250, 32, 2000));

        // Ordenar por ELO
        System.out.println("Ordenado por ELO:");
        Collections.sort(jugadores, Comparator.comparing(Jugador::getElo));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - ELO: " + jugador.getElo());
        }

        // Ordenar por edad
        System.out.println("\nOrdenado por edad:");
        Collections.sort(jugadores, Comparator.comparing(Jugador::getEdad));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - Edad: " + jugador.getEdad());
        }

        // Ordenar por valor del premio
        System.out.println("\nOrdenado por valor del premio:");
        Collections.sort(jugadores, Comparator.comparing(Jugador::getValorPremio));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - Valor del premio);
        }
    }
}

