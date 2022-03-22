
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saimor
 */
public class ProdutoRN {
    
    private ProdutoDAO produtoDAO;
    
    public ProdutoRN(){
        this.produtoDAO = DAOFactory.criarProdutoDAO();
    }
    
    public List<Produto> lista(){
        return this.produtoDAO.lista();
    }
    
    public void salvar(Produto produto){
        this.produtoDAO.salvar(produto);
    }
    
    public void excluir(Produto produto){
        this.produtoDAO.excluir(produto);
    }
}
