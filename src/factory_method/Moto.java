package factory_method;

public class Moto implements Vehiculo{
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Soy una moto y tengo 2 ruedas");
    }
}
