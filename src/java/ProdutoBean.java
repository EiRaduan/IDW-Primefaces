

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saimor
 */
@Named
@RequestScoped
public class ProdutoBean {
    private Produto produto = new Produto();
    private List<Produto> lista = null;
    
    public Produto getProduto(){
        return produto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public List<Produto> getList(){
        if(this.lista == null){
            ProdutoRN produtoRN = new ProdutoRN();
            this.lista = produtoRN.listar();
        }
        return this.lista;
    }
    
    public void salvar(){
        FacesContext context= FacesContext.getCurrentInstance();
        try{
            ProdutoRN produtoRN = new ProdutoRN();
            produtoRN.salvar(this.produto);
            this.produto = new Produto();
            this.lista = null;
        } catch(Exception e){
            FacesMessage facesMessage = new FacesMessage (FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage());
            context.addMessage(null, facesMessage);
        }
    }
    
    public void excluir(){
        FacesContext context = FacesContext.getCurrentInstance();
        try{
            ProdutoRN produtoRN = new ProdutoRN();
            produtoRN.excluir(this.produto);
            this.produto = new Produto();
            this.lista = null;            
        } catch (Exception e){
            FacesMessage facesMessage = new FacesMessage (FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getMessage());
            context.addMessage(null, facesMessage);
        }
    }
    
}
