package produto.model;

public abstract class Produto {
	private String nome;
	private String tipo;
	private float preço;

	public Produto(String nome, String tipo, float preço) {
		this.nome = nome;
		this.tipo = tipo;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public void visualizar() {

		String tipo = "";
		
		/*private String nome;
		private String tipo;
		private float preço;*/
		System.out.println("\n\n***********************************************************");
		System.out.println("Informações do produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Tipo de produto: " + this.tipo);
		System.out.println("valor: " + preço);

	}

}
