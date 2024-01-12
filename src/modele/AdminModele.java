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
public class AdminModele {
    private String userName;
    private String password;
    public String getUserName() {
		return userName;
	}
	public void setUserName(String login) {
		this.userName = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
