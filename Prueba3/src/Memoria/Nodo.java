package Memoria;

/**
 *
 * @author marye
 */

public class Nodo {
    int codigo ;
    String nombre;
    
    Nodo sigte;
    
    public Nodo(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        sigte=null;
    }
    
    public String toString (){
        return "Nodo { codigo: " +codigo+", nombre: "+nombre+ "}";
    }
}
