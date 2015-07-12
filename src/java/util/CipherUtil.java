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

public class CipherUtil {
        
        public static String decrypt(byte[] encrypted){
            String decrypted = "";
            try {
                DBConf conf = new DBConf();
                Connection con = conf.getMysqlCon();
                PreparedStatement ps = con.prepareStatement("SELECT AES_DECRYPT(?, '3st03sc3rb3roske') AS Password");
                ps.setBytes(1, encrypted);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    decrypted = rs.getString("Password");
                }
                rs.close();
                ps.close();
                con.close();
                return decrypted;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CipherUtil.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CipherUtil.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                return decrypted;
            }
        
        }
        public static byte[] encrypt(String decrypted){
            byte[] encrypted = null;
            try {
                DBConf conf = new DBConf();
                Connection con = conf.getMysqlCon();
                PreparedStatement ps = con.prepareStatement("SELECT AES_ENCRYPT(?, '3st03sc3rb3roske') AS Password");
                ps.setString(1, decrypted);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    encrypted = rs.getBytes(1);
                }
                rs.close();
                ps.close();
                con.close();
                return encrypted;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CipherUtil.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CipherUtil.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                return encrypted;
            }
        
        }

}
