
public class TesteFuncionario {
	
	public static void main(String[] args) {
		

		//A partir do momento que a classe funcion�rio � marcada como abstract, n�o ser� poss�vel
		//criar um funcion�rio
		
//		Funcionario nico = new Funcionario();
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("22235955-8");
		nico.setSalario(2590.8);
		
		System.out.println("A bonifica��o do funcion�rio �: " + nico.getBonificacao());
		System.out.println(nico.getNome());
	}
}
