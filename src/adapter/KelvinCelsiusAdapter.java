package adapter;

public class KelvinCelsiusAdapter implements ConveridorACelsius {
    private KelvinAdaptee kelvinAdaptee;

    public KelvinCelsiusAdapter() {
        this.kelvinAdaptee =  new KelvinAdaptee();
    }

    @Override
    public double convertirACelsius(double temperatura) {
        return kelvinAdaptee.convertirKelvinACelsiuss(temperatura);

    }
}
