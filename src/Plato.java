
abstract class Plato {
	
	private int cantGr;
	private double precio;
	private String prep;
	
	abstract String preparar();
	protected void terminado() {
		System.out.println("El plato está listo para servirse");
	}
	
	public int getCantGr() {
		return cantGr;
	}
	public void setCantGr(int cantGr) {
		this.cantGr = cantGr;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPrep() {
		return prep;
	}
	public void setPrep(String prep) {
		this.prep = prep;
	}
	
}
