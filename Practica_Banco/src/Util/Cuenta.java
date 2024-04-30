package Util;

public class Cuenta extends Operaciones{

	
	    private String iban;
	    private Cliente cliente;
	    private double cantidad;
	    private boolean estado;

	    public Cuenta(String iban, Cliente cliente, double cantidad) {
	        this.iban = iban;
	        this.cliente = cliente;
	        this.cantidad = cantidad;
	        this.estado = true;
	    }
	    
	    

	    public String getIban() {
			return iban;
		}



		public void setIban(String iban) {
			this.iban = iban;
		}



		public Cliente getCliente() {
			return cliente;
		}



		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}



		public double getCantidad() {
			return cantidad;
		}



		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}



		public Boolean getEstado() {
			return estado;
		}



		public void setEstado(boolean estado) {
	        this.estado = estado;
	    }
	    
	    public void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
	    	int cantidadResta= (int) cuentaOrigen.getCantidad();
			cuentaOrigen.setCantidad(cantidadResta-cantidad);
			cuentaDestino.setCantidad(cantidad);
		}
		
		public void prestamo (Cuenta cuentaDestino, int cantidad) {
			cuentaDestino.setCantidad(getCantidad()+cantidad);
		}
		
		public void cancelarCuenta(Cuenta cuentaDestino) {
			cuentaDestino.cancelarCuenta(cuentaDestino);
			cuentaDestino.estado=false;
		}



		@Override
		public String toString() {
			return "Cuenta [iban=" + iban + ", cliente=" + cliente + ", cantidad=" + cantidad + ", estado=" + estado
					+ "]";
		}
		
		
}
