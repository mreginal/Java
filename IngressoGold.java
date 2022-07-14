package Cinema;

public class IngressoGold extends Ingresso{
	public static final double DESC_GOLD = 0.08;
	
	public IngressoGold(int data, String filme, int sala, double horario, double valorIngresso) {
		super(data, filme, sala, horario, valorIngresso);
	}
	
	public double calculaIngresso() {
		return getValorIngresso() * DESC_GOLD;
	}
}
