package singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc = 1;
        ApagadorSingleton apagadorSingleton = ApagadorSingleton.getInstancia();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    """
                    Preciona 1 para controlar las luces
                    Presiona 2 para terminar con el programa
                    """);
            opc =  sc.nextInt();
            apagadorSingleton.controlarLuces(opc);

        } while (opc != 2);
    }
}
