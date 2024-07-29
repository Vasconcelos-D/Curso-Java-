package func;

public class Funcionario
{
	public String nome;
	public double salario;
	public double taxa;
	
	public double liqSalario()
	{
		return salario - taxa;
	}
	public void addSalario(double percentual)
	{
		 salario += salario * percentual / 100.0; 
	}
	public String toString()
	{
		return nome + ", $" + String.format("%.2f", liqSalario());
	}

}
