package adapter;

public class FarenheitAdaptee {
    public double convertirFarenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
