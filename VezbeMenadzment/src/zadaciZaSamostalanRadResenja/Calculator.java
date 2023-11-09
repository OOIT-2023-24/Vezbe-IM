package zadaciZaSamostalanRadResenja;

public class Calculator {

	private int prviOperand;
	private int drugiOperand;
	
	public Calculator() {
		
	}
	
	public Calculator(int prviOperand, int drugiOperand) {
		this.prviOperand = prviOperand;
		this.drugiOperand = drugiOperand;
	}
	
	public int operacija(char vrstaOperacije) {
		if(vrstaOperacije == '+') {
			return prviOperand + drugiOperand;
		}
		else if(vrstaOperacije == '-') {
			return prviOperand - drugiOperand;
		}
		else if(vrstaOperacije == '*') {
			return prviOperand * drugiOperand;
		}
		else if(vrstaOperacije == '/') {
			return prviOperand / drugiOperand;
		}
		else {
			System.out.println("Nepoznata operacija");
		}
		return 0;
	}
	
	public int faktorijel(int broj) {
		int faktorijel = 1;
		if (broj > 20) {
			System.out.println("Nije moguce izracunati faktorijel unetog broja");
		}else {
			for(; broj >=1; broj--) {
				faktorijel = faktorijel * broj;
			}
		}
		return faktorijel;
	}
	
	public String toString() {
		return "Trenutni operandi kalkulatora su: " + prviOperand + " i " + drugiOperand;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Calculator) {
			Calculator temp = (Calculator) o;
			if(this.operacija('*') == temp.operacija('*')) {
				return true;
			}
		}
		return false;
	}
}
