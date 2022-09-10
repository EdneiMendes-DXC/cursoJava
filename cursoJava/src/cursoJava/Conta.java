package cursoJava;

public class Conta implements Pessoa{
	private String nome;
	private String cpf;
	private int agencia;
	private int numeroDaConta;
	
	public Conta(String nome, String cpf, int agencia, int numeroDaConta) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
	}
	
	public String consultaConta() {
		return "A agencia e " + this.agencia + " e a conta e " + this.numeroDaConta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	@Override
	public String consultarCliente() {
		return "O cliente " + this.nome + ", possui o cpf  " + this.cpf; 
	
	}
}
