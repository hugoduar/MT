package model;
// Generated 11-jul-2015 1:33:51 by Hibernate Tools 4.3.1



/**
 * Foto generated by hbm2java
 */
public class Foto  implements java.io.Serializable {


     private Integer idFoto;
     private byte[] url;

    public Foto() {
    }

    public Foto(byte[] url) {
       this.url = url;
    }
   
    public Integer getIdFoto() {
        return this.idFoto;
    }
    
    public void setIdFoto(Integer idFoto) {
        this.idFoto = idFoto;
    }
    public byte[] getUrl() {
        return this.url;
    }
    
    public void setUrl(byte[] url) {
        this.url = url;
    }




}


