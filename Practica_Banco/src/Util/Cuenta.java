package Util;

public class Cuenta {

	
	    private String iban;
	    private Cliente cliente;
	    private double cantidad;
	    private String estado;

	    public Cuenta(String iban, Cliente cliente, double cantidad) {
	        this.iban = iban;
	        this.cliente = cliente;
	        this.cantidad = cantidad;
	        this.estado = "Activa";
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }
}
