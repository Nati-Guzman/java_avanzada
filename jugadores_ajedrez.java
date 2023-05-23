/*****************************************************************************************
 
Abril 14/2023
Natalia Catalina Guzmán Fuentes

Taller Programación

Ejercicio:

-   Subir un fichero (.java), el cual pueda manipular una lista de Jugadores de Ajedrez
    que han participado en un evento. Los datos son: Nombre, ELO, edad, valorPremio.
    El ELO representa un valor del tipo entero al igual que el valorPremio.
    Se requiere una aplicación que se pueda ordenar los jugadores en función de el ELO,
    de la edad y del valor del premio. Inicialmente, la aplicación deberá presentar la
    lista de almenos 7 jugadores de forma desordenada. Crear las Clases correspondientes
    en el fichero (.java).

*****************************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Jugador {
   
    //Atributos privados
    private String nombre;
    private int elo;
    private int edad;
    private int valorPremio;
   
    //Se necesita un constructor para reconocer los datos inciales descritos en los atributos
    public Jugador(String nombre, int elo, int edad, int valorPremio) {
       
        this.nombre = nombre;
        this.elo = elo;
        this.edad = edad;
        this.valorPremio = valorPremio;
    }


    //Métodos a utilizar
   
    //Obtener nombre del jugador
    public String getNombre() {
        return nombre;
    }

    //Darle un valor al atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Obtener el "ELO"
    public int getElo() {
        return elo;
    }

    //Darle un valor al atributo ELO
    public void setElo(int elo) {
        this.elo = elo;
    }

    //Obtener edad del jugador
    public int getEdad() {
        return edad;
    }

    //Darle un valor al atributo Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Obtener el valor del premio
    public int getValorPremio() {
        return valorPremio;
    }

    //Darle un valor al atributo ValorPremio
    public void setValorPremio(int valorPremio) {
        this.valorPremio = valorPremio;
    }
   
    //Se requiere imprimir los datos contenidos en el "objeto"
    public String presentarDatos(){
        return "(" + getNombre() + "," + getElo() + "," + getEdad() + "," + getValorPremio() + ")";
    }
   
}//Fin clase Jugador

public class Ajedrez {
   
    public static void main(String[] args) {
       
        //Se crean unos jugadores para la partida (arreglo)
        ArrayList<Jugador> jugadores = new ArrayList<>();
       
        //Se llena la lista con 8 jugadores
        jugadores.add(new Jugador("Jugador 1", 2000, 25, 1000));
        jugadores.add(new Jugador("Jugador 2", 1800, 20, 800));
        jugadores.add(new Jugador("Jugador 3", 2200, 30, 1500));
        jugadores.add(new Jugador("Jugador 4", 1900, 22, 1200));
        jugadores.add(new Jugador("Jugador 5", 2100, 28, 1700));
        jugadores.add(new Jugador("Jugador 6", 1950, 24, 1100));
        jugadores.add(new Jugador("Jugador 7", 1850, 26, 900));
        jugadores.add(new Jugador("Jugador 8", 2250, 32, 2000));
       
        //Se presenta la lista de forma desordenada
        System.out.println("Lista sin ordenar: \n");
        for(Jugador jugador: jugadores){
            System.out.println(jugador.presentarDatos());
        }

        // Ordenar por ELO
        System.out.println("\nLista Ordenado por ELO: \n");
       
        //Se presenta la lista ordenada según el ELO usando Comparator
        Collections.sort(jugadores, Comparator.comparing(Jugador::getElo));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - ELO: " + jugador.getElo());
        }

        // Ordenar por edad
        System.out.println("\nLista ordenada por edad: \n");
       
        //Se presenta la lista ordenada según la edad, haciendo uso de comparator
        Collections.sort(jugadores, Comparator.comparing(Jugador::getEdad));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - Edad: " + jugador.getEdad());
        }

        // Ordenar por Valor del Premio
        System.out.println("\nLista ordenada por valor del premio: \n");
       
        //Se presenta el arreglo ordenado según el v. del premio usando comparator
        Collections.sort(jugadores, Comparator.comparing(Jugador::getValorPremio));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - Valor del premio: " + jugador.getValorPremio());
            }
    }

}//Fin de la clase principal
