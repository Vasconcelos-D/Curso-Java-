package entidade;

public class Produto 
{
	public String nome;
	public double valor;
	public int quantidade;
	
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
