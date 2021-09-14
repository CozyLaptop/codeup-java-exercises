import java.util.Date;

public class WeatherReading {
    private double latitude;
    private double longitude;
    private java.util.Date date = new java.util.Date();
    private double tempInCelsius;

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {

    }
//    for the setter for tempInCelsius, pass the input
//    into the kelvinToCelsius method and assign the output
//    to this.tempInCelsius
//
//    add a constructor that sets all fields
//
//    Add the following main method to test it out:

    public static void main(String[] args) {
        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println("Your weather for today is: ");
//        System.out.println(setTempInCelsius(tempInKelvin));

    }
    public static void setTempInCelsius(double kelvin){
//        return kelvin - 273.0;
//        this.tempInCelsius = kelvin - 273.0;
    }
//    public void setTempInCelsius(double tempInCelsius) {
//        this.tempInCelsius = tempInCelsius;
//    }

}
