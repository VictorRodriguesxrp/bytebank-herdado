
public class TesteSistema {
	
	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		
		gerente.setSenha(2222);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		sistemaInterno.autentica(gerente);
		
		Administrador adm = new Administrador();
		
		adm.setSenha(3333);
		
		sistemaInterno.autentica(adm);
		
		Cliente cliente = new Cliente();
		
		cliente.setSenha(2222);
		
		sistemaInterno.autentica(cliente);
		
		
	}
}
