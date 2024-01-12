/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.CandidatModele;

/**
 *
 * @author Ramih
 */
public class CandidatDao {
    public void insertionCandidat(CandidatModele candidat){
            String sql ="INSERT INTO candidat(numOrdre, nom_Cand, prenom_Cand, dateNaisCand, lieuNais_Cand, pere_Cand, profession_Pere, mere_Cand, profession_Mere, sexe, sit_famille, nbrEnfant_Cand, numCin_Cand, dateDeliv_Cand, lieuDeliv_Cand, duplicata_Cand, lieuDuplicat_Cand, sitMil_Cand, signePart_Cand, adresse_Cand, numTel_Cand, dipEtOp_Cand, anneEtLieu, certificatEtDis, anneEtCentre, corps_Cand, grade_Cand, service_Cand, centreExam_Cand, droit_Cand, taille_Cand, spec_Cand, dateDep_Cand, numDep_Cand, observation) VALUES ('"+candidat.getNumOrdre()+"', '"+candidat.getNomCand()+"', '"+candidat.getPrenomCand()+"', '"+candidat.getDateNaisCand()+"', '"+candidat.getLieuDelivCand()+"', '"+candidat.getPereCand()+"', '"+candidat.getProfPere()+"', '"+candidat.getMereCand()+"', '"+candidat.getProfMere()+"', '"+candidat.getSexeCand()+"', '"+candidat.getSitFamCand()+"', '"+candidat.getNbrEnfCand()+"', '"+candidat.getNumCinCand()+"', '"+candidat.getDateDelivCand()+"', '"+candidat.getLieuDelivCand()+"', '"+candidat.getDuplicataCand()+"', '"+candidat.getLieuDupCand()+"', '"+candidat.getSitMilCand()+"', '"+candidat.getSignePartCand()+"', '"+candidat.getAdresseCand()+"', '"+candidat.getNumTelCand()+"', '"+candidat.getDipEtOp()+"', '"+candidat.getAnneEtLieu()+"', '"+candidat.getCertEtDis()+"', '"+candidat.getAnneeEtCentre()+"', '"+candidat.getCorpsCand()+"', '"+candidat.getGradeCand()+"', '"+candidat.getServiceCand()+"', '"+candidat.getCentreExamen()+"', '"+candidat.getDroitCand()+"', '"+candidat.getTailleCand()+"', '"+candidat.getSpecCand()+"', '"+candidat.getDateDep()+"', '"+candidat.getNumDep()+"', '"+candidat.getObservation()+"')";
            AccesBdd bdd = new AccesBdd();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
    try{
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateCandidat(CandidatModele candidat){
        String sql ="UPDATE candidat SET  numOrdre='"+candidat.getNumOrdre()+"', nom_Cand='"+candidat.getNomCand()+"', prenom_Cand='"+candidat.getPrenomCand()+"', dateNaisCand='"+candidat.getDateNaisCand()+"', lieuNais_Cand='"+candidat.getLieuNaisCand()+"', pere_Cand='"+candidat.getPereCand()+"', profession_Pere='"+candidat.getProfPere()+"', mere_Cand='"+candidat.getMereCand()+"', profession_Mere='"+candidat.getProfMere()+"', sexe='"+candidat.getSexeCand()+"', sit_famille='"+candidat.getSitFamCand()+"', nbrEnfant_Cand='"+candidat.getNbrEnfCand()+"', numCin_Cand='"+candidat.getNumCinCand()+"', dateDeliv_Cand='"+candidat.getDateDelivCand()+"', lieuDeliv_Cand='"+candidat.getLieuDelivCand()+"', duplicata_Cand='"+candidat.getDuplicataCand()+"', lieuDuplicat_Cand='"+candidat.getLieuDupCand()+"', sitMil_Cand='"+candidat.getSitMilCand()+"', signePart_Cand='"+candidat.getSignePartCand()+"', adresse_Cand='"+candidat.getAdresseCand()+"', numTel_Cand='"+candidat.getNumTelCand()+"', dipEtOp_Cand='"+candidat.getDipEtOp()+"', anneEtLieu='"+candidat.getAnneEtLieu()+"', certificatEtDis='"+candidat.getCertEtDis()+"', anneEtCentre='"+candidat.getAnneeEtCentre()+"', corps_Cand='"+candidat.getCorpsCand()+"', grade_Cand='"+candidat.getGradeCand()+"', service_Cand='"+candidat.getServiceCand()+"', centreExam_Cand='"+candidat.getCentreExamen()+"', droit_Cand='"+candidat.getDroitCand()+"', taille_Cand='"+candidat.getTailleCand()+"', spec_Cand='"+candidat.getSpecCand()+"', dateDep_Cand='"+candidat.getDateDep()+"', numDep_Cand='"+candidat.getNumDep()+"', observation='"+candidat.getObservation()+"' WHERE idCand='"+candidat.getIdCand()+"'"; 
	AccesBdd accesBdd = new AccesBdd();
	accesBdd.loadDriver();
	accesBdd.executeUpdate(sql);
	accesBdd.closeConnection();
    }
    public void updateNumDefEcpd(CandidatModele cand){
        String sql = "update candidat set numDefEcpd='"+cand.getNumDef()+"' where idCand = '"+cand.getIdCand()+"'";
        AccesBdd accesBdd = new AccesBdd();
	accesBdd.loadDriver();
	accesBdd.executeUpdate(sql);
	accesBdd.closeConnection();
    }
}
