package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * AlumnoId generated by hbm2java
 */
public class AlumnoId  implements java.io.Serializable {


     private int boleta;
     private int idcCarrera;
     private int idplanEstudios;

    public AlumnoId() {
    }

    public AlumnoId(int boleta, int idcCarrera, int idplanEstudios) {
       this.boleta = boleta;
       this.idcCarrera = idcCarrera;
       this.idplanEstudios = idplanEstudios;
    }
   
    public int getBoleta() {
        return this.boleta;
    }
    
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    public int getIdcCarrera() {
        return this.idcCarrera;
    }
    
    public void setIdcCarrera(int idcCarrera) {
        this.idcCarrera = idcCarrera;
    }
    public int getIdplanEstudios() {
        return this.idplanEstudios;
    }
    
    public void setIdplanEstudios(int idplanEstudios) {
        this.idplanEstudios = idplanEstudios;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlumnoId) ) return false;
		 AlumnoId castOther = ( AlumnoId ) other; 
         
		 return (this.getBoleta()==castOther.getBoleta())
 && (this.getIdcCarrera()==castOther.getIdcCarrera())
 && (this.getIdplanEstudios()==castOther.getIdplanEstudios());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBoleta();
         result = 37 * result + this.getIdcCarrera();
         result = 37 * result + this.getIdplanEstudios();
         return result;
   }   


}

