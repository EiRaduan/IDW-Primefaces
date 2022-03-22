/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.List;

/**
 *
 * @author saimor
 */
public interface ProdutoDAO {
    public List<Produto> listar();
    
    public void salvar(Produto produto);
    
    public void excluir(Produto produto);        
}
