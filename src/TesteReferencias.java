
public class TesteReferencias {
	
	public static void main(String[] args) {
		
//		Funcionario gerente = new Gerente();
		Gerente gerente = new Gerente();
		
		gerente.setNome("Victor Rodrigues Mercado Libre");
		String nome = gerente.getNome();
		
		gerente.setSalario(5000);
		
		//A partir do momento que a classe funcion�rio � marcada como abstract, n�o ser� poss�vel
		//criar um funcion�rio
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
