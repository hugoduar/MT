package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * Turno generated by hbm2java
 */
public class Turno  implements java.io.Serializable {


     private Integer idTurno;
     private String nombre;

    public Turno() {
    }

    public Turno(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getIdTurno() {
        return this.idTurno;
    }
    
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


