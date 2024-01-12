/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import modele.CongeModele;

/**
 *
 * @author Ramih
 */
public class CongeDao {
    public void insertionConge(CongeModele conge){
        String sql = "INSERT INTO conge(imPerso, dateDeb, dateFin, motif) VALUES ('"+conge.getImPerso()+"', '"+conge.getDatedeb()+"', '"+conge.getDateFin()+"', '"+conge.getMotif()+"')";
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        bdd.executeUpdate(sql);
        bdd.closeConnection();
    }
    public void updateConge(CongeModele conge){
        String sql ="UPDATE conge SET imPerso='"+conge.getImPerso()+"', dateDeb='"+conge.getDatedeb()+"', dateFin='"+conge.getDateFin()+"', motif='"+conge.getMotif()+"' WHERE idConge='"+conge.getIdConge()+"'"; 
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        bdd.executeUpdate(sql);
        bdd.closeConnection();
    }
    public void supprConge(CongeModele conge){
        String sql3 = "delete from conge where idConge ='"+conge.getIdConge()+"'";
        AccesBdd bdd3 = new AccesBdd();
        bdd3.loadDriver();
        bdd3.executeUpdate(sql3);
        bdd3.closeConnection();
    }
}
