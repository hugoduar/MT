package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * Disponible generated by hbm2java
 */
public class Disponible  implements java.io.Serializable {


     private Integer idDisponible;
     private int inicio;
     private int fin;

    public Disponible() {
    }

    public Disponible(int inicio, int fin) {
       this.inicio = inicio;
       this.fin = fin;
    }
   
    public Integer getIdDisponible() {
        return this.idDisponible;
    }
    
    public void setIdDisponible(Integer idDisponible) {
        this.idDisponible = idDisponible;
    }
    public int getInicio() {
        return this.inicio;
    }
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    public int getFin() {
        return this.fin;
    }
    
    public void setFin(int fin) {
        this.fin = fin;
    }




}


