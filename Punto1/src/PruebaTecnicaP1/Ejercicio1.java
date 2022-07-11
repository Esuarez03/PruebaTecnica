package PruebaTecnicaP1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {	 

	public int prueba() {

		String myString = "\"asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ew\r\n" 
				+ "f342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,3453453\r\n"
				+ "4ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,345\r\n"
				+ "34534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.\r\n"
				+ ",34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,\r\n"
				+ "345.,34534534ewf342r\"";

		List<Integer> numerosEnteros = new ArrayList<Integer>();
		List<Integer> numerosImpares = new ArrayList<Integer>();
		int suma = 0;

		String[] b = myString.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
		for (String value : b) {
			if(!value.equals("")) {
				numerosEnteros.add(Integer.parseInt(value));
			}	
		}
		
		for(Integer value1 : numerosEnteros) {
			if(value1 % 2 != 0) {
				numerosImpares.add(value1);
			}
		}
		
		for(Integer value3 : numerosImpares) {
			suma = suma + value3;
		}
		return suma;		
	}
}
