package banco;
// Classe Banc
public class Conta// nome da classe que vai ser  importada.
{

	private int numero;
	private String nome;
	private double balanco;

	public Conta( int numero, String nome)
	{
		this.nome = nome;
		this.numero = numero;
	}
	public Conta( int numero, String nome, double inicialDeposito)
	{
		this.numero = numero;
		this.nome = nome;
		deposito(inicialDeposito);
	
	
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	public int getnumero(int numero)
	{
		return numero;
	}
	public void setBalanco(double balanco)
	{
		this.balanco = balanco;
	}
	public double getBalanco()
	{
		return balanco;
	}
	public void deposito(double quantia)
	
	{
		balanco += quantia;
	}
	public void reritar(double quantia)
	{
		balanco -= quantia + 5.0;
	}
	public String toString()
	{
		return				 "Conta "
							+ numero
							+ " , nome: "
							+ nome
							+ " , Saldo: $ "
							+ String.format("%.2f", balanco);
	}

}
