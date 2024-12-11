package factory_method;

public class MotoFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }



}
