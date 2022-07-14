package Cinema;

import java.util.ArrayList;
import java.util.Objects;

public class Cinema {
	
	private ArrayList<Cliente> clientes;
	private Cliente c;
	
	public Cinema(Cliente c) {
		this.clientes = new ArrayList<Cliente>();
		this.c = c;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Cinema other = (Cinema) obj;
		if (!Objects.equals(this.c.cpf, other.c.cpf)) {
			return false;
		}
		if (!Objects.equals(this.c, other.c)) {
			return false;
		}
		return true;
	}
	
	public void adicionaCliente(Cliente c) {
		clientes.add(c);
	}

	public void removeCliente(Cliente c) {
		clientes.remove(c);
	}

}
