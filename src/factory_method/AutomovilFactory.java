package factory_method;

public class AutomovilFactory extends VehiculoFactory{
    @Override
    public Vehiculo crearVehiculo() {
        return new Automovil();
    }
}
