/*******************************************************************************************
El taller consiste en simular una tienda de productos electrónicos que ofrece la opción de
garantía extendida para ciertos productos. Para ello, se requiere implementar el concepto de
clases abstractas y polimorfismo.

El programa deberá contar con un menú en el cual permita crear los objetos, inicializándolos
con la información pedida en pantalla, siendo agregados automáticamente a la lista y
posteriormente presentando la opción de recorrer el ArrayList.

*******************************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

// Clase abstracta base
abstract class ProductoElectronico {
    protected String nombre;
    protected double precio;
    protected int garantia;

    // Constructor
    public ProductoElectronico(String nombre, double precio, int garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    // Métodos abstractos
    public abstract void cargar();

    // Métodos comunes
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }
}

// Clase derivada 'Celular'
class Celular extends ProductoElectronico {
    private int cargaInicial;

    // Constructor
    public Celular(String nombre, double precio, int garantia, int cargaInicial) {
        super(nombre, precio, garantia);
        this.cargaInicial = cargaInicial;
    }

    // Implementación del método cargar específico para Celular
    @Override
    public void cargar() {
        System.out.println("Cargando el celular " + nombre + " con una carga inicial de " + cargaInicial + "%");
    }

    // Otros métodos específicos para Celular
    public void hacerLlamada(String numero) {
        System.out.println("Haciendo una llamada al número " + numero);
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}

// Clase derivada 'Computadora'
class Computadora extends ProductoElectronico {
    private String sistemaOperativo;

    // Constructor
    public Computadora(String nombre, double precio, int garantia, String sistemaOperativo) {
        super(nombre, precio, garantia);
        this.sistemaOperativo = sistemaOperativo;
    }

    // Implementación del método cargar específico para Computadora
    @Override
    public void cargar() {
        System.out.println("Cargando la computadora " + nombre + " con una fuente de poder externa");
    }

    // Otros métodos específicos para Computadora
    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando el programa: " + programa);
    }

    public void reiniciar() {
        System.out.println("Reiniciando la computadora");
    }
}

// Clase principal que contiene el programa
public class TiendaElectronica {
    public static void main(String[] args) {
        ArrayList<ProductoElectronico> listaProductos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Crear celular");
            System.out.println("2. Crear computadora");
            System.out.println("3. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCelular(listaProductos, scanner);
                    break;
                case 2:
                    crearComputadora(listaProductos, scanner);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void crearCelular(ArrayList<ProductoElectronico> listaProductos, Scanner scanner) {
        System.out.print("\nIngrese el nombre del celular: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del celular: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la garantía del celular: ");
        int garantia = scanner.nextInt();
        System.out.print("Ingrese la carga inicial del celular: ");
        int cargaInicial = scanner.nextInt();

        Celular celular = new Celular(nombre, precio, garantia, cargaInicial);
        listaProductos.add(celular);

        System.out.println("Celular creado y agregado a la lista.");
    }

    public static void crearComputadora(ArrayList<ProductoElectronico> listaProductos, Scanner scanner) {
        System.out.print("\nIngrese el nombre de la computadora: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio de la computadora: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la garantía de la computadora: ");
        int garantia = scanner.nextInt();
        System.out.print("Ingrese el sistema operativo de la computadora: ");
        String sistemaOperativo = scanner.next();

        Computadora computadora = new Computadora(nombre, precio, garantia, sistemaOperativo);
        listaProductos.add(computadora);

        System.out.println("Computadora creada y agregada a la lista.");
    }

    public static void mostrarProductos(ArrayList<ProductoElectronico> listaProductos) {
        System.out.println("\n----- PRODUCTOS -----");

        for (ProductoElectronico producto : listaProductos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Garantía: " + producto.getGarantia());

            producto.cargar();

            if (producto instanceof Celular) {
                Celular celular = (Celular) producto;
                celular.hacerLlamada("123456789");
            } else if (producto instanceof Computadora) {
                Computadora computadora = (Computadora) producto;
                computadora.ejecutarPrograma("Microsoft Word");
            }

            System.out.println("--------------------");
        }
    }
}
