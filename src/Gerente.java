
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public int getSenha() {
		return this.util.getSenha();
	}
}
