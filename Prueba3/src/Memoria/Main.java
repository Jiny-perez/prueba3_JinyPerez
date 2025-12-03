package Memoria;

import java.util.Scanner;

/**
 *
 * @author marye
 */
public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Nodo nodo;
        int opc = 0, code = 0, indice = 0;
        String nombre = "";
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        do{
        System.out.println("\n------- MENU -------");
        System.out.println("1. Agregar nodo");
        System.out.println("2. Imprimir");
        System.out.println("3. Obtener nodo");
        System.out.println("4. Eliminar nodo");
        System.out.println("5. Cantidad nodos almancenados");
        System.out.println("6. Insertar nodo en una posicion");
        System.out.println("7. Salir");
        System.out.print("Escoja una opcion: ");
        opc = lea.nextInt();

        switch (opc) {
            case 1:
                System.out.print("Ingrese un codigo: ");
                code = lea.nextInt();
                System.out.print("Ingrese un nombre: ");
                nombre = lea.next();
                nodo = new Nodo(code, nombre);
                lista.add(nodo);
                System.out.println("Se agrego nodo.");
                break;
            case 2:
                lista.imprimir();
                break;
            case 3:
                System.out.print("Ingrese un codigo: ");
                code = lea.nextInt();
                lista.get(code);
                break;
            case 4:
                System.out.print("Ingrese un codigo: ");
                code = lea.nextInt();
                lista.eliminar(code);
                break;
            case 5:
                lista.cantAlmacenada();
                
                break;
            case 6:
                System.out.print("Ingrese un indice: ");
                indice = lea.nextInt();
                System.out.print("Ingrese un codigo: ");
                code = lea.nextInt();
                System.out.print("Ingrese un nombre: ");
                nombre = lea.next();
                nodo = new Nodo(code, nombre);
                lista.add(indice, nodo);
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Error: opcion no valida.");
        }

    }while(opc!=7);
    }
}
