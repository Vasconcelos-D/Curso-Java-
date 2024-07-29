package entidade;

public class Produto 
{
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto()
	{
	
	}
	public Produto (String nome, double valor, int quantidade)
	{
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		
	}
	public Produto (String nome, double valor)
	{
		this.nome = nome;
		this.valor = valor;
	}
	public void setName(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	public double getvalor()
	{
		return valor;
	}
	public int getQuantidade()
	{
		return quantidade;
	}
	public double valorTotal()
	{
		return valor * quantidade;
	}
	public void addProduto(int quantidade)
	{
		this.quantidade += quantidade;
	}
	public void removeProduto( int quantidade)
	{
		this.quantidade -= (quantidade);
	}
	public String toString()
	{
		return nome
			+ ", $ "
			+ String.format("%.2f", valor)
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ String.format("%.2f", valorTotal());
	}
}
