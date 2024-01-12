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
public class GradeModele {
    private String grade;
    private String descGrade;
    private String idGrade;
    public String getIdGrade(){
          return idGrade;
      }
    public void setIdGrade(String idG){
          this.idGrade = idG;
      }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getDescGrade(){
        return descGrade;
    }
    public void setDescGrade(String description){
        this.descGrade = description;
    }
}
