import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CuentaBancaria {
    private String iban;
    private int numeroCuenta;
    private double saldo;
    private static int tasainteres = 2;
    private static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public CuentaBancaria() {
        this.saldo = 0;
        this.numeroCuenta = generarNumeroCuenta();
        this.iban = "ES" + this.numeroCuenta;
    }

    public int generarNumeroCuenta(){
        int numeroGenerado = ThreadLocalRandom.current().nextInt(10000, 99999);

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (numeroGenerado == listaNumeros.get(i)){
                numeroGenerado = ThreadLocalRandom.current().nextInt(10000, 99999);
            }
        }
        listaNumeros.add(numeroGenerado);
        return numeroGenerado;
    }

    public void agregarSaldo(double saldo){
        if (saldo > 0) this.saldo += saldo;
    }

    public void retirarSaldo(double saldo){
        if (saldo < this.saldo && saldo > 0) {this.saldo = this.saldo - saldo;}
    }

    public String getIban() {
        return iban;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
