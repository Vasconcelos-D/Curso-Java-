package entities;

import java.util.Objects;

public class Client {

	private String name;
	private String Email;
	
	
	
	public Client(String name, String email) {
		this.name = name;
		this.Email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(name, other.name);
	}

	
	
}
