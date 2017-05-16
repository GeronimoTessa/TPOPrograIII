package ejercicio1;

public class SoluciónEjercicio1 {

	private Punto punto1;

	private Punto punto2;

	private int instruc_ejecutadas;

	public SoluciónEjercicio1(){

	}
	
	public SoluciónEjercicio1(Punto x, Punto y, int instr){
		this.punto1 = x;
		this.punto2 = y;
		this.instruc_ejecutadas = instr;
	}
	
	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	public int getInstruc_ejecutadas() {
		return instruc_ejecutadas;
	}

	public void setInstruc_ejecutadas(int instruc_ejecutadas) {
		this.instruc_ejecutadas = instruc_ejecutadas;
	}

}
