
public class TesteFuncionario {
	
	public static void main(String[] args) {
		

		//A partir do momento que a classe funcionário é marcada como abstract, não será possível
		//criar um funcionário
		
//		Funcionario nico = new Funcionario();
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("22235955-8");
		nico.setSalario(2590.8);
		
		System.out.println("A bonificação do funcionário é: " + nico.getBonificacao());
		System.out.println(nico.getNome());
	}
}
