package aplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program 
{
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Funcionario> list = new ArrayList<>();
	System.out.print("Quantos Funcionarios serão registrados? ");
	int N = sc.nextInt();
	
	for (int i = 0 ; i < N ; i++)
	{
		System.out.println("Posição #" + (i+1) + ":");
		System.out.print("Entre com o Id: ");
		Integer id = sc.nextInt();
		while (hasId(list,id)) 
		{
			System.out.println("Id já existe! Tente novamente");
			id = sc.nextInt();
		}
		System.out.print("Entre com o Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Entre com o Salary: ");
		Double salary = sc.nextDouble(); 
		Funcionario emp = new Funcionario( id, name, salary);
		list.add(emp);
	}
	System.out.print("Entre com o ID, que terá salario acrescentado: ");
	int idsalary = sc.nextInt();
	Funcionario emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
	//Integer pos = position(list, idsalary);
	if (/*pos*/emp == null)
	{
		System.out.print("Esse Id não Existe: ");
	}
	else
	{
		System.out.print("Entre com a Porcentagem: ");
		double percent = sc.nextDouble();
		/*list.get(pos)*/emp.increasseSalary(percent);
	}
	System.out.println();
	System.out.println("Lista de Funcionarios: ");
	for (Funcionario e/*emp*/ : list)
		// foi trocado emp por e por que não pode repetir o mesma var...
	{
		System.out.println(e/*emp*/);
	}
	sc.close();
	}
	public static boolean hasId(List<Funcionario> list, int id)
	{
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	/*
	public static Integer position(List<Funcionario> list, int  id)// Foi criada uma função Auxiliar.
	{
		for(int i = 0 ; i < list.size() ; i++)
		{
			if (list.get(i).getId() == id)
			{
				return i;
			}
		}
		return null; */
}