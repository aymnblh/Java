/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tc;

import java.beans.*;
import java.io.Serializable;


public class Enseignant implements Serializable {

    public Enseignant() {
    }
    
  private int matricule;
  private String pwd;

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }


    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getMatricule() {
        return matricule;
    }
}
