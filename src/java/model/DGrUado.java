package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * DGrUado generated by hbm2java
 */
public class DGrUado  implements java.io.Serializable {


     private Integer idDGrUado;
     private int idDGrUa;
     private int idEmpleado;

    public DGrUado() {
    }

    public DGrUado(int idDGrUa, int idEmpleado) {
       this.idDGrUa = idDGrUa;
       this.idEmpleado = idEmpleado;
    }
   
    public Integer getIdDGrUado() {
        return this.idDGrUado;
    }
    
    public void setIdDGrUado(Integer idDGrUado) {
        this.idDGrUado = idDGrUado;
    }
    public int getIdDGrUa() {
        return this.idDGrUa;
    }
    
    public void setIdDGrUa(int idDGrUa) {
        this.idDGrUa = idDGrUa;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }




}

