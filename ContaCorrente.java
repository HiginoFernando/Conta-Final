package entidade;

public class ContaCorrente{
	public double limite;
	private double saldo;
	public String titular;
	public int numeroconta;

	public ContaCorrente(String titular, double saldo, int numeroconta, double limite) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroconta = numeroconta;
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", saldo=" + saldo + ", titular=" + titular + ", numeroconta="
				+ numeroconta + "]";
	}

	

	
	

}
