/******************************************************************************

Clase 3 de Mayo/2023
Natalia Guzmán

HERENCIA:

-La herencia en java implica que una superclase o clase base hereda sus
funciones y atributos a una subclase o clase derivada. La palabra reservada que
nos permite realizar herencia entre clases es EXTENDS.

-Los constructores de las clases no se heredan, sin embargo, pueden ejecutarse
en la clase hija con el método super ().

-Considera que las funciones o atributos del tipo private no podrán heredarse

*******************************************************************************/

//Herencia Multinivel

//persona.java
public class persona{
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
   
    //constructor
    public persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
   
    //Métodos
    public String getNombre(){
        return nombre;
    }
   
    public String getApellido(){
        return apellido;
    }
   
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
//Herencia Jerárquica
class Profesor extends Persona{
    private String idalumno;  //Atributos
    //constructor
    public Profesor (String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        idalumno = "unknown";
    }
    //Metodos propios de la subclase
    public void setIdAlumno(String idalumno){this.idalumno = idalumno;}
    public String getIdAlumno(){return idalumno;}
    public String toString(){
        return getNombre() + " " + getApellidos() + "-" + getEdad() + " " + getIdAlumno();
    }
}
class Alumno extends Persona {
    private String idAlumno;

    public Alumno(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        idAlumno = "unknown";
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String toString() {
        return " " + getNombre() + " " + getApellidos() + "-" + getEdad() + " " + getIdAlumno();
    }
}
class Practicante extends Persona {
    private String idPracticante;

    public Practicante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        idPracticante = "unknown";
    }

    public void setIdPracticante(String idPracticante) {
        this.idPracticante = idPracticante;
    }

    public String getIdPracticante() {
        return idPracticante;
    }

    public String toString() {
        return " " + getNombre() + " " + getApellidos() + "-" + getEdad() + " " + getIdPracticante();
    }
}

class Herencia {
    public static void main(String[] args) {
        Profesor profesor01 = new Profesor ("Profesor", "mendoza cuba", 33);//profesor01
        System.out.println(profesor01.toString());
        Alumno alumno01 = new Alumno("Alumno", "Pardo manila", 15);
        alumno01.setIdAlumno("Alumno123456789");
        System.out.println(alumno01.toString());

        Practicante practicante01 = new Practicante ("Practicante", "Torres nilo", 19);
        practicante01.setIdPracticante("Practicante123456789");
        System.out.println(practicante01.toString());
    }
}

}

   
}