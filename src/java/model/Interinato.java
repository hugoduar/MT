package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * Interinato generated by hbm2java
 */
public class Interinato  implements java.io.Serializable {


     private Integer idInterinato;
     private int maximo;
     private int minimo;

    public Interinato() {
    }

    public Interinato(int maximo, int minimo) {
       this.maximo = maximo;
       this.minimo = minimo;
    }
   
    public Integer getIdInterinato() {
        return this.idInterinato;
    }
    
    public void setIdInterinato(Integer idInterinato) {
        this.idInterinato = idInterinato;
    }
    public int getMaximo() {
        return this.maximo;
    }
    
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    public int getMinimo() {
        return this.minimo;
    }
    
    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }




}


