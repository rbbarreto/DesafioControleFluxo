package desafio;

public class ParametrosInvalidosExcption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8294293073836938108L;

	public ParametrosInvalidosExcption() {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}
	
}
