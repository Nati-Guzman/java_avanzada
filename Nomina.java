/******************************************************************************
Considere la siguiente clase Profesor, que está definida en un sistema de gestión
de nómina para una universidad. El método imprimirSalario() es abstracto.

Ahora asuma una clase Nomina con la siguiente definición
Nomina
+Nomina()
†agregarProfesoPlanta(String nombre, String correo, String categoria, int solario)
+agregar ProfesorCatedra(String nombre, String correo, int tarifa, int horasDictadas)

y las demás especificaciones para este código

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;

// Clase Profesor
abstract class Profesor {
    private String nombre;
    private String correo;

    public Profesor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public abstract String imprimirSalario();
}

// Clase ProfesorPlanta
class ProfesorPlanta extends Profesor {
    private String categoria;
    private int salario;

    public ProfesorPlanta(String nombre, String correo, String categoria, int salario) {
        super(nombre, correo);
        this.categoria = categoria;
        this.salario = salario;
    }

    @Override
    public String imprimirSalario() {
        return "Nombre: " + getNombre() +
                "\nCorreo: " + getCorreo() +
                "\nProfesor de planta en categoría " + categoria +
                " Salario: $" + salario + " mensual";
    }
}

// Clase ProfesorCatedra
class ProfesorCatedra extends Profesor {
    private int tarifaPorHora;
    private int horasAlMes;

    public ProfesorCatedra(String nombre, String correo, int tarifaPorHora, int horasAlMes) {
        super(nombre, correo);
        this.tarifaPorHora = tarifaPorHora;
        this.horasAlMes = horasAlMes;
    }

    @Override
    public String imprimirSalario() {
        return "Nombre: " + getNombre() +
                "\nCorreo: " + getCorreo() +
                "\nProfesor de cátedra con tarifa de $" + tarifaPorHora +
                " por hora\nDicta " + horasAlMes + " al mes";
    }
}

// Clase Nomina
class Nomina {
    private List<Profesor> profesores;

    public Nomina() {
        profesores = new ArrayList<>();
    }

    public void agregarProfesorPlanta(String nombre, String correo, String categoria, int salario) {
        ProfesorPlanta profesor = new ProfesorPlanta(nombre, correo, categoria, salario);
        profesores.add(profesor);
    }

    public void agregarProfesorCatedra(String nombre, String correo, int tarifa, int horasDictadas) {
        ProfesorCatedra profesor = new ProfesorCatedra(nombre, correo, tarifa, horasDictadas);
        profesores.add(profesor);
    }

    public void eliminarProfesor(String correo) {
        Profesor profesorAEliminar = null;
        for (Profesor profesor : profesores) {
            if (profesor.getCorreo().equals(correo)) {
                profesorAEliminar = profesor;
                break;
            }
        }
        if (profesorAEliminar != null) {
            profesores.remove(profesorAEliminar);
        }
    }

    public List<String> imprimirNomina() {
        List<String> resultados = new ArrayList<>();
        for (Profesor profesor : profesores) {
            String resultado = profesor.imprimirSalario();
            resultados.add(resultado);
        }
        return resultados;
    }
}