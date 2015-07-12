

package model.dao;

import java.util.List;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class UsuarioDAOController implements UsuarioDAO{
    
    Transaction transaction = null;
    Session session;

    @Override
    public void create(Usuario usuario) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Usuario oldest = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            oldest = (Usuario) session.get(Usuario.class, usuario.getIdUsuario());
            session.delete(oldest);
            transaction.commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
        }
    }

    @Override
    public Usuario find(Usuario usuario) {
        Usuario found = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            found = (Usuario) session.get(Usuario.class, usuario.getIdUsuario());
            session.getTransaction().commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
            return found;
        }
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listUsuario  = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            listUsuario = session.createCriteria(Usuario.class).list();
            if(!listUsuario.isEmpty()) return listUsuario;
            return null;
        }catch(Exception e){
            return null;
        }finally{
            session.flush();
            session.close();
        }
    }

    @Override
    public Usuario update(Usuario newest) {
        Usuario oldest = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            oldest = (Usuario) session.get(Usuario.class, newest.getIdUsuario());
            oldest.copy(newest);
            session.update(oldest);
            transaction.commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
            return oldest;
        }
    }

    @Override
    public void delete(int idUsuario) {
        Usuario oldest = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            oldest = (Usuario) session.get(Usuario.class, idUsuario);
            session.delete(oldest);
            transaction.commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
        }
    }

    @Override
    public Usuario updateFoto(int idUsuario, int idFoto) {
        Usuario usuario = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            usuario = (Usuario) session.get(Usuario.class, idUsuario);
            usuario.setIdFoto(idFoto);
            session.update(usuario);
            transaction.commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.close();
            return usuario;
        }
    }

    @Override
    public Usuario findById(int idUsuario) {
        Usuario found = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            found = (Usuario) session.get(Usuario.class, idUsuario);
            session.getTransaction().commit();
        }catch(RuntimeException e){
            if (transaction != null) {
                transaction.rollback();
            }
        }finally{
            session.flush();
            session.close();
            return found;
        }
    }

}
