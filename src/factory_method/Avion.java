package factory_method;

public class Avion implements Vehiculo{
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Soy un avion y tengo alas");
    }
}
