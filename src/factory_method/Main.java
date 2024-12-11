package factory_method;

public class Main {
    public static void main(String[] args) {
        VehiculoFactory vehiculoFactory;

        vehiculoFactory = new MotoFactory();
        vehiculoFactory.mostrarVehiculo();

        vehiculoFactory = new AutomovilFactory();
        vehiculoFactory.mostrarVehiculo();

        vehiculoFactory = new AvionFactory();
        vehiculoFactory.mostrarVehiculo();


    }
}
