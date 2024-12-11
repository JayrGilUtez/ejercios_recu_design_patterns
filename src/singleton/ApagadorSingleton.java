package singleton;

public class ApagadorSingleton {
    private static ApagadorSingleton instancia;
    boolean estanEncendidas;

    private ApagadorSingleton(){
        this.estanEncendidas = false;
    }

    public static ApagadorSingleton getInstancia(){
        if( instancia == null){
            return new ApagadorSingleton();
        }
        return instancia;
    }

    public void controlarLuces(int opc){
        if(opc == 1){
            estanEncendidas = !estanEncendidas;
            System.out.println("\nLas luces estan " + (estanEncendidas ?  "encendidas\n" : "apagadas\n"));
        }
    }
}
