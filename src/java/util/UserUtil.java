/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBConf;
public class UserUtil {
    
    public boolean validCredentials(int idUsuario, String password){
        boolean result = false;
        try {
            DBConf conf = new DBConf();
            Connection con = conf.getMysqlCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Usuario WHERE idUsuario=? && Pass=?");
            ps.setInt(1, idUsuario);
            ps.setBytes(2, CipherUtil.encrypt(password));
            ResultSet rs = ps.executeQuery();
            if(rs.next() == false) result = false;
            else result = true;
            rs.close();
            ps.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public int userRole(int idUsuario){
        
        int result = 0;
        try {
            DBConf conf = new DBConf();
            Connection con = conf.getMysqlCon();
            PreparedStatement ps = con.prepareStatement("SELECT idC_TipUs FROM Usuario WHERE idUsuario=?");
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               result= rs.getInt(1);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
