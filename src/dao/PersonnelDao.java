/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import modele.CandidatModele;
import modele.PersonnelModele;

/**
 *
 * @author Ramih
 */
public class PersonnelDao {
    public void insertionPersonnel(PersonnelModele perso){
            String sql ="INSERT INTO personnel(numPers, corpsPers, nomPers, prenomPers, sexePers, dateNaisPers, numCinPers, dateLivecin, lieuLiv, dateDup, adressePers, numTelPers, diplomePers, taillePers, prevenir, professionPers, imPers, gradePers, situation, observ, image, file) VALUES ('"+perso.getNumOrdre()+"', '"+perso.getCorpsPerso()+"', '"+perso.getNomPerso()+"', '"+perso.getPrenomPerso()+"', '"+perso.getSexePerso()+"', '"+perso.getDateNaisPerso()+"', '"+perso.getNumCinPerso()+"', '"+perso.getDateDelivPerso()+"', '"+perso.getLieuDelivPerso()+"', '"+perso.getDuplicataPerso()+"', '"+perso.getAdressePerso()+"', '"+perso.getNumTelPerso()+"', '"+perso.getDipPerso()+"', '"+perso.getTaille()+"', '"+perso.getPrevenir()+"', '"+perso.getProfession()+"', '"+perso.getIm()+"', '"+perso.getGradePerso()+"', '"+perso.getSituation()+"', '"+perso.getObservation()+"', '"+perso.getPhoto()+"', '"+perso.getFile()+"')";
            AccesBdd bdd = new AccesBdd();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
    }
}
