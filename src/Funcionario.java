
//Não pode instanciar objetos dessa classe
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//protected double salario -> atributos protegidos só são visíveis para os filhos da classe
	
	//São sem uma implementação, os filhos precisam implementar
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
