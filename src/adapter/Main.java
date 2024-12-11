package adapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Conversor de temperaturas a Celsius");
            System.out.println("Seleccione el tipo de temperatura que desea convertir:");
            System.out.println("1. Kelvin a Celsius");
            System.out.println("2. Fahrenheit a Celsius");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese la temperatura en Kelvin: ");
                double kelvin = sc.nextDouble();

                KelvinAdaptee adaptadorKelvin = new KelvinAdaptee();
                double celsius = adaptadorKelvin.convertirKelvinACelsiuss(kelvin);

                System.out.println("Temperatura en Celsius: " + celsius);

            } else if (opcion == 2) {
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double fahrenheit = sc.nextDouble();

                FarenheitAdaptee adaptadorFahrenheit = new FarenheitAdaptee();
                double celsius = adaptadorFahrenheit.convertirFarenheitACelsius(fahrenheit);

                System.out.println("Temperatura en Celsius: " + celsius);

            } else {
                System.out.println("No existe esa opcion xd.");
            }


        }

}
