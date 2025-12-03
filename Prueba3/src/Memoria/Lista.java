package Memoria;

/**
 *
 * @author marye
 */
public class Lista {

    private Nodo inicio = null;
    private int size = 0;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(Nodo obj) {
        if (obj == null) {
            return;
        }

        if (isEmpty()) {
            inicio = obj;
        } else {
            Nodo temp = inicio;
            while (temp.sigte != null) {
                temp = temp.sigte;
            }
            temp.sigte = obj;

        }
    }

    public void imprimir() {
        Nodo tmp = inicio;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.sigte;
        }
    }

    public Nodo get(int code) {
        Nodo tmp = inicio;
        while (tmp != null) {
            if (tmp.codigo == code) {
                System.out.println(tmp);
                return tmp;
            }
            tmp = tmp.sigte;
        }
        return null;
    }

    public boolean eliminar(int code) {
        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.codigo == code) {
                if (anterior == null) {
                    inicio = actual.sigte;
                } else {
                    anterior.sigte = actual.sigte;
                }
                size--;
                return true;
            }
            anterior = actual;
            actual = actual.sigte;
        }
        return false;
    }

    public void cantAlmacenada() {
        Nodo tmp = inicio;
        
        while (tmp != null) {
            tmp = tmp.sigte;
            size+=1;
        }
        System.out.println("cantidad de nodos almacenados: "+size);
    }

    public void add(int index, Nodo obj) {
        if (obj == null) {
            return;
        }

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error: Ingresaste un indice mayor al que contiene nodo");
        }

        Nodo temp = inicio;
        if (index == 0) {
            obj.sigte = inicio;
            inicio = obj;
            return;
        }

        int posicion = 0;
        while (temp != null) {
            if (posicion < index - 1) {
                temp = temp.sigte;
                posicion++;
            }
        }

        if (temp != null) {
            obj.sigte = temp.sigte;
            temp.sigte = obj;
        }
    }
}
