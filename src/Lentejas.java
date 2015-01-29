
public class Lentejas extends Plato implements Sal {
	
	String prep = "preparar";
	private String tipoLent;
	
	public String getTipoLent() {
		return tipoLent;
	}
	public void setTipoLent(String tipoLent) {
		this.tipoLent = tipoLent;
	}
	
	String preparar(){
		return prep;
	}
	void darSabor() {

	}
	

}
