
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil util;
	
	public Cliente() {
		 this.util = new AutenticacaoUtil();
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
