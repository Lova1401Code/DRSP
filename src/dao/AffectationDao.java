/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import modele.AffectationModele;

/**
 *
 * @author Ramih
 */
public class AffectationDao {
    public void insertionAffectation(AffectationModele affect){
        String sql;
        sql = "INSERT INTO affectation(imPers, dateAffect, serviceAf, fonctionAf, localite, priseServ) VALUES ('"+affect.getImPers()+"', '"+affect.getDateAffect()+"', '"+affect.getServiceAf()+"', '"+affect.getFonctionAf()+"', '"+affect.getLocalite()+"', '"+affect.getPriseServ()+"')";
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        bdd.executeUpdate(sql);
        bdd.closeConnection();
    }
    public void updateAffectation(AffectationModele affect){
        String sql2 ="UPDATE affectation SET imPers='"+affect.getImPers()+"', dateAffect='"+affect.getDateAffect()+"', serviceAf='"+affect.getServiceAf()+"', fonctionAf='"+affect.getFonctionAf()+"', localite='"+affect.getLocalite()+"', priseServ='"+affect.getPriseServ()+"' WHERE idAf='"+affect.getIdAf()+"'";
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        bdd.executeUpdate(sql2);
        bdd.closeConnection();
    }
    public void supprAffectaion(AffectationModele affect){
        String sql3 = "delete from affectation where idAf ='"+affect.getIdAf()+"'";
        AccesBdd bdd3 = new AccesBdd();
        bdd3.loadDriver();
        bdd3.executeUpdate(sql3);
        bdd3.closeConnection();
    }
}
