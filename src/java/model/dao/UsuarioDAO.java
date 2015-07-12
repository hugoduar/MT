/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.util.List;
import model.Usuario;
/**
 *
 * @author Hugo
 */
public interface UsuarioDAO {
    
    /**
     * Crea un Usuario dentro de la base de datos con una instancia de Usuario
     *
     * @param usuario
     */
    public void create(Usuario usuario);

    /**
     *  
     * @param newest
     * @return
     */
    public Usuario update(Usuario newest);

    /**
     *  
     * @param usuario
     */
    public void delete(Usuario usuario);

    /**
     *
     * @param usuario
     * @return
     */
    public Usuario find(Usuario usuario);

    /**
     *
     * @return 
     * 
     */
    public List<Usuario> findAll();
    
    
    //Metodos secundarios

    /**
     *
     * @param idUsuario
     */
        public void delete(int idUsuario);

    /**
     *
     * @param idUsuario
     * @param idFoto
     * @return Regresa el usuario nuevo
     */
    public Usuario updateFoto(int idUsuario, int idFoto);

    /**
     *  Encontrar a un usuario por ID
     * @param idUsuario
     * @return
     */
    public Usuario findById(int idUsuario);
    
    
}
