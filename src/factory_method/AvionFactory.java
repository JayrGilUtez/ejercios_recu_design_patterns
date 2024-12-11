package factory_method;

public class AvionFactory extends VehiculoFactory{

    @Override
    public Vehiculo crearVehiculo() {
        return new Avion();
    }
}
