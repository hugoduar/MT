package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * DEmAr generated by hbm2java
 */
public class DEmAr  implements java.io.Serializable {


     private Integer idDEmAr;
     private int idArea;
     private int idEmpleado;

    public DEmAr() {
    }

    public DEmAr(int idArea, int idEmpleado) {
       this.idArea = idArea;
       this.idEmpleado = idEmpleado;
    }
   
    public Integer getIdDEmAr() {
        return this.idDEmAr;
    }
    
    public void setIdDEmAr(Integer idDEmAr) {
        this.idDEmAr = idDEmAr;
    }
    public int getIdArea() {
        return this.idArea;
    }
    
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }




}

