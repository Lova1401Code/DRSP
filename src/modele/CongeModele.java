/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Ramih
 */
public class CongeModele {
    private String idConge;
    private String imPerso;
    private String dateDeb;
    private String dateFin;
    private String motif;
    public String getIdConge(){
        return this.idConge;
    }
    public void setIdConge(String idConge){
        this.idConge = idConge;
    }
    public String getImPerso(){
        return this.imPerso;
    }
    public void setImPerso(String imPerso){
        this.imPerso = imPerso;
    }
    public String getDatedeb(){
        return this.dateDeb;
    }
    public void setDateDeb(String dateDeb){
        this.dateDeb = dateDeb;
    }
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }
    public String getMotif(){
        return this.motif;
    }
    public void setMotif(String motif){
        this.motif = motif;
    }
}
