package Cinema;

public class IngressoPlatinum extends Ingresso{
	public static final double DESC_PLATINUM = 0.12;
	
	public IngressoPlatinum(int data, String filme, int sala, double horario, double valorIngresso) {
		super(data, filme, sala, horario, valorIngresso);
	}
	
	public double calculaIngresso() {
		return getValorIngresso() * DESC_PLATINUM;
	}
}
