package mipaquete;

public class animal {
	int patas;
	String color_pelo;
	int alas;

	public animal(int patas, String color_pelo, int alas) {
		super();
		this.patas = patas;
		this.color_pelo = color_pelo;
		this.alas = alas;
	}

	public int getPatas() {
		return patas;
	}

	// setter
	public void setPatas(int nuevo_patas) {
		this.patas = nuevo_patas;
	}

	// getter
	public String getColor_pelo() {
		return color_pelo;
	}

	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int nuevas_alas) {
		this.alas = nuevas_alas;
	}

	// metodo que compara el número de patas de 2 animales
	public boolean mismoNumPatas(animal n12) {
		if (patas == n12.patas) {
			return true;
		} else {
			return false;
		}
	}
}
