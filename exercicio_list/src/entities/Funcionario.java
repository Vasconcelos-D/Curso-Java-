package entities;

import java.util.List;

public class Funcionario
{
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(){}
	
	public Funcionario(Integer id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName(){return name;}

	public void setName(String name) {this.name = name;}

	public Integer getId() {return id;}

	public void setId(int id) {this.id = id;}

	//public double getSalary() {return salary;}

	public void setSalary(double salary) {this.salary = salary;}
	
	public void increasseSalary (double percentege) 
	{
		salary += salary * percentege / 100.0;
	}
	public String toString() {
		return id + ", " + name + ", "	+ String.format("%.2f" ,salary);
	}
	public static Integer position(List<Funcionario> list, int  id)// Foi criada uma função Auxiliar.
	{
		for(int i = 0 ; i < list.size() ; i++)
		{
			if (list.get(i).getId() == id)
			{
				return i;
			}
		}
		return null;
	}
}
