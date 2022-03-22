
import java.util.List;
import org.hibernate.Session;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saimor
 */
public class ProdutoDAOHibernate implements ProdutoDAO{
   private Session session;
 
   public void setSession(Session session){
       this.session = session;
   }
   
   public List<Produto> listar(){
       return this.session.createCriteria(Produto.class).list();
   }
   
   public void salvar(Produto produto){
       this.session.save(produto);
   }
   
   public void excluir(Produto produto){
       this.session.delete(produto);
   }
}
