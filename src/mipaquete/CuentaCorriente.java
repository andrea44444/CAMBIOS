package mipaquete;
/**
 * @version 2021-09 (4.21.0)
 * @author Andrea
 * @since 30-11-2021
 */
public class CuentaCorriente {

	private static final int ZERO = 0;
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
	

	public static int getZero() {
		return ZERO;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CuentaCorriente() {
	}
/**
 * 
 * @param nom nombre del proprietario de la cuenta
 * @param cue la cuenta bancaria que tiene
 * @param sal el saldo que hay en la cuenta
 * @param tipo es el tipo de interés que se le aplica a la cuenta 
 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
/**
 * 
 * @return devuelve el nombre del propietario de la cuenta
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @return devuelve el saldo de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * 
 * @param cantidad que ingresa en la cuenta
 * @throws Exception acepta que ingresen cualquier cantidad menos una negativa
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
/**
 * 
 * @param cantidad que retira
 * @throws Exception no se puede retirar una cantidad negativa ni una cantidad mayor que la del saldo
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
	private double estado() {
	// TODO Esbozo de método generado automáticamente
	return 0;
}
	/**
	 * 
	 * @return devuelve la cuenta que se ha creado
	 */

	public String getCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta bancaria
	 */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @param saldo de la cuenta
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return devuelve el tipo de interés que se le aplica a la cuenta
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * 
 * @param tipoInterés tipo de interes que se le aplica a la cuenta
 */
	public void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
}
