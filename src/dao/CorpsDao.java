/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.CorpsModele;
import view.ConcourDirView;

/**
 *
 * @author Ramih
 */
public class CorpsDao {
    public void insertionCorps(CorpsModele corps) {
        String sql ="INSERT INTO corps(corps, description) VALUES ('"+corps.getNomCorps()+"', '"+corps.getDesCorps()+"')"; 
	AccesBdd accesBdd = new AccesBdd();
	accesBdd.loadDriver();
	accesBdd.executeUpdate(sql);
	accesBdd.closeConnection();
    }
    public void modifierCorps(CorpsModele corps) {
        String sql ="UPDATE corps SET corps='"+corps.getNomCorps()+"', description='"+corps.getDesCorps()+"' WHERE idC='"+corps.getIdCorps()+"'"; 
	AccesBdd accesBdd = new AccesBdd();
	accesBdd.loadDriver();
	accesBdd.executeUpdate(sql);
	accesBdd.closeConnection();
    }
    public void supprConge(CorpsModele corps){
        String sql3 = "delete from corps where idC ='"+corps.getIdCorps()+"'";
        AccesBdd bdd3 = new AccesBdd();
        bdd3.loadDriver();
        bdd3.executeUpdate(sql3);
        bdd3.closeConnection();
    }
}
