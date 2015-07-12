package test;

import model.Usuario;
import model.dao.UsuarioDAO;
import model.dao.UsuarioDAOController;
import util.UserUtil;


public class TestUsuarioDAO {
    public static void main(String [] args){
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        //Creas un objeto UsuarioDAO y lo implementas con UsuarioDAOController
        //para poder manejar todo lo que este dentro de Usuario en la base
        UsuarioDAO ud = new UsuarioDAOController();
        Usuario u = new Usuario();
        u = ud.findById(2012);

        
        
        
        
        
        
        
        UserUtil uu = new UserUtil();
        System.out.println(uu.validCredentials(1, "DUMJ950328HDFRRS00"));
        System.out.println(uu.userRole(1));
       
        
        
        
        
        
        
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        //----------------------------------------
        
        
    }

}
