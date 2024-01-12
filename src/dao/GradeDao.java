/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import modele.GradeModele;

/**
 *
 * @author Ramih
 */
public class GradeDao {
    public void insertionGrade(GradeModele grade){
        String sql = "INSERT INTO grade(grade, descGrade) VALUES ('"+grade.getGrade()+"', '"+grade.getDescGrade()+"')";
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        bdd.executeUpdate(sql);
        bdd.closeConnection();
    }
    public void modifierGrade(GradeModele grade) {
        String sql ="UPDATE grade SET grade='"+grade.getGrade()+"', descGrade='"+grade.getDescGrade()+"' WHERE idG='"+grade.getIdGrade()+"'"; 
	AccesBdd accesBdd = new AccesBdd();
	accesBdd.loadDriver();
	accesBdd.executeUpdate(sql);
	accesBdd.closeConnection();
    }
    public void supprGrade(GradeModele grade){
        String sql3 = "delete from grade where idG ='"+grade.getIdGrade()+"'";
        AccesBdd bdd3 = new AccesBdd();
        bdd3.loadDriver();
        bdd3.executeUpdate(sql3);
        bdd3.closeConnection();
    }
}
