package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * DGrUa generated by hbm2java
 */
public class DGrUa  implements java.io.Serializable {


     private Integer idDGrUa;
     private int idGrupo;
     private int idUniAprend;

    public DGrUa() {
    }

    public DGrUa(int idGrupo, int idUniAprend) {
       this.idGrupo = idGrupo;
       this.idUniAprend = idUniAprend;
    }
   
    public Integer getIdDGrUa() {
        return this.idDGrUa;
    }
    
    public void setIdDGrUa(Integer idDGrUa) {
        this.idDGrUa = idDGrUa;
    }
    public int getIdGrupo() {
        return this.idGrupo;
    }
    
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public int getIdUniAprend() {
        return this.idUniAprend;
    }
    
    public void setIdUniAprend(int idUniAprend) {
        this.idUniAprend = idUniAprend;
    }




}

