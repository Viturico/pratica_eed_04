package cuentas;

/**
 * Clase principal que ejecuta las operaciones de sobre una cuenta bancaria
 * @author Alby Rodríguez
 * @version 1.0
 */
public class Main {

    /**
     * Método principal de la aplicación. Crea una cuenta, muestra el saldo inicial,
     * ejecuta operaciones de ingreso y retiro, y muestra el saldo
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual + " Euros");
        operaciones(cuenta1);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual + " Euros");
    }
    
    /**
     * Realiza operaciones de retiro e ingreso en la cuenta
     */
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
}
