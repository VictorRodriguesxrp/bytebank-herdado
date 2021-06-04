
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel func) {
		boolean autenticou = func.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("autenticou com sucesso");
		} else {
			System.out.println("Invalid password");
		}
	}
}
