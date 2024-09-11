public class conversorTemperatura {
    // No se pueden poner literales | Usar constantes
    public final static int DESPLAZAR = 32;

    public static int celsiusaFahrenheit(int celsius){
        return (celsius * 9/5) + DESPLAZAR;
    }
    public static int fahrenheitaCelsius(int fahrenheit){
        return (fahrenheit - DESPLAZAR) * 5/9;
    }
}