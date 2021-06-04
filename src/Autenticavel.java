// interface é um contrato - "contrato autenticavel" neste caso
// quem assinar este contrato, precisa implementar
// metodo setSenha
// Metodo autentica

public abstract interface Autenticavel {

	public abstract boolean autentica(int senha);
	public abstract void setSenha(int senha);
	public abstract int getSenha();
}
