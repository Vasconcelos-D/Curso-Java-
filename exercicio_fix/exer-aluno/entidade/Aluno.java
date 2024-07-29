package entidade;

public class Aluno
{
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double mediaFinal()
	{
		return (nota1 + nota2 + nota3) / 3 ;
	}
	public double faltaPontos()
	{
		if (mediaFinal() >= 60.0)
		{
			return 0.0;
		}
		else
		{
			return 60.00 - mediaFinal();
		}
	}

}
