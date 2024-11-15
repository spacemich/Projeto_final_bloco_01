package produto.model;

public class ProdutoPromocao extends Produto {

	private float promocao;

	public ProdutoPromocao(String nome, String tipo, float preço) {
		super(nome, tipo, preço);
		this.promocao = promocao;
	}

	public float getPromocao() {
		return promocao;
	}

	public void setPromocao(float promocao) {
		this.promocao = promocao;
	}

	@Override
	public float getPreço() {
		return this.getPreço() * 0.10f;
	}
}
