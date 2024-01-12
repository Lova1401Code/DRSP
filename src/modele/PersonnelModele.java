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
public class PersonnelModele {
    String numOrdre;
    String corpsPerso;
    String nomPerso;
    String prenomPerso;
    String sexePerso;
    String dateNaisPerso;
    String numCinPerso;
    String dateDelivPerso;
    String lieuDelivPerso;
    String duplicataPerso;
    String adressePerso;
    String numTelPerso;
    String dipPerso;
    String taille;
    String prevenir;
    String profession;
    String im;
    String gradePerso;
    String situation;
    String observation;
    byte[] photo;
    String file;
    
    public String getNumOrdre(){
        return this.numOrdre;
    }
    public void setNumOrdre(String numO){
        this.numOrdre = numO;
    }
     public String getCorpsPerso(){
        return this.corpsPerso;
    }
    public void setCorpsPerso(String corpsPerso){
        this.corpsPerso = corpsPerso;
    }
    public String getNomPerso(){
        return this.nomPerso;
    }
    public void setNomPerso(String nomPerso){
        this.nomPerso = nomPerso;
    }
    public String getPrenomPerso(){
        return this.prenomPerso;
    }
    public void setPrenomPerso(String prenomPerso){
        this.prenomPerso = prenomPerso;
    }
    public String getSexePerso(){
        return this.sexePerso;
    }
    public void setSexePerso(String sexePerso){
        this.sexePerso = sexePerso;
    }
    public String getDateNaisPerso(){
        return this.dateNaisPerso;
    }
    public void setDateNaisPerso(String dateNaisPerso){
        this.dateNaisPerso = dateNaisPerso;
    }
    public String getNumCinPerso(){
        return this.numCinPerso;
    }
    public void setNumCinPerso(String numCinPerso){
        this.numCinPerso = numCinPerso;
    }
    public String getDateDelivPerso(){
        return this.dateDelivPerso;
    }
    public void setDateDelivPerso(String dateDelivPerso){
        this.dateDelivPerso = dateDelivPerso;
    }
    public String getLieuDelivPerso(){
        return this.lieuDelivPerso;
    }
    public void setLieuDelivPerso(String lieuDelivPerso){
        this.lieuDelivPerso = lieuDelivPerso;
    }
    public String getDuplicataPerso(){
        return this.duplicataPerso;
    }
    public void setDuplicataPerso(String duplicataPerso){
        this.duplicataPerso = duplicataPerso;
    }
    public String getAdressePerso(){
        return this.adressePerso;
    }
    public void setAdressePerso(String adressePerso){
        this.adressePerso = adressePerso;
    }
    public String getNumTelPerso(){
        return this.numTelPerso;
    }
    public void setNumTelPerso(String numTelPerso){
        this.numTelPerso = numTelPerso;
    }
    public String getDipPerso(){
        return this.dipPerso;
    }
    public void setDipPerso(String dipPerso){
        this.dipPerso = dipPerso;
    }
    public String getTaille(){
        return this.taille;
    }
    public void setTaille(String taille){
        this.taille = taille;
    }
    public String getPrevenir(){
        return this.prevenir;
    }
    public void setPrevenir(String prevenir){
        this.prevenir = prevenir;
    }
    public String getProfession(){
        return this.profession;
    }
    public void setProfession(String profession){
        this.profession = profession;
    }
    public String getIm(){
        return this.im;
    }
    public void setIm(String im){
        this.im = im;
    }
    public String getGradePerso(){
        return this.gradePerso;
    }
    public void setGradePerso(String gradePerso){
        this.gradePerso = gradePerso;
    }
    public String getSituation(){
        return this.situation;
    }
    public void setSituation(String situation){
        this.situation = situation;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }

    public void setPhoto(byte[] photo) {
         this.photo = photo;
    }
    public byte[] getPhoto() {
         return photo;
    }
    public String getFile(){
        return this.file;
    }
    public void setFile(String file){
        this.file = file;
    }
}