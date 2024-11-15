package produto.controller;
import java.util.ArrayList;
import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> ListarProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void criar(Produto produto) {
		ListarProdutos.add(produto);
		System.out.println("\nO produto: "+ produto.getNome() + " Foi criada com sucesso!");
	}

	@Override
	public void remover() {

	}

	@Override
	public void Listar() {
		for (var Produto : ListarProdutos) {
		Produto.visualizar();
		}
	}

	@Override
	public void criar() {
		
	}
}
