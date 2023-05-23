public class Jugador {
    private String nombre;
    private int elo;
    private int edad;
    private int valorPremio;

    public Jugador(String nombre, int elo, int edad, int valorPremio) {
        this.nombre = nombre;
        this.elo = elo;
        this.edad = edad;
        this.valorPremio = valorPremio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(int valorPremio) {
        this.valorPremio = valorPremio;
    }
}