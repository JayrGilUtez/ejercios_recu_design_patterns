package factory_method;

public abstract class VehiculoFactory {
    public abstract Vehiculo crearVehiculo();

    public void mostrarVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.mostrarCaracteristicas();
    }

}
