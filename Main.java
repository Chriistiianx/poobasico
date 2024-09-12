//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1.getNumeroCuenta());
        System.out.println(cuenta1.getIban());
        System.out.println(cuenta1.getSaldo());
        cuenta1.agregarSaldo(-200);
        System.out.println(cuenta1.getSaldo());
        cuenta1.agregarSaldo(200);
        System.out.println(cuenta1.getSaldo());
        cuenta1.retirarSaldo(201);
        System.out.println(cuenta1.getSaldo());
    }
}