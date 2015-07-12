
package util;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConf {
     /*p
     * Configuracion para la conexion a la base de datos
     * "MYSQL"
     */
    public String dbMysql;
    public String hostMysql;
    public String userMysql;
    public String pwdMysql;
    public int portMysql;
    public DBConf() {
        try {
            this.dbMysql = "MyTime";
            this.hostMysql = "localhost";
            this.userMysql = "root";
            this.pwdMysql = "n0m3l0";
            this.portMysql = 3306;
           } catch (Exception ex) {
            Logger.getLogger(DBConf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Connection getMysqlCon() throws ClassNotFoundException, SQLException{
        Connection con = null;
        //DefaultConfig
	String URL = "jdbc:mysql://"+this.hostMysql+":"+String.valueOf(this.portMysql)+"/"+this.dbMysql;      
         //DefaultConfig
        Class.forName("com.mysql.jdbc.Driver");                 
        con = (Connection) DriverManager.getConnection(URL,this.userMysql,this.pwdMysql);
        return con;
    }
}
