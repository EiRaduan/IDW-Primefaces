
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saimor
 */
public class UsuarioRN {
    private UsuarioDAO usuarioDAO;
    
    public UsuarioRN(){
        this.usuarioDAO = DAOFactory.criarUsuarioDAO();
    }
    
    public Usuario carregar(Integer codigo){
        return this.usuarioDAO.carregar(codigo);
    }
    
    public Usuario buscarPorLogin(String login){
        return this.usuarioDAO.buscarPorLogin(login);
    }
    
    public void salvar(Usuario usuario){
        Integer codigo = usuario.getCodigo();
        if(codigo == null || codigo == 0){
            this.usuarioDAO.salvar(usuario);
        } else {
            this.usuarioDAO.atualizar(usuario);
        }
    }
    
    public void excluir(Usuario usuario){
        this.usuarioDAO.excluir(usuario);
    }
    
    public List<Usuario> listar(){
        return this.usuarioDAO.listar();
    }
}
