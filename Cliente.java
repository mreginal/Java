package Cinema;

public class Cliente {
	
	private String nomeP;
	protected int cpf;
	private int cartao;
	private int quantidade;
	
	public Cliente(String nomeP, int cpf, int cartao, int quantidade) {
		this.setCartao(cartao);
		this.setCpf(cpf);
		this.setNomeP(nomeP);
		this.setQuantidade(quantidade);
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCartao() {
		return cartao;
	}

	public void setCartao(int cartao) {
		this.cartao = cartao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
@Override
	public String toString() {
		return "Cliente [nomeP=" + nomeP + ", cpf=" + cpf + ", cartao=" + cartao + ", quantidade=" + quantidade + "]";
	}
}
