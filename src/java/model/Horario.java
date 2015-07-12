package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Horario generated by hbm2java
 */
public class Horario  implements java.io.Serializable {


     private Integer idHorario;
     private int idDGrUa;
     private int idDia;
     private Date inicio;
     private Date fin;
     private int idSemestre;

    public Horario() {
    }

    public Horario(int idDGrUa, int idDia, Date inicio, Date fin, int idSemestre) {
       this.idDGrUa = idDGrUa;
       this.idDia = idDia;
       this.inicio = inicio;
       this.fin = fin;
       this.idSemestre = idSemestre;
    }
   
    public Integer getIdHorario() {
        return this.idHorario;
    }
    
    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }
    public int getIdDGrUa() {
        return this.idDGrUa;
    }
    
    public void setIdDGrUa(int idDGrUa) {
        this.idDGrUa = idDGrUa;
    }
    public int getIdDia() {
        return this.idDia;
    }
    
    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }
    public Date getInicio() {
        return this.inicio;
    }
    
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    public Date getFin() {
        return this.fin;
    }
    
    public void setFin(Date fin) {
        this.fin = fin;
    }
    public int getIdSemestre() {
        return this.idSemestre;
    }
    
    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }




}


