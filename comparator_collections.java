/******************************************************************************

Clase abril 12/2023
Natalia Catalina Guzmán Fuentes

Clase Comparator, Collections y Arrays
Ejercicio: Crear una aplicación que contenga los datos de los empleados
    - Nombre
    - Edad
    - Salario
Con lo anterior genera una lista de empleados para luego hacer un reporte
ordenador, según las consultas del usuario.
*******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Se crea una clase empleado: facilitará el tratamiento de los datos


class Empleado{ //No es la clase principal *
   
    //Atributos privados
    private String nombre;
    private int edad;
    private float salario;
   
    //Se necesita un constructor para reconocer datos iniciales(va de la mano con los atributos)
    public Empleado(String nombre, int edad, float salario){
       
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
       
    }
   
    //Se necesita dar el nombre
    //metodo
    public String getNombre(){
       
        return nombre;
       
    }
   
    //Se devuelve la edad
    public int getEdad(){
       
        return edad;
       
    }
   
    //Se retorna el salario
    public float getSalario (){
       
        return salario;
       
    }
   
    //Se necesita ingresar el nombre
    public void setNombre(String nombre){
       
        this.nombre=nombre;
       
    }
   
    //Se necesita ingresar la edad
    public void setEdad(int edad){
       
        this.edad=edad;
       
    }
   
    //Se necesita ingresar el salario
    public void setSalario(float salario){
       
        this.salario=salario;
       
    }
   
    //Se quiere imprimir los datos contenidos en el "objeto"
    public String presentarDatos(){
       
        return "(" + getNombre() + "," + getEdad() + "," + getSalario() + ")";
    }
   
}//Fin clase Empleado


    //Se requiere crear una clase para COMPARAR la edad del empleado
    // <se implementa usando la clase Comparator>
    //la idea principal es ordenar los objetos de acuerdo a la edad
   
   
    class CompararEdadEmpleado implements Comparator<Empleado>{
       
        //Se implementa el método que devuelva el orden de acuerdo a la edad
        public int compare(Empleado emp1, Empleado emp2){
           
            return emp2.getEdad() - emp1.getEdad();
           
        }
       
    }//Fin de la clase comparar edad empleado
   
   
//Se hace la clase principal, la cual tendrá listas de empleados(Arrays)

public class Planilla
{
   
public static void main(String[] args) {
   //Se crean unos empleados para jugar (arreglo)
   ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
  
    //Se llena la lista con empleados
   listaEmpleados.add(new Empleado("Jairo",18,100000));
    listaEmpleados.add(new Empleado("Roberto",64,300000));
    listaEmpleados.add(new Empleado("Claudia",56,200000));
   listaEmpleados.add(new Empleado("Felipe",30,500000));
   
    //Se quiere presentar la lista sin ordenar
System.out.println("Lista de empleados sin ordenar");
System.out.println(listaEmpleados);
}

}//Fin de la clase principal Planilla