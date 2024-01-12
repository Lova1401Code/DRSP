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
public class AffectationModele {
    private String idAf;
    private String imPers;
    private String dateAffect;
    private String serviceAf;
    private String fonctionAf;
    private String localite;
    private String priseServ;
    public String getIdAf(){
        return this.idAf;
    }
    public void setIdAf(String idAf){
        this.idAf = idAf;
    }
    public String getImPers(){
        return this.imPers;
    }
    public void setImPers(String imPers){
        this.imPers = imPers;
    }
    public String getDateAffect(){
        return this.dateAffect;
    }
    public void setDateAffect(String dateAffect){
        this.dateAffect = dateAffect;
    }
    public String getServiceAf(){
        return this.serviceAf;
    }
    public void setServiceAf(String serviceAf){
        this.serviceAf = serviceAf;
    }
    public String getFonctionAf(){
        return this.fonctionAf;
    }
    public void setFonctionAF(String fonctionAf){
        this.fonctionAf = fonctionAf;
    }
    public String getLocalite(){
        return this.localite;
    }
    public void setLocalite(String localite){
        this.localite = localite;
    }
    public String getPriseServ(){
        return this.priseServ;
    }
    public void setPriseServ(String priseServ){
        this.priseServ = priseServ;
    }
}
