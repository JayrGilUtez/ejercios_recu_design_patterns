package factory_method;

public class Automovil implements Vehiculo{
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Soy un automovil y tengo 4 ruedas");
    }
}
