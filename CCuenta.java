package cuentas;

/**
 * Esta clase contiene los atributos y metodos de una cuenta
 * @author Alby Rodríguez
 * @version 1.0
 */
public class CCuenta {

    private String nombre1;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Metodo constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Metodo constructor parametrizado
     * @param nom Nombre del titular de la cuenta
     * @param cue Número identificador de la cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre1 = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return Saldo disponible en cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Cantidad a retirar de la cuenta
     * @see CCuenta#ingresar(double)
     * @see CCuenta#estado()
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar en cuenta
     * @see CCuenta#retirar(double)
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);
            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Obtiene el nombre del titular.
     * @return Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre1;
    }

    /**
     * Establece el nombre del titular.
     * @param nombre Nombre a del titular a aplicar
     */
    public void setNombre(String nombre) {
        this.nombre1 = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Aplica un número de cuenta.
     * @param cuenta Número de cuenta a aplicar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual en la cuenta.
     * @return Saldo actual en cuenta
     * @see CCuenta#getSaldo()
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Saldo a establecer en cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Tipo de interés aplicado
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Tipo de interés a aplicar en cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
