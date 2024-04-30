package Util;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Cliente cliente1 = new Cliente("Bonifacio", "Pérez", 45);
		Cliente cliente2 = new Cliente("Esteban", "Quito", 23);
		
		Cuenta cuenta1 = new Cuenta("004839123823BD", cliente1, 500.00);
		Cuenta cuenta2 = new Cuenta("450128481930YD", cliente2, 230.00);
		
		cuenta1.transferencia(cuenta1, cuenta2, 200.00);
		
		System.out.println(cuenta2);
	}

}
