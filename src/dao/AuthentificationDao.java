/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.AdminModele;

/**
 *
 * @author Ramih
 */
public class AuthentificationDao {
    public boolean verificationUser (AdminModele admin) throws SQLException{
		boolean validation=false;
		String sql = "SELECT * FROM admin WHERE pseudo='"+admin.getUserName()+"' AND password='"+admin.getPassword()+"'";
		AccesBdd accesBdd = new AccesBdd();
		accesBdd.loadDriver();
		ResultSet resultat = accesBdd.executeSelect(sql);
		while (resultat.next()){
			validation = true;
		}
		
		return validation;
	}
}
