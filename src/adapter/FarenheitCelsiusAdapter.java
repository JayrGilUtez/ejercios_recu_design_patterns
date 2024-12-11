package adapter;

public class FarenheitCelsiusAdapter implements ConveridorACelsius{
    private FarenheitAdaptee farenheitAdaptee;

    public FarenheitCelsiusAdapter() {
        this.farenheitAdaptee = new FarenheitAdaptee();
    }
    @Override
    public double convertirACelsius(double temperatura) {
        return farenheitAdaptee.convertirFarenheitACelsius(temperatura);
    }
}
