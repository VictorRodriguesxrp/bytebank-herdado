
public class TesteReferencias {
	
	public static void main(String[] args) {
		
//		Funcionario gerente = new Gerente();
		Gerente gerente = new Gerente();
		
		gerente.setNome("Victor Rodrigues Mercado Libre");
		String nome = gerente.getNome();
		
		gerente.setSalario(5000);
		
		//A partir do momento que a classe funcionário é marcada como abstract, não será possível
		//criar um funcionário
		//Funcionario funcionario = new Funcionario();
		//funcionario.setSalario(2000);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(gerente);
		//controleBonificacao.registra(funcionario);
		controleBonificacao.registra(editor);
		controleBonificacao.registra(designer);
		
		System.out.println(controleBonificacao.getSoma());
		
	}
}
