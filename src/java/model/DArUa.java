package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * DArUa generated by hbm2java
 */
public class DArUa  implements java.io.Serializable {


     private Integer idDArUa;
     private int idArea;
     private int idUniAprend;

    public DArUa() {
    }

    public DArUa(int idArea, int idUniAprend) {
       this.idArea = idArea;
       this.idUniAprend = idUniAprend;
    }
   
    public Integer getIdDArUa() {
        return this.idDArUa;
    }
    
    public void setIdDArUa(Integer idDArUa) {
        this.idDArUa = idDArUa;
    }
    public int getIdArea() {
        return this.idArea;
    }
    
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    public int getIdUniAprend() {
        return this.idUniAprend;
    }
    
    public void setIdUniAprend(int idUniAprend) {
        this.idUniAprend = idUniAprend;
    }




}


