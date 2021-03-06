package modelo;

public class Produto {
	private String nome;
	private Float valor;
	private Integer quantidade;
	private Float resultado;
	
	public Produto (String nome, int quantidade, float valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.resultado = valor * quantidade;
	}
	
	public String toString() {
		return "Nome: " + nome + "; \n >Quantidade.: " + quantidade + "; \n >Pre�o: "
				+ valor + "; \n >Resultado: " + resultado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Float getResultado() {
		return resultado;
	}
	public void setResultado(Float resultado) {
		this.resultado = resultado;
		this.resultado = quantidade*valor;
	}
	public Float getResultados() {
		return resultado;
	}
	
	}
	