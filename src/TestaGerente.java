
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();

		gerente.setNome("Victor Rodrigues ML");
		
		System.out.println(gerente.getNome());
		
		gerente.setSenha(100);
		
		if (gerente.autentica(100)) {
			System.out.println("Usuário autenticado com sucesso!");
		} else {
			System.out.println("Invalid password");
		}
		
		gerente.setSalario(1500);
		
		System.out.println(gerente.getBonificacao());
	}
}
