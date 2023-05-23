/******************************************************************************
Mayo 8/2023
Overriding in Java
En cualquier lenguaje de programación orientado a objetos, la sobreescritura
es una caracteristica

Clase con metodo que herada a otra Clase

*******************************************************************************/

//                          <:/\:>
//Overrdiding= sobreescritura metodo que se hereeda de una clase



class Padre{
    //Método show ()
    void show (){
        System.out.println("Clase Padre: METODO SHOW()");
       
    }
}

class Hija extends Padre{
//Este método sobreescribe el método show de la clase Padre
@Override
void show(){
    System.out.println("Clase Hija: metodo SHOW()");
   
}}

//Clase principal

class Over02{
    public static void main (String [] args){
        //Se instancia un objeto del tipo padre
        Padre objeto1=new Padre();
        objeto1.show();
        /*Se hace una referencia al objeto del tipo Hija, esto se llama
        RUN TIME POLYPHORMISM*/
        Padre objeto2=new Hija();
        objeto2.show();
    }
}


class Padre {
   
//los métodos privados no se sobreescriben
    private void m1() {
        System.out.printin("Desde el padre el m10");
    }
    protected void m2(){
        System.out.println("Desde el padre, el m2(");
    }
    class Hija extends Padre {
    // nuevo método m1()
    // único a la clase hija
    private void m1(){
        System.out.printin("Desde Hija m10");
        }
    //método overriding
    // con más accesibilidad
    @Override
    public void m2(){
    System.out.println("Desde Hija m2(");
    }}
    // Driver class
    class Principal {
    public static void main(String[] args){
    Padre obj1 = new Padre();
    obj1.m2();
    Padre obj2 = new Hija();
    obj2.m2();
    }
    }