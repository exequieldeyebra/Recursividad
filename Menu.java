package ejercicio.pkg1.pkg2;

import java.util.Scanner;

public class Menu {
    private final String[] items;
    private int contador;

    public Menu() {
        items = new String[10];
        contador = 0;
    }

    public void agregarItem(String item) {
        if (contador < items.length) {
            items[contador] = item;
            contador++;
        } else {
            System.out.println("No se pueden agregar más ítems al menú.");
        }
    }

    public void removerItem(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador-1; i++) {
                items[i] = items[i+1];
            }
            contador--;
        } else {
            System.out.println("El índice ingresado no es válido.");
        }
    }

    public void visualizar() {
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1) + ". " + items[i]);
        }
    }

    public int ejecutar() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\nIngrese una opción: \n");
            this.visualizar();
            opcion = lector.nextInt();
        } while (opcion < 1 || opcion > contador);
        
        return opcion;
    }
}