/******************************************************************************

Imprimir arrays y ordenarlos para posteriormente imprimirlos

*******************************************************************************/
import java.util.Arrays;

class OrdenarArreglos{
    public static void imprimirArreglo (String mensaje, int arreglo []){
        System.out.println(mensaje + ":[longitud:" + arreglo.length + "]");
        //Se imprime el arreglo
        for(int i=0; i<arreglo.length; i++){
            System.out.println(" - "+arreglo[i]);
        }
        System.out.println();
    }


public static void Main(String[] args){
    int ejemplo_arreglo[]={2, -5, 3, 0, -2, -3, 9, -10, 4, 5};
    float miflotante =1.0f;
    double [][]matriz=new double [3][3];
    Arrays.sort(ejemplo_arreglo);
    //Se imprime el array ordenado por el metodo sort de arrays de la clase Utils de java
    imprimirArreglo("Arreglo ordenado", ejemplo_arreglo);
    //Se busca el indice del valor -2, por el metodo binarySearch de la clase Arrays
    int indice=Arrays.binarySearch(ejemplo_arreglo,-2);
    System.out.print("Se enconto el -2 @ "+ indice);
}
}