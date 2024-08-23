package entidade;

public class ContaPoupanca {
	
	public double saldo;
	public String titular;
	public int numeroconta;


	public ContaPoupanca(double saldo, String titular, int numeroconta) {
		this.saldo = saldo;
		this.titular = titular;
		this.numeroconta = numeroconta;
	}


	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + ", titular=" + titular + ", numeroconta=" + numeroconta + "]";
	}


	



	
	
	

		
}
