package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * PlanEstudios generated by hbm2java
 */
public class PlanEstudios  implements java.io.Serializable {


     private Integer idplanEstudios;
     private String nombre;

    public PlanEstudios() {
    }

    public PlanEstudios(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getIdplanEstudios() {
        return this.idplanEstudios;
    }
    
    public void setIdplanEstudios(Integer idplanEstudios) {
        this.idplanEstudios = idplanEstudios;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


