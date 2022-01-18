package ed;

/**
 * 
 * @author m
 *
 */
public class Circulo {
	private double rad;

/**
 * 
 * @param radio del círculo
 */
	public Circulo(double radio) {
		this.rad = radio;
	}
/**
 * 
 * @return el radio del círculo
 */
	public double getRad() {
		return rad;
	}
/**
 * 
 * @param rad es radio
 */
	public void setRad(double rad) {
		this.rad = rad;
	}

/**
 * color, diámetro y radio
 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad; /** área del cículo = 2*pi*radio^2 */
		System.out.println(area);
	}
/**
 * 
 * @param otro circulo
 * @param conDecimales es para ver el valor con o sin decimales
 * @return 
 */
	public boolean esIgual(Circulo otro,
			boolean conDecimales) { 
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
